package �����;
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
            if (go(index+1))//���������� �ε����� ������ false 
            	return true;//������ ���� �ε����� ����
            //�װ� true�� �ƿ� ����--> ���߿� ����
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
