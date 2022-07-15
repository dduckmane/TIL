package Practice;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>a=new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		ArrayList<Integer>b=a;//여기서 복사가 되는 것이 아니라 참조가 됨
		System.out.println(b.get(0));
		System.out.println(b.get(1));
		System.out.println(b.get(2));
		a.add(4);
		System.out.println(b.get(3));
	}

}
