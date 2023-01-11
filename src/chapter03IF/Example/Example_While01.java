package chapter03IF.Example;

import java.util.Scanner;

public class Example_While01 {
public static void main(String[] args) {
	
	
	
	
	boolean run = true;
	int balance=0;

	
	Scanner scan = new Scanner(System.in);

	while (run) {
		System.out.println("==================================");
		System.out.println("1.예금 |\t2.출금 |\t3.잔고 |\t4.종료");
		System.out.println("==================================");
		System.out.println("선택:");

           int menuNum=Integer.parseInt(scan.nextLine());
		
		
		switch (menuNum) {
		case 1: // 0이하의 금액이 입력되었을때 예외처리
			System.out.println("예금액: ");
			balance += Integer.parseInt(scan.nextLine());
			break;
		case 2: // 잔액이 부족합니다
			System.out.println("출금액: ");
			balance -= Integer.parseInt(scan.nextLine());
			break;
		case 3:
			System.out.println("잔고: ");
			System.out.println(balance);
			break;
		case 4:
			run = false;
			break; //switch
		
		}

		if (balance == 4) {
			break;
		}

		System.out.println();

	}
	System.out.println("프로그램 종료");
	
	
	
}
}
