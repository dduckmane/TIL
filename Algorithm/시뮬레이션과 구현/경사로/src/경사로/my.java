package ����;
//�� ���ٷθ� �ߴ�.
import java.util.Scanner;

public class my {
	static boolean check[][];
	static int a[][];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=6;
		int c[]=new int[n];
		for(int i=0;i<n;i++) {
			c[i]=sc.nextInt();
		}
		boolean ch[]=new boolean[n];
		boolean ok=true;
		for(int i=0;i<n-1;i++) {
			
			if(c[i]==c[i+1])ok=true;
			else {
				if
					(i+2<n&&c[i]==c[i+1]+1&&c[i+2]==c[i+1]) {
					if(ch[i+1]==ch[i+2]==false) {
						ch[i+1]=ch[i+2]=true;
						ok=true;
					}
				}
				else if
					(i-1>=0&&c[i]+1==c[i+1]&&c[i]==c[i-1]) {
					if(ch[i]==ch[i-1]==false) {
						ch[i]=ch[i-1]=true;
						ok=true;
					}
				}
				else {
					System.out.println("�Ұ���");
					ok=false;
					break;
				}
				
			}
		}
		if(ok)System.out.println("����");
		
	}

}
