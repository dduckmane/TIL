package subject;

public class SubjectMgr {
	int index;
	Subject sList[];
	public SubjectMgr(int n) {
		// TODO Auto-generated constructor stub
		index=0;
		sList=new Subject[n];
	}
	public void init() {
		addSubject(new First(1,"�ż�����а���"));
		addSubject(new First(2,"����"));
		addSubject(new First(3,"����"));
		addSubject(new First(4,"��ǻ��"));
		addSubject(new Second(5,"��῭����"));
		addSubject(new Second(6,"��� ����� �ŵ�"));
		addSubject(new Second(7,"���� ȭ��"));
		addSubject(new Second(8,"�ż��� ���м�"));
	}
	public boolean addSubject(Subject s) {
		if(index>50) {
			return false;
		}
		else {
			sList[index++]=s;
			return true;
		}
	}
	public Subject Find(int n) {
		for(int i=0;i<index;i++) {
			if(n==sList[i].id) {
				return sList[i];
			}
		}
		return null;
	}
	public final void ShowAll() {
		for(int i=0;i<index;i++) {
			sList[i].ShowData();
		}
	}
}
