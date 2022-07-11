package tracegroup;

import java.util.Scanner;

import member.Contact;
import member.ContactMgr;

public class TraceGroupMgr {
	int index;
	TraceGroup tgList[];
	Scanner scan;

	public TraceGroupMgr(int n) {
		// TODO Auto-generated constructor stub
		index = 0;
		tgList = new TraceGroup[n];
		scan = new Scanner(System.in);
	}

	public void init(ContactMgr cm) {
		tgList[index++]=new TraceGroup(1,cm.Find("김철수"));
		tgList[index++]=new TraceGroup(2,cm.Find("김동수"));
	}

	public void addTraceGroup(ContactMgr cm) {
		int id;
		Contact c = null;
		TraceGroup t = null;
		id = index + 1;
		System.out.println("id: ");
		System.out.println(id);
		cm.ShowAll();
		System.out.println("확진자 이름: ");
		String name = scan.next();
		c = cm.Find(name);
		if (c == null) {
			System.out.println("reagain");
		} else {
			t = new TraceGroup(id, c);
			tgList[index++] = t;
			System.out.println("sucessful");
		}
	}
	public void Make(ContactMgr cm) {
		System.out.println("추적그룹 목록");
		ShowAll();
		System.out.println("추적 그룹 ID: ");
		TraceGroup t=null;
		int sel=scan.nextInt();
		for(int i=0;i<index;i++) {
			if(sel==tgList[i].id) {
				t=tgList[i];
			}
		}
		System.out.println("몇명을 추가하실껀가요??");
		int n=scan.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("추적 대상자 이름을 입력");
			String name=scan.next();
			Contact c=cm.Find(name);
			t.addCandidates(c);
		}
		
	}
	public void ShowCandidates(ContactMgr cm) {
		ShowAll();
		System.out.println("추적 그룹: ");
		int sel=scan.nextInt();
		for(int i=0;i<index;i++) {
			if(sel==tgList[i].id) {
				tgList[i].ShowCandidates();
			}
		}
	}

	public void ShowAll() {
		for (int i = 0; i < index; i++) {
			tgList[i].ShowData();
		}
	}
}
