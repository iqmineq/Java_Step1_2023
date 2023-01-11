package chapter06;

public class TeamMain {

	public static void main(String[] args) {
		
	
	TeamGroup team=new TeamGroup();
	TeamMember t=new TeamMember();
	//메소드를 통해서 팀명을 초기화
	
	t.setTeamName("IT프렌즈");
	System.out.println("팀명: "+t.getTeamName());
	System.out.println("------[팀원 명단]------");
	team.init();
	team.Disp();
	
	System.out.println();
	
	t.setmName("조현수");
	System.out.println("팀장이름 :"+ t.getmName());
	t.setMphone("010-6862-8695");
	System.out.println("팀장 전화번호 :"+ t.getMphone());
	t.setsName("신진혁");
	System.out.println("부팀장이름 :"+ t.getsName());
	t.setMphone("010-3384-4078");
	System.out.println("부팀장 전화번호 :"+ t.getMphone());
	
	}
	
	
}
