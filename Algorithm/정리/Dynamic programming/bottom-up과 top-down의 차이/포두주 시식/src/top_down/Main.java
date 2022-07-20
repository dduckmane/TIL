package top_down;


import java.util.Scanner;

public class Main {
    static int n;
    static int a[];
    static int d[][];
    public static int go(int index,int sel) {
        if(index == n) {
            return 0;
        }
        if(d[index][sel]!=-1)return d[index][sel];
        int t2=go(index+1,1);
        if(sel<3) {
            int t1=go(index+1,sel+1)+a[index];
            d[index][sel]=Math.max(t1, t2);
        }
        else {
            d[index][sel]=t2;
        }
        return d[index][sel];

    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a=new int[n+1];
        d=new int[n+1][4];
        for(int i=0;i<=n;i++) {
            for (int j=0; j<4; j++) {
                d[i][j]=-1;
            }
        }
        for(int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }
        System.out.println(go(0,1));
    }

}