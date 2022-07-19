#include <iostream>
#include <cstring>
using namespace std;
#define swap(type,x,y) do{type t=x;x=y;y=t;}while(0)
class Team {
	int id;
	char* name;
	friend class TeamMgr;
public:
	Team() :id(0) {}
	Team(int i, const char* n) :id(i) {
		int len = strlen(n) + 1;
		name = new char[len];
		strcpy_s(name, len, n);
	}
	Team(Team& copy) {
		id = copy.id;
		int len = strlen(copy.name) + 1;
		name = new char[len];
		strcpy_s(name, len, copy.name);
	}
	void Copy(const Team& copy) {
		id = copy.id;
		int len = strlen(copy.name) + 1;
		name = new char[len];
		strcpy_s(name, len, copy.name);
	}
	int GetID() { return id; }
	char* GetName() { return name; }
	void ShowData()const {
		cout << id << "\t" << name << endl;
	}
	~Team()
	{
		delete name;
	}
};
class TeamMgr {
	Team tList[50];
	int index;
public:
	TeamMgr() :index(0) {
	}
	bool AddTeam(const Team& t) {
		if (index > 50) { return false; }
		else {
			tList[index++].Copy(t);
			for (int i = 0; i < index - 1; i++) {
				for (int j = index - 1; j > i; j--) {
					if (tList[j - 1].id > tList[j].id) {
						swap(int, tList[j - 1].id, tList[j].id);
						swap(char*, tList[j - 1].name, tList[j].name);
					}
				}
			}
			return true;
		}
	}
	void AddTeam() {
		int id; char name[100];
		cout << "id: "; cin >> id;
		cout << "name:"; cin >> name;
		Team t(id, name);
		if (AddTeam(t)) {
			cout << "sucessful" << endl;
		}
		else { cout << "false" << endl; }
	}
	Team* FindTeam(int id) {
		if (id<0 || id>index) { return NULL; }
		else {
			for (int i = 0; i < index; i++) {
				if (tList[i].id == id) { return &tList[i]; }
			}
		}
	}
	void ShowAll()const {
		cout << "[TEAM LIST]" << endl;
		for (int i = 0; i < index; i++) {
			tList[i].ShowData();
		}
	}
};
class Member {
protected:
	int id;
	char* name;
	Team* team;
	friend class MemberMgr;
public:
	Member(int i, const char* n, Team* t) :id(i) {
		int len = strlen(n) + 1;
		name = new char[len];
		strcpy_s(name, len, n);
		team = t;
	}
	virtual void ShowData()const = 0;
	~Member()
	{
		delete name;
		delete team;
	}
};
class Mentee : public Member {
	char interest[100];
	int age;
public:
	Mentee(int i, const char* n, Team* t, const char* in, int a) :Member(i, n, t), age(a) {
		int len = strlen(in) + 1;
		strcpy_s(interest, len, in);
	}
	virtual void ShowData()const {
		cout << "Mentee" << "\t" << id << "\t" << name << "\t" << team->GetName() << "\t" << interest << "\t" << age << endl;
	};
	~Mentee()
	{

	}
};
class Mentor : public Member {
	char* company;
public:
	Mentor(int i, const char* n, Team* t, const char* co) :Member(i, n, t) {
		int len = strlen(co) + 1;
		company = new char[len];
		strcpy_s(company, len, co);
	}
	virtual void ShowData()const {
		cout << "Mentor" << "\t" << id << "\t" << name << "\t" << team->GetName() << "\t" << company << endl;
	};
	~Mentor()
	{
		delete company;
	}
};
class MemberMgr {
	Member* mList[100];
	int index;
public:
	MemberMgr() :index(0) {}
	bool AddMember(Member* m) {
		if (index > 100) { return false; }
		else {
			mList[index++] = m;
		}
	}
	void AddMentor(TeamMgr& tm) {
		int id; char name[100]; Team* team=NULL; int tid; char company[100];
		id = index + 1;
		cout << "id: " << id << endl;
		cout << "name: "; cin >> name;
		tm.ShowAll();
		cout << "teamid: "; cin >> tid;
		if ((team = tm.FindTeam(tid)) == NULL)return;
		cout << "team name: " << team->GetName() << endl;
		cout << "company: "; cin >> company;
		Mentor* m = new Mentor(id, name, team, company);
		if (AddMember(m)) {
			cout << "sucessful" << endl;
		}
		else {
			delete m;
			cout << "false" << endl;
		}

	}
	void AddMentee(TeamMgr& tm) {
		int id; char name[100]; Team* team = NULL; int tid; char interest[100]; int age;
		id = index + 1;
		cout << "id: " << id << endl;
		cout << "name: "; cin >> name;
		tm.ShowAll();
		cout << "teamid: "; cin >> tid;
		if ((team = tm.FindTeam(tid)) == NULL)return;
		cout << "team name: " << team->GetName() << endl;
		cout << "interest: "; cin >> interest;
		cout << "age: "; cin >> age;
		Mentee* m = new Mentee(id, name, team, interest, age);
		if (AddMember(m)) {
			cout << "sucessful" << endl;
		}
		else {
			delete m;
			cout << "false" << endl;
		}

	}
	void FindById(TeamMgr& tm) {
		int id; Team* t;
		cout << "id: "; cin >> id;
		t = tm.FindTeam(id);
		cout << "[Member list]" << endl;
		cout << "----------------------------------------------------" << endl;
		cout << "member" << "\t" << "id" << "\t" << "name" << "\t" << "team" << "\t" << "int/com" << "\t" << "age" << endl;
		cout << "----------------------------------------------------" << endl;
		for (int i = 0; i < index; i++) {
			if (mList[i]->id == id) {
				mList[i]->ShowData();
			}
		}
		cout << "----------------------------------------------------" << endl;
	}
	Member* FindByName(const char* n) {
		for (int i = 0; i < index; i++) {
			if (strcmp(mList[i]->name, n) == 0) {
				return mList[i];
			}
		}
		return NULL;
	}
	void FindByName(TeamMgr& tmgr) {
		char name[100];
		cout << "name: "; cin >> name;
		Member* m = FindByName(name);
		cout << "[Member list]" << endl;
		cout << "----------------------------------------------------" << endl;
		cout << "member" << "\t" << "id" << "\t" << "name" << "\t" << "team" << "\t" << "int/com" << "\t" << "age" << endl;
		cout << "----------------------------------------------------" << endl;
		if (m)m->ShowData();
		cout << "----------------------------------------------------" << endl;

	}
	void ShowMentee()const {
		cout << "[Mentee list]" << endl;
		cout << "----------------------------------------------------" << endl;
		cout << "member" << "\t" << "id" << "\t" << "name" << "\t" << "team" << "\t" << "interest" << "\t" << "age" << endl;
		cout << "----------------------------------------------------" << endl;
		for (int i = 0; i < index; i++) {
			if (strcmp(typeid(*mList[i]).name(), "class Mentee") == 0) {
				mList[i]->ShowData();
			}
		}
		cout << "----------------------------------------------------" << endl;
	}
	void ShowMentor()const {
		cout << "[Mentee list]" << endl;
		cout << "----------------------------------------------------" << endl;
		cout << "member" << "\t" << "id" << "\t" << "name" << "\t" << "team" << "\t" << "company" << endl;
		cout << "----------------------------------------------------" << endl;
		for (int i = 0; i < index; i++) {
			if (strcmp(typeid(*mList[i]).name(), "class Mentor") == 0) {
				mList[i]->ShowData();
			}
		}
		cout << "----------------------------------------------------" << endl;
	}
	void ShowAll()const {
		cout << "[Member list]" << endl;
		cout << "----------------------------------------------------" << endl;
		cout << "member" << "\t" << "id" << "\t" << "name" << "\t" << "team" << "\t" << "int/com" << "\t" << "age" << endl;
		cout << "----------------------------------------------------" << endl;
		for (int i = 0; i < index; i++) {
			mList[i]->ShowData();
		}
		cout << "----------------------------------------------------" << endl;
	}

