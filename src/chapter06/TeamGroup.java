package chapter06;

public class TeamGroup {

	
	private TeamMember[] member=new TeamMember[6];

	
	public void init() {
		member[0]=new TeamMember("현수", "남");
		member[1]=new TeamMember("진학", "남");
		member[2]=new TeamMember("하영", "남");
		member[3]=new TeamMember("진혁", "남");
		member[4]=new TeamMember("화진", "여");
		member[5]=new TeamMember("혜경", "여");
	}
	
	//출력 메소드
	
	public void Disp() {
		
	   for(int i=0; i<member.length; i++) {
		   System.out.print("이름 :"+member[i].getName());
		   System.out.println(" | 성별 :"+member[i].getGender());
	   }
		
	}
	
	
	
	
	
}
