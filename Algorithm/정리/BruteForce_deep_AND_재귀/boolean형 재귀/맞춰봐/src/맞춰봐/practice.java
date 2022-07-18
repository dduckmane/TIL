package ¸ÂÃçºÁ;

public class practice {
	static int n=0;
	static boolean check() {
		for(int i=0;i<10;i++) {
			n+=3;
			if(i==11) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check();
		System.out.println(n);
	}

}
