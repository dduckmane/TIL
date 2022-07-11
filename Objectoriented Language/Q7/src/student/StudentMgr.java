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
		System.out.println("��� ������ �����ϼ�?");
		sel=scan.nextInt();
		System.out.println("�л� id�� �Է��ϼ���");
		int n=scan.nextInt();
		for(int i=0;i<index;i++) {
			if(n==sList[i].id) {
				s=sList[i];
			}
		}
		sm.ShowAll();
		for(int i=0;i<sel;i++) {
			System.out.println("�����Ͻ� ���� id�� �Է�");
			int ss=scan.nextInt();
			Subject sb=sm.Find(ss);
			System.out.println("������ �Է�");
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
		System.out.println("�л� id�� �Է�: ");
		sel=scan.nextInt();
		for(int i=0;i<index;i++) {
			if(sList[i].id==sel) {
				sList[i].ShowSubjects();
			}
		}
	}
}
