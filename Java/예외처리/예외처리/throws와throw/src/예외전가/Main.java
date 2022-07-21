package 예외전가;

public class Main {
	static void abc(int num)throws Exception{	
		System.out.println("예외 발생");
		int n=num/0;
	}//예외를 전가를 하면 abc를 포함하고 있는 함수(메임함수든 어떤함수든) 예외를 처리를 해주어야한다.

	public static void main(String[] args)throws Exception {//
		//abc에서 나온 예외를 전가하여 main이 처리해줄라고 하면
		//main도 예외를 전가해서 가상머신이 해결을 해준다.
		abc(3);
	}

}
//예외가 생기면 전가하겠다 대신에 그 블록에서 처리를 해줘야 한다.
//처리방법
//1. 해결
//2. 메인에서 전가 해서 가상머신이 해결
