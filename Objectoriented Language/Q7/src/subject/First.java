package subject;

public class First extends Subject {

	public First(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ShowData() {
		// TODO Auto-generated method stub
		System.out.println(id+"\t"+name);
	}
	public void ShowData2() {
		// TODO Auto-generated method stub
		System.out.println(id+"\t"+name+"\t"+score);
	}

}
