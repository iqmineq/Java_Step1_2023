package chapter06;

import java.util.Scanner;

public class GugudanMain {

	public static void main(String[] args) {
		Gugudan gd= new Gugudan();
		
		int num;
		System.out.print("출력할 단을 입력하세요: ");
		Scanner s = new Scanner(System.in);
		
		num=s.nextInt();
		gd.showTable(num);
	}

}
