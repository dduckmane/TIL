package member;

public class Staff extends Contact {
	String org;
	public Staff(int id, String name, String org, String mobile) {
		super(id, name, mobile);
		// TODO Auto-generated constructor stub
		this.org=org;
	}



public final void ShowData() {
	System.out.println("Staff"+"\t"+id+"\t"+name+"\t"+org+"\t"+mobile);
}
}
