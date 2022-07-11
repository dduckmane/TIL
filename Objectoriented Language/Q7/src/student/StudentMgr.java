package student;

import java.util.Scanner;
import subject.Subject;
import subject.SubjectMgr;
import attitude.*;

public class StudentMgr {
	int index;
	Student sList[];
	Scanner scan;
	public StudentMgr(int n) {
		// TODO Auto-generated constructor stub
		sList=new Student[n];
		index=0;
		scan=new Scanner(System.in);
	}
	public void init() {
		
	}
	public void addFirst(AttitudeManager am) {
		int id;String name;int grade;Attitude at=null;
		id=index+1;
		System.out.println("id: ");
		System.out.println(id);
		System.out.println("name: ");
		name=scan.next();
		System.out.println("grade: ");
		grade=1;
		am.ShowAll();
		System.out.println("sel: ");
		int sel=scan.nextInt();
		at=am.Find(sel);
		Student s=new Student(id,name,grade,at);
		if(index>50) {
			System.out.println("false");
		}
		else {
			sList[index++]=s;
			System.out.println("sucessful");
		}
	}
	public void addSecond(AttitudeManager am) {
		int id;String name;int grade;Attitude at=null;
		id=index+1;
		System.out.println("id: ");
		System.out.println(id);
		System.out.println("name: ");
		name=scan.next();
		System.out.println("grade: ");
		grade=2;
		am.ShowAll();
		System.out.println("sel: ");
		int sel=scan.nextInt();
		at=am.Find(sel);
		Student s=new Student(id,name,grade,at);
		if(index>50) {
			System.out.println("false");
		}
		else {
			sList[index++]=s;
			System.out.println("sucessful");
		}
	}
	public void MakeStudent(SubjectMgr sm,AttitudeManager am) {
		int sel;Student s=null;
		System.out.println("몇개의 과목을 수강하셨?");
		sel=scan.nextInt();
		System.out.println("학생 id를 입력하세요");
		int n=scan.nextInt();
		for(int i=0;i<index;i++) {
			if(n==sList[i].id) {
				s=sList[i];
			}
		}
		sm.ShowAll();
		for(int i=0;i<sel;i++) {
			System.out.println("수강하신 과목 id를 입력");
			int ss=scan.nextInt();
			Subject sb=sm.Find(ss);
			System.out.println("성적을 입력");
			int score=scan.nextInt();
			sb.addScore(score);
			s.addSubject(sb);
		}
	}
	public void ShowAll() {
		for(int i=0;i<index;i++) {
			sList[i].ShowData();
		}
	}
	public void ShowByStudent() {
		int sel;
		System.out.println("학생 id를 입력: ");
		sel=scan.nextInt();
		for(int i=0;i<index;i++) {
			if(sList[i].id==sel) {
				sList[i].ShowSubjects();
			}
		}
	}
}
