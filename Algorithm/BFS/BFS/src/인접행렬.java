import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Edge{
	int from;
	int to;
	public Edge(int from,int to) {
		// TODO Auto-generated constructor stub
		this.from=from;
		this.to=to;
	}
}

public class 인접행렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		ArrayList<Edge>g=new ArrayList<Edge>();
		boolean a[][]=new boolean[n][n];
		boolean check[]=new boolean[n];
		
		for(int i=0;i<m;i++) {
			int from=sc.nextInt();
			int to=sc.nextInt();
			g.add(new Edge(from,to));
			a[from][to]=a[to][from]=true;
		}
		Queue<Integer>q = new LinkedList<>();
		q.add(1);check[1]=true;
		while(!q.isEmpty()) {
			int x=q.poll();q.remove();
			for(int i=0;i<n;i++) {
				if(a[x][i]==true&&check[i]==false) {
					check[i]=true;
					q.add(i);
				}
			}
		}
	}

}
