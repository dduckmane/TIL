import java.util.Scanner;

public class Main {
    static int n;
    static int p[][];
    static int d[][];
    static int go(int index,int sel) {
        if(index==n+1) {
            return 0;
        }
        if(d[index][sel]!=-1)return d[index][sel];
        int ans=100000000;
        for(int i=1;i<=3;i++) {
            if(sel==i)continue;
            int tmp=go(index+1,i)+p[index][i];
            if(tmp<ans)ans=tmp;
        }
        d[index][sel]=ans;
        return d[index][sel];
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        p=new int[n+1][4];
        d=new int[n+1][4];
        for(int i=1;i<=n;i++) {
            d[i][0] = -1;
            for(int j=1;j<=3;j++) {
                p[i][j]=sc.nextInt();
                d[i][j] = -1;
            }
        }

        System.out.println(go(1,0));
    }

}
