package 맞춰봐;
import java.util.*;
public class Main {
    static int n;
    static int[][] sign;
    static int[] ans;
    static boolean ok() {
        for (int i=0; i<n; i++) {
            int sum = 0;
            for (int j=i; j<n; j++) {
                sum += ans[j];
                if (sign[i][j] == 0) {
                    if (sum != 0) return false;
                } else if (sign[i][j] > 0) {
                    if (sum <= 0) return false;
                } else if (sign[i][j] < 0) {
                    if (sum >= 0) return false;
                }
            }
        }
        return true;
    }
    static boolean go(int index) {
        if (index == n) {
            return ok();
        }
        for (int i=-10; i<=10; i++) {
            ans[index] = i;
            if (go(index+1))//마지막까지 인덱스가 안차면 false 
            	return true;//마지막 까지 인덱스가 차고
            //그게 true면 아예 종료--> 도중에 종료
        }
        return false;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ans = new int[n];
        sign = new int[n][n];
        String s = sc.next();
        int cnt = 0;
        for (int i=0; i<n; i++) {
            for (int j=i; j<n; j++) {
                char x = s.charAt(cnt);
                if (x == '0') {
                    sign[i][j] = 0;
                } else if (x == '+') {
                    sign[i][j] = 1;
                } else {
                    sign[i][j] = -1;
                }
                cnt += 1;
            }
        }
        go(0);
        for (int i=0; i<n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
}
