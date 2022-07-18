import java.util.*;
public class Main {
    static int[][] s;
    static int n;
    static int go(int index, ArrayList<Integer> first, ArrayList<Integer> second) {
        if (index == n) {
            if (first.size() != n/2) return -1;
            if (second.size() != n/2) return -1;
            int t1 = 0;
            int t2 = 0;
            for (int i=0; i<n/2; i++) {
                for (int j=0; j<n/2; j++) {
                    if (i == j) continue;
                    t1 += s[first.get(i)][first.get(j)];
                    t2 += s[second.get(i)][second.get(j)];
                }
            }
            int diff = Math.abs(t1-t2);
            return diff;
        }
        int ans = -1;
        first.add(index);
        int t1 = go(index+1, first, second);//처음 함수에서 이부분에서 완료가 되고 밑으로 내려간다.
        
        if (ans == -1 || (t1 != -1 && ans > t1)) {
        	//(t1이 -1이면 안된다는 의미는 size가 넘어가서 -1이어서 안된다는 의미도 있지만
        	//마지막 호출을 제외한 나머지 함수들의 t1값이 -1이어서
        	//마지막 호출을 제외한 나머지 함수들은 영향을 주지 않기 위해서 설정해 놓은 것이다.
            ans = t1;
        }
        first.remove(first.size()-1);
       //여기서는 배열이 아니라 list이다.
        //list를 집어넣어주었기 때문에 고정값이 없다.
        //go(0,1)처럼 index==0이런게 아니니까 빠져야 한다.
        
        second.add(index);
        int t2 = go(index+1, first, second);
        if (ans == -1 || (t2 != -1 && ans > t2)) {
            ans = t2;
        }
        second.remove(second.size()-1);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        s = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                s[i][j] = sc.nextInt();
            }
        }
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();
        System.out.println(go(0, first, second));
    }
}