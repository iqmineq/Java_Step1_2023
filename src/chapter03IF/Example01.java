package chapter03IF;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
     
		Scanner scan = new Scanner(System.in);
		System.out.println("소프트웨어 설계:");
		int soft1 = scan.nextInt();
		System.out.println("소프트웨어 개발:");
		int soft2 = scan.nextInt();
		System.out.println("데이스 베이스 구축:");
		int DB = scan.nextInt();
		System.out.println("프로그래밍언어활용:");
		int pro = scan.nextInt();
		System.out.println("정보시스템 구축:");
		int os = scan.nextInt();

		int sum = soft1 + soft2 + DB + pro + os;

		if (soft1 < 8 || soft2 < 8 || DB < 8 || pro < 8 || os < 8 || sum < 60) {
			System.out.println("불합격입니다.");
		} else {
			System.out.println("합격입니다");
		}
	
	
	
	
	
	
	
	
	}
	

}
