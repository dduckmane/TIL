package �κ�û�ұ�;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        int x = sc.nextInt();
        int y = sc.nextInt();
        int dir = sc.nextInt();
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int cnt = 0;
        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};
        // a[x][y] == 0 (û������ ���� ����)
        // a[x][y] == 1 (��)
        // a[x][y] == 2 (û���� ����)
        while (true) {
            if (a[x][y] == 0) {
                // 1. ���� ��ġ�� û���Ѵ�.
                a[x][y] = 2;
            }
            // 2-3, 2-4. �� ���� ��� û�Ұ� �̹� �Ǿ��ְų� ���� ���
            if (a[x+1][y] != 0 && a[x-1][y] != 0 && a[x][y-1] != 0 && a[x][y+1] != 0) {
                if (a[x-dx[dir]][y-dy[dir]] == 1) {
                    // 2-4. ���� ������ ���̶� ������ �� �� ���� ��쿡�� �۵��� �����.
                    break;
                } else {
                    // 2-3. �ٶ󺸴� ������ ������ ä�� �� ĭ ������ �ϰ� 2������ ���ư���.
                    x -= dx[dir];
                    y -= dy[dir];
                }
            } else {
                // 2-1. ���� ���⿡ ���� û������ ���� ������ �����Ѵٸ�, �� �������� ȸ���� ���� 
                // 2-2. ���� ���⿡ û���� ������ ���ٸ�, �� �������� ȸ���ϰ� 2������ ���ư���. 
                dir = (dir + 3) % 4;
                if (a[x+dx[dir]][y+dy[dir]] == 0) {
                    // 2-1. �� ĭ�� �����ϰ� 1������ �����Ѵ�.
                    x += dx[dir];
                    y += dy[dir];
                }
            }
        }
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (a[i][j] == 2) {
                    cnt += 1;
                }
            }
        }
        System.out.println(cnt);
    }
}