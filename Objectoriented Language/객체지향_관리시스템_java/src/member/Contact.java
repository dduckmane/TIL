package member;

import show.Showable;

public abstract class Contact implements Showable {
	int id;
	String name;
	String mobile;
	public Contact(int id,String name,String mobile) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.mobile=mobile;
	}
	public String getName() {return name;}
	@Override
	public abstract void ShowData();
}
