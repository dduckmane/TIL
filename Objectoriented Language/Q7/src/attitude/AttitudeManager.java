package attitude;

public class AttitudeManager {
	int index;
	Attitude aList[];
	public AttitudeManager(int n) {
		// TODO Auto-generated constructor stub
		aList=new Attitude[n];
		index=0;
	}
	public void init() {
		addAttitude(new Attitude(1,"매우 성실")	);
		addAttitude(new Attitude(2,"성실")	);
		addAttitude(new Attitude(3,"보통")	);
		
	}
	public boolean addAttitude(Attitude a) {
		if(index>50) {
			return false;
		}
		else {
			aList[index++]=a;
			return true;
		}
	}
	public Attitude Find(int n) {
		for(int i=0;i<index;i++) {
			if(n==aList[i].id) {
				return aList[i]; 
			}
		}
		return null;
	}
	public final void ShowAll() {
		for(int i=0;i<index;i++) {
			aList[i].ShowData();
		}
	}
}
