package attitude;

import score.addScore;
import show.Showable;

public class Attitude implements Showable,addScore {
	int id;
	String name;
	int score;
	public Attitude(int id,String name) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
	}
	public void addScore(int s) {
		this.score=s;
	}
	public String getName() {return name;}
	@Override
	public void ShowData() {
		// TODO Auto-generated method stub
		System.out.println(id+"\t"+name);
	}
	
}
