package chapter05;

import java.util.Scanner;

public class Method {

	
	//멤버변수(=필드)
	//생성자 생략
	//메소드
	
	
	void makeBread() {
		System.out.println("빵을 만듭니다");
	}//method

	void makeBread(int count, String str) {
		
		for(int i=0; i<count; i++) {
			System.out.println((i+1)+"번째 빵을 만들었습니다");
		}
		 System.out.println("요청하신"+count+"개의 빵이 모두 완료되었습니다");
		 System.out.println("요청하신"+str+count+"개의 빵이 모두 완료되었습니다");
		 
	
		//1번째 빵을 만들었습니다
		//2번쨰 빵을 만들었습니다
		//............
		
		//요청하신 5개의 빵이 모두 완료되었습니다
	}//method3
	
	void order() {
		boolean run=true;
		Scanner scan = new Scanner(System.in);
		String N;
		int num;
		
		
		while(run) {
			
			System.out.println("=====================================");
			System.out.println("1.빵의 갯수 선택 |2. 빵의 갯수와 종류 |3. 종료");
			System.out.println("=====================================");
			System.out.println("선택>");
			int selectNo=Integer.parseInt(scan.nextLine());
			
			if (selectNo == 1) {
				System.out.println("주문할 빵의 갯수 :");
				num = scan.nextInt();
				for (int i = 0; i < num; i++) {
					System.out.println((i + 1) + "번째 빵을 만들었습니다");
				}
				System.out.println("요청하신" + num + "개의 빵이 모두 완료되었습니다");
			} else if (selectNo == 2) {
				System.out.println("주문할 빵의 갯수 :");
				num = scan.nextInt();
				System.out.println("주문할 빵의 종류 :");
				N = scan.next();
				for (int i = 0; i < num; i++) {
					System.out.println((i + 1) + "번째" + N + "빵을 만들었습니다");
				}
				System.out.println("요청하신" + num + "개의" + N + " 빵이 모두 완료되었습니다");

			} else {
				run = false;
			}

			

		} // while
			
		
		System.out.println("프로그램 종료");

	}//order method
	
	
}
