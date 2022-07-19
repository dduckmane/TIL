package member;

public class Student extends Contact {
	String major;
	public Student(int id, String name, String major, String mobile) {
		super(id, name, mobile);
		// TODO Auto-generated constructor stub
		this.major=major;
	}



public final void ShowData() {
	System.out.println("Student"+"\t"+id+"\t"+name+"\t"+major+"\t"+mobile);
}

}
