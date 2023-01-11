package chapter03IF.FOR;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ForTest05 {

	public static void main(String[] args) {
		//문제1 정수를 입력받아(Scanner) 입력받은 정수부터 100까지 합을 출력하시오

		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요:");
		int a = scan.nextInt();
		int i;
		

		int sum = 0;

		for (i = a; i <= 100; i++) {
			sum += i;

		}
		System.out.println(a + "부터 100까지 합:" + sum);
		
		
		
		
		
		
		
		
		
		
		//문제2 1에서 부터 10까지 반복하면서  정수를 입력받아 그 수중에 짝수의 갯수가 몇개인지 출력
		// 단 입력 받은 수가 0이면 무시
	
	System.out.println("정수를 입력하세요 : ");
		    int b, j, cnt=0;
		    for(j=1;j<=10;j++) {
		    	b=scan.nextInt();
		    	if(b==0) {
		    	 continue;
		    	}
		    	if(b%2==0) {
		    		cnt++; // cnt=cnt+1
		    		
		    	}//if
		    }//for
	 System.out.println("입력받은 짝수의 갯수: "+cnt);
	
	
	
	
	
	}

}
