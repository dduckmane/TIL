package ��������;

public class Main {
	static void abc(int num)throws Exception{	
		System.out.println("���� �߻�");
		int n=num/0;
	}//���ܸ� ������ �ϸ� abc�� �����ϰ� �ִ� �Լ�(�����Լ��� ��Լ���) ���ܸ� ó���� ���־���Ѵ�.

	public static void main(String[] args)throws Exception {//
		//abc���� ���� ���ܸ� �����Ͽ� main�� ó�����ٶ�� �ϸ�
		//main�� ���ܸ� �����ؼ� ����ӽ��� �ذ��� ���ش�.
		abc(3);
	}

}
//���ܰ� ����� �����ϰڴ� ��ſ� �� ��Ͽ��� ó���� ����� �Ѵ�.
//ó�����
//1. �ذ�
//2. ���ο��� ���� �ؼ� ����ӽ��� �ذ�
