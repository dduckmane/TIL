package ��������;

public class Main2 {
	static void abc(int num)throws Exception{	
		int n=num/0;
	}//���ܸ� ������ �ϸ� abc�� �����ϰ� �ִ� �Լ�(�����Լ��� ��Լ���) ���ܸ� ó���� ���־���Ѵ�.
	static void bcd() {
		try {
			abc(3);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("���ܸ� �ذ�");
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args)throws Exception {//
		//abc���� ���� ���ܸ� �����Ͽ� main�� ó�����ٶ�� �ϸ�
		//main�� ���ܸ� �����ؼ� ����ӽ��� �ذ��� ���ش�.
		bcd();
	}

}
//���ܰ� ����� �����ϰڴ� ��ſ� �� ��Ͽ��� ó���� ����� �Ѵ�.
//ó�����
//1. �ذ�
//2. ���ο��� ���� �ؼ� ����ӽ��� �ذ�
