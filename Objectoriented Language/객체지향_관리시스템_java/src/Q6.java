
import java.util.Scanner;

import member.*;
import tracegroup.*;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainMenu mm=new MainMenu();
		
		ContactMgr cm=new ContactMgr(100);
		TraceGroupMgr tm=new TraceGroupMgr(100);
		cm.init();
		tm.init(cm);
		while(true) {
			switch(mm.IssueMenu()) {
			case 1:
				cm.addStudent();
				break;
			case 2:
				cm.addStaff();
				break;
			case 3:
				cm.ShowStudent();
				break;
			case 4:
				cm.ShowStaff();
				break;
			case 5:
				cm.ShowAll();
				break;
			case 6:
				tm.addTraceGroup(cm);
				break;
			case 7:
				tm.Make(cm);
				break;
			case 8:
				tm.ShowAll();
				break;
			case 9:
				tm.ShowCandidates(cm);
				break;
			case 0:
				return;
			default:
					break;
				
			}
		}
	}

}
class MainMenu{
	int sel;
	Scanner scan=new Scanner(System.in);
	public int IssueMenu() {
		System.out.println("----<MENU>-----");
		System.out.println("1. �л� �߰�");
		System.out.println("2. ������ �߰�");
		System.out.println("3. �л� ��� ��ȸ");
		System.out.println("4. ������ ��� ��ȸ");
		System.out.println("5. ��� ���� ��ȸ");
		System.out.println("6. ���� �׷� �߰�");
		System.out.println("7. ���� �׷� ����");
		System.out.println("8. ���� �׷� ��� ��ȸ");
		System.out.println("9. ���� �׷캰 ��ȸ");
		System.out.println("0. ����");
		System.out.println("sel: ");
		sel=scan.nextInt();
		return sel;
	}
}