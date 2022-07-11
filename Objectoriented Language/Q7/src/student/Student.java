package student;

import attitude.Attitude;
import subject.Subject;
import subject.SubjectMgr;

public class Student {
	int id;
	String name;
	Attitude attitude;
	Subject subjects[];
	int grade;
	int index;
	public Student(int id,String name,int grade,Attitude attitude) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.attitude=attitude;
		this.grade=grade;
		subjects=new Subject[50];
	}
	public boolean addSubject(Subject s) {
		if(index>50) {
			return false;
		}
		else {
			subjects[index++]=s;
			return true;
		}
		
	}
	public final void ShowSubjects() {
		for(int i=0;i<index;i++) {
			subjects[i].ShowData2();
		}
	}
	public final void ShowData() {
		System.out.println(id+"\t"+name+"\t"+grade+"\t"+attitude.getName()+"\t"+index);
	}
}
