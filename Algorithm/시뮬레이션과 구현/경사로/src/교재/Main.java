package ����;

import java.util.*;
public class Main {
    static boolean go(int[] a, int l) {
        // �� �� �˻�
        int n = a.length;
        boolean[] c = new boolean[n];
        for (int i=1; i<n; i++) {
            if (a[i-1] != a[i]) {
                // ������ ĭ�� ���̰� �ٸ���, ���θ� ���ƾ� �Ѵ�.
                int diff = a[i]-a[i-1];
                if (diff < 0) diff = -diff;
                if (diff != 1) {
                    // ���� ĭ�� ���� ĭ�� ���� ���̴� 1�̾�� �Ѵ�.
                    return false;
                }
                if (a[i-1] < a[i]) {
                    for (int j=1; j<=l; j++) {
                        if (i-j < 0) {
                            // ���θ� ���ٰ� ������ ����� ���
                            return false;
                        }
                        if (a[i-1] != a[i-j]) {
                            // ���� ������ ĭ�� ���̰� ��� ���� �ʰų�, L���� ���ӵ��� ���� ���

                            return false;
                        }
                        if (c[i-j]) {
                            // ���θ� ���� ���� �� ���θ� ���� ���
                            return false;
                        }
                        c[i-j] = true;
                    }
                } else {
                    // a[i-1] > a[i]
                    for (int j=0; j<l; j++) {
                        if (i+j >= n) {
                            // ���θ� ���ٰ� ������ ����� ���
                            return false;
                        }
                        if (a[i] != a[i+j]) {
                            // ���� ������ ĭ�� ���̰� ��� ���� �ʰų�, L���� ���ӵ��� ���� ���

                            return false;
                        }
                        if (c[i+j]) {
                            // ���θ� ���� ���� �� ���θ� ���� ���
                            return false;
                        }
                        c[i+j] = true;
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int ans = 0;
        for (int i=0; i<n; i++) {
            // �� �˻�
            int[] d = new int[n];
            for (int j=0; j<n; j++) {
                d[j] = a[i][j];
            }
            if (go(d, l)) ans += 1;
        }
        for (int j=0; j<n; j++) {
            // �� �˻�
            int[] d = new int[n];
            for (int i=0; i<n; i++) {
                d[i] = a[i][j];
            }
            if (go(d, l)) ans += 1;
        }
        System.out.println(ans);
    }
}