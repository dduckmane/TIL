package tracegroup;

import java.util.Scanner;

import member.*;
import show.Showable;

public class TraceGroup implements Showable{
	int id;
	Contact confirmed;
	Contact candidates[];
	int index;
	public TraceGroup(int id,Contact c) {
		// TODO Auto-generated constructor stub
		this.id=id;
		confirmed=c;
		index=0;
		candidates=new Contact[100];
	}
	public void addCandidates(Contact c) {
		if(index>100) {
			
		}
		else {
			candidates[index++]=c;
		}
	}
	public void ShowCandidates() {
		for(int i=0;i<index;i++) {
			candidates[i].ShowData();
		}
	}
	@Override
	public final void ShowData() {
		// TODO Auto-generated method stub
		System.out.println(id+"\t"+confirmed.getName()+"\t"+index);
	}

}
