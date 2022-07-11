package subject;
import score.addScore;
import show.Showable;

public abstract class Subject implements Showable,addScore {
	int id;
	String name;
	int score;
	public Subject(int id,String name) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
	}
	public void addScore(int score) {
		this.score=score;
	}
	public abstract void ShowData();
	public abstract void ShowData2();
	public String getName() {return name;}
}
