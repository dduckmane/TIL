
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
//����Լ��� �߰��� �ִ� ���
//go(1)go(2)...�� �� �׶��� �Լ����� ���� ���� �ǰ�
//go(4)������ �Լ��� �ٲ��.