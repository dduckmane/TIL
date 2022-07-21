package 예외발생;

public class Main2 {
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		try {
			throw new Exception("예외를 해결");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}