package member;

import java.util.Scanner;

public class ContactMgr {
	int index;
	Contact cList[];
	Scanner scan;
	public ContactMgr(int n) {
		// TODO Auto-generated constructor stub
		cList=new Contact[n];
		index=0;
		scan=new Scanner(System.in);
	}
	public void init() {
		addContact(new Student(1,"김철수","컴퓨터공학","0101112222"));
		addContact(new Student(2,"홍길동","컴퓨터공학","0101113333"));
		addContact(new Student(3,"김동수","소프트웨어","0101114444"));
		addContact(new Student(4,"이철희","소프트웨어","0101115555"));
		addContact(new Staff(5,"이영희","교무처","0102221234"));
		addContact(new Staff(6,"박진희","학생처","0101112235"));
		addContact(new Staff(7,"김일동","국제처","01011122236"));
		addContact(new Staff(8,"정진선","기획처","0101112237"));
		addContact(new Staff(9,"전두원","입학처","0101112238"));
	}
	public boolean addContact(Contact c) {
		if(index>100) {
			return false;
		}
		else {
			cList[index++]=c;
			return true;
		}
	}
	public void addStudent() {
		int id;String name;String mobile;String major;
		id=index+1;
		System.out.println("id: ");
		System.out.println(id);
		System.out.println("name: ");
		name=scan.next();
		System.out.println("mobile: ");
		mobile=scan.next();
		System.out.println("major: ");
		major=scan.next();
		Contact s=new Student(id,name,major,mobile);
		if(addContact(s)) {
			System.out.println("sucessful");
		}
		else {
			System.out.println("false");
		}
	}
	public void addStaff() {
		int id;String name;String mobile;String org;
		id=index+1;
		System.out.println("id: ");
		System.out.println(id);
		System.out.println("name: ");
		name=scan.next();
		System.out.println("mobile: ");
		mobile=scan.next();
		System.out.println("org: ");
		org=scan.next();
		Contact s=new Staff(id,name,org,mobile);
		if(addContact(s)) {
			System.out.println("sucessful");
		}
		else {
			System.out.println("false");
		}
	}
	public Contact Find(String name) {
		for(int i=0;i<index;i++) {
			if(cList[i].name.equals(name)) {
				return cList[i];
			}
		}
		return null;
	}
	public final void ShowStudent() {
		for(int i=0;i<index;i++) {
			if(cList[i] instanceof Student) {
				cList[i].ShowData();
			}
		}
	}
	public final void ShowStaff() {
		for(int i=0;i<index;i++) {
			if(cList[i] instanceof Staff) {
				cList[i].ShowData();
			}
		}
	}
	public final void ShowAll() {
		for(int i=0;i<index;i++) {
			cList[i].ShowData();
		}
	}
	
	
}
