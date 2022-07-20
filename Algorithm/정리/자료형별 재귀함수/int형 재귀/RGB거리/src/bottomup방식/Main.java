package bottomup¹æ½Ä;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int p[][]=new int[n+1][n+1];
		int d[][]=new int[n+1][n+1];
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				p[i][j]=sc.nextInt();
			}
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				d[i][j]=1000000;
				for(int k=1;k<=n;k++) {
					if(k==j)continue;
						d[i][j]=Math.min(d[i][j],d[i-1][k]+p[i][j]);
				}
			}
		}
		System.out.println(Math.min(Math.min(d[n][3], d[n][1]),d[n][2]));
	}

}
