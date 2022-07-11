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
		addSubject(new First(1,"신소재공학개론"));
		addSubject(new First(2,"영어"));
		addSubject(new First(3,"수학"));
		addSubject(new First(4,"컴퓨터"));
		addSubject(new Second(5,"재료열역학"));
		addSubject(new Second(6,"재료 기계적 거동"));
		addSubject(new Second(7,"물리 화학"));
		addSubject(new Second(8,"신소재 기기분석"));
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
