package chapter03IF.SWITCH;

public class SwitchCase06 {
	public static void main(String[] args) {
		//오전 9 -> 오후 6
		
		
		int time=(int)(Math.random()*10+9);
		System.out.println("[현재시간 : "+time+"시]");
		
		switch (time) {
		case 9:
			System.out.println("1교시 수업듣기");
			break;
		case 10:
			System.out.println("2교시 수업듣기");
			break;
		case 11:
			System.out.println("3교시 수업듣기");
			break;
		case 12:
			System.out.println("4교시 수업듣기");
			break;
			
		case 13:
			System.out.println("점심시간");
			break;
		case 14:
			System.out.println("5교시 수업듣기");
			break;
			
		case 15:
			System.out.println("6교시 수업듣기");
			break;
		case 16:
			System.out.println("7교시 수업듣기");
			break;
		case 17:
			System.out.println("8교시 수업듣기");
			break;
			

		default:
		System.out.println("수업 끝");
		}
		
		
		
		
		
	}
}
