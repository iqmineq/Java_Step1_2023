package chapter03IF.While;

import java.util.Scanner;

public class WhileTest05 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int num=0;
		int cnt=0; 
		int sum=0;
		double avg;
		//0을 입력하면 종료

		while (true) {
			System.out.println("숫자를 입력하세요 : ");
			num = scan.nextInt();
            
			if (num == 0) {
				break;
			}
			cnt++;
			sum+=num;
					

		} //while
		System.out.println("입력된 자료의 갯수:"+ cnt);
		System.out.println("입력된 자료의 합계:"+ sum);
		System.out.println("입력된 자료의 평균:"+ sum/(double)cnt);
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}