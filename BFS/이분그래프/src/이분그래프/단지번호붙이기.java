package 이분그래프;

import java.util.Scanner;

public class 단지번호붙이기 {
	static int a[][];
	static boolean check[][];
	static int ans=0;
	static void go(int i,int j) {
		if(i==0&&j==0) {
			if(a[i][j]==1)ans+=1;
		}
		if(a[i][j+1]==1&&check[i][j+1]==false) {
			check[i][j+1]=true;
			ans+=1;
			go(i,j+1);
		}
		if(a[i+1][j]==1&&check[i+1][j]==false) {
			check[i+1][j]=true;
			ans+=1;
			go(i+1,j);
		}
		if(a[i][j-1]==1&&check[i+1][j]==false) {
			check[i+1][j]=true;
			ans+=1;
			go(i+1,j);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		a=new int[n+1][n+1];
		check=new boolean[n+1][n+1];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		go(0,0);
		System.out.println(ans);
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(check[i][j]==true) {
					System.out.println(i+"다시"+j+"="+"true");
				}
			}
		}
	}

}
