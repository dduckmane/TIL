package 퇴사;
import java.util.*;

public class Main {
    static final int inf = -100000000;
    static int[] t;
    static int[] p;
    static int n;
    static int ans = 0;
    static void go(int day, int sum) {
        if (day == n+1) {
            if (ans < sum) ans = sum;
            return;
        }
        if (day > n+1) {//1씩 증가되는 것이 아니므로 이 조건을 넣어줘야 한다.
            return;
        }
        go(day+1, sum);
        go(day+t[day], sum+p[day]);//index는 1씩커지는게 아니라 day단위씩 증가한다.
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        t = new int[n+1];
        p = new int[n+1];
        for (int i=1; i<=n; i++) {
            t[i] = sc.nextInt();
            p[i] = sc.nextInt();
        }
        go(1, 0);
        System.out.println(ans);
    }
}
