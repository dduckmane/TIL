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
		tgList[index++]=new TraceGroup(1,cm.Find("��ö��"));
		tgList[index++]=new TraceGroup(2,cm.Find("�赿��"));
	}

	public void addTraceGroup(ContactMgr cm) {
		int id;
		Contact c = null;
		TraceGroup t = null;
		id = index + 1;
		System.out.println("id: ");
		System.out.println(id);
		cm.ShowAll();
		System.out.println("Ȯ���� �̸�: ");
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
		System.out.println("�����׷� ���");
		ShowAll();
		System.out.println("���� �׷� ID: ");
		TraceGroup t=null;
		int sel=scan.nextInt();
		for(int i=0;i<index;i++) {
			if(sel==tgList[i].id) {
				t=tgList[i];
			}
		}
		System.out.println("����� �߰��Ͻǲ�����??");
		int n=scan.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("���� ����� �̸��� �Է�");
			String name=scan.next();
			Contact c=cm.Find(name);
			t.addCandidates(c);
		}
		
	}
	public void ShowCandidates(ContactMgr cm) {
		ShowAll();
		System.out.println("���� �׷�: ");
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