	~MemberMgr()
	{
		for (int i = 0; i < index; i++) {
			delete mList[i];
		}
	}

};
class MainMenu {
	int sel;
public:
	int IssueMenu() {
		cout << "Menu" << endl;
		cout << "1. Add a new mentee" << endl;
		cout << "2. Add a new mentor" << endl;
		cout << "3. Add a new Team" << endl;
		cout << "4. Display all mentee" << endl;
		cout << "5. Display all mentor" << endl;
		cout << "6. Display all members" << endl;
		cout << "7. Display members by team" << endl;
		cout << "8. Display members by Name" << endl;
		cout << "9. Clear screen" << endl;
		cout << "0. Exit" << endl;
		cout << "sel: "; cin >> sel;
		return sel;
	}
};
class MainCtrl {
	MainMenu mm;
	TeamMgr tmgr;
	MemberMgr mgr;
public:
	void Init() {
		tmgr.AddTeam(Team(5, "T-5"));
		tmgr.AddTeam(Team(1, "T-1"));
		tmgr.AddTeam(Team(2, "T-2"));
		tmgr.AddTeam(Team(4, "T-4"));
		tmgr.AddTeam(Team(3, "T-3"));
		mgr.AddMember(new Mentee(1, "김민성", tmgr.FindTeam(1), "노래", 26));
		mgr.AddMember(new Mentee(2, "김민지", tmgr.FindTeam(2), "힙합", 26));
		mgr.AddMember(new Mentee(3, "김민국", tmgr.FindTeam(3), "춤", 26));
		mgr.AddMember(new Mentor(4, "김지국", tmgr.FindTeam(4), "춤"));
		mgr.AddMember(new Mentor(5, "이지국", tmgr.FindTeam(5), "춤"));
	}
	MainCtrl() {
		Init();
		while (true)
		{
			switch (mm.IssueMenu()) {
			case 1:
				mgr.AddMentee(tmgr);
				break;
			case 2:
				mgr.AddMentor(tmgr);
				break;
			case 3:
				tmgr.AddTeam();
				break;
			case 4:
				mgr.ShowMentee();
				break;
			case 5:
				mgr.ShowMentor();
				break;
			case 6:
				mgr.ShowAll();
				break;
			case 7:
				mgr.FindById(tmgr);
				break;
			case 8:
				mgr.FindByName(tmgr);
				break;
			case 9:
				system("CLS");
				break;
			case 0:
				return;
			}
		}
	}
};
MainCtrl mc;
void main() {}
