package 인접리스트방식;

import java.util.ArrayList;
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
public class Main {
	static int n;
	static int m;
	static ArrayList<Edge>g;
	static ArrayList<Integer>[]a;
	static boolean check[];
	public static void go(int n) {
		check[n]=true;
		for(int i=0;i<a[n].size();i++) {
			int y=a[n].get(i);
			if(check[y]==false) {
				go(i);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		g=new ArrayList<Edge>();
		a=(ArrayList<Integer>[])new ArrayList[n];
		check=new boolean[n];
		n=sc.nextInt();
		m=sc.nextInt();
		for(int i=0;i<m;i++) {
			int from=sc.nextInt();
			int to=sc.nextInt();
			g.add(new Edge(from,to));
			a[from].add(to);
			a[to].add(from);
		}
		
		
	}

}
