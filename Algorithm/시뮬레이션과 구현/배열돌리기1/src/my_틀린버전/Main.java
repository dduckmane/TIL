package my_틀린버전;
//이런식으로 하면 한번만 변한다.
import java.util.Scanner;

public class Main {
	static int ans[][];
	static int n;
	static int m;
	public static void trans(int a[][],int r){
;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(i>=1&&i<=n/2&&j>=i+1&&j<=m) {
					ans[i][j-1]=a[i][j];
				}
				if(i>=1&&i<=n-1&&j==1) {
					ans[i+1][j]=a[i][j];
				}
				if(i>=(n+1)-n/2&&i<=n&&j>=i-n+1&&j<=m-1) {
					ans[i][j+1]=a[i][j];
				}
				if(i>=2&&i<=n&&j==m) {
					ans[i-1][j]=a[i][j];
				}
				
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		int r=sc.nextInt();
		int a[][]=new int[n+1][m+1];
		ans=new int[n+1][m+1];
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				a[i][j]=sc.nextInt();
			}
		}

		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				System.out.print(ans[i][j]);
				System.out.print(" ");
				
				if(j==m)System.out.println(" ");
			}
		}
	}

}
