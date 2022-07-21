package 예외발생;

public class Main {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int num=3;
		if(num==1) {
			System.out.println(1);
		}
		else {
			 throw new Exception("예외 발생");//예외 객체를 던저주어야 한다.
			 //throw Exception;예외를 던져주는 것이 아니다		}
		}
	}

}
//예외를 만든다.
//처리방법
//1. 해결
//2. 메인에서 전가 해서 에러가난다.