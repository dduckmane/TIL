import java.util.Scanner;

public class Main {
	static int n;
	static int a[];
	static int d[];
	public static int go(int index,int sum,int sel) {
		if(index==n) {
			System.out.println(sum);
			return sum;
		}
		//if(d[index]!=-1)return d[index];
		int t2=go(index+1,sum,1);
		if(sel<3) {
			int t1=go(index+1,sum+a[index],sel+1);	
			d[index]=Math.max(t1, t2);
		}
		else {
			d[index]=t2;
		}
		
		return d[index];
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		a=new int[n];
		d=new int[n];
		for(int i=0;i<n;i++) {
			d[i]=-1;
		}
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(go(0,0,1));
	}

}
