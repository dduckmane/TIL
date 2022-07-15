import java.util.Scanner;

public class Main {
	static int n,m;
	static int dx[]= {1,-1,0,0};
	static int dy[]= {0,0,1,-1};
	static int go(int[][]a) {
		int cnt=0;
		int l=0;
		for(int i=0;i<n;i++	) {
			for(int j=0;j<m;j++) {
				if(a[i][j]!=0) {
					l+=1;
					for(int k=0;k<4;k++) {
						int x=i+dx[k];
						int y=j+dy[k];
						if(x>=0&&x<n&&y>=0&&y<m) {
							if(a[x][y]!=0)cnt+=1;
						}
					}
				}
			}
		}
		int ans=(l*4)-cnt;
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		int ans=0;
		int a[][]=new int[n][m];
		int max=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j]=sc.nextInt();
				if(max<a[i][j])max=a[i][j];
			}
		}
		
		for(int k=1;k<=max;k++) {
			int b[][]=new int[n][m];
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					if(a[i][j]>=k) {
						b[i][j]=a[i][j];
					}
				}
			}
			ans+=go(b);
		}
		ans+=(n*m)*2;
		System.out.println(ans);
		
	}

}
