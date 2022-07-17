
public class practice {
	static int pr=0;
	public static int go(int i) {
		if(i==4) {
			System.out.println("end");
			return 7;
		}
		int ans=3;
		System.out.println(pr++);
		int k=go(i+1);
		System.out.println(k);
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		go(0);
		
	}

}
//재귀함수가 중간에 있는 경우
//go(1)go(2)...은 다 그때의 함수값의 값을 갖게 되고
//go(4)마지막 함수만 바뀐다.