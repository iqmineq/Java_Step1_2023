package chapter02;

public class AssignTest04 {

	public static void main(String[] args) {
		// 전위연산
		System.out.println("===전위연산===");
		int gameScore=150;
		//int lastScore=gameScore+1;
		int lastScore1=++gameScore; 
		System.out.println(lastScore1);//151
		System.out.println("=================");
		int lastScore2=--gameScore;
		System.out.println(lastScore2);//150
		
          
		
		
	// 후위연산
          
		
		System.out.println("===후위연산===");
		int lastScore3=gameScore++; // 읽고 대입후 더하기
		System.out.println(lastScore3);
		System.out.println(gameScore);
		System.out.println("=================");
		
	
		
		int lastScore4=gameScore--; // 읽고 대입후 더하기
		System.out.println(lastScore4);
		System.out.println(gameScore);
		System.out.println("=================");
		
		
		
		
		
	}

}
