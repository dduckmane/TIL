import java.util.Scanner;

import attitude.AttitudeManager;
import student.StudentMgr;
import subject.SubjectMgr;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainMenu mm=new MainMenu();
		AttitudeManager am=new AttitudeManager(50);
		StudentMgr sm=new StudentMgr(50);
		SubjectMgr smgr=new SubjectMgr(50);
		am.init();
		sm.init();
		smgr.init();
		while(true) {
			switch(mm.IssueMenu()) {
			case 1:
				sm.addFirst(am);
				break;
			case 2:
				sm.addSecond(am);
				break;
			case 3:
				sm.MakeStudent(smgr, am);
				break;
			case 4:
				sm.ShowByStudent();
				break;
			case 5:
				sm.ShowAll();
				break;
			
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
		System.out.println("menu");
		System.out.println("01. 1학년추가");
		System.out.println("02. 2학년추가");
		System.out.println("03. 구성");
		System.out.println("04. 학생별 출력");
		System.out.println("05. 모두 출력");
		System.out.println("sel: ");
		sel=scan.nextInt();
		return sel;
		
	}
}
