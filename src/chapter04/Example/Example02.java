package chapter04.Example;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
	
		boolean run=true;
		int studentNum=0;
		int[] score=null;
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("=====================================");
			System.out.println("1.학생수 |\t2.점수입력 |\t3.점수리스트 |\t4.분석 |\t5.종료");
			System.out.println("=====================================");
			System.out.println("선택>");
			int selectNo =Integer.parseInt(scan.nextLine());
			
			if (selectNo == 1) {
				System.out.print("학생수>");
				studentNum = Integer.parseInt(scan.nextLine());
				score = new int[studentNum];

			} else if (selectNo == 2) {
				for (int i = 0; i < score.length; i++) {
					System.out.print("score[" + (i + 1) + "]");
					score[i] = Integer.parseInt(scan.nextLine());
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < score.length; i++) {
					System.out.println("score[" + (i + 1) + "]>");
				}
			} else if (selectNo == 4) {
				int max = 0;
				int sum = 0;
				double avg = 0.0;

				for (int i = 0; i < score.length; i++) {
					max = max < score[i] ? score[i] : max;// 최고점
					sum += score[i]; // 총점
				}

				avg = sum / (double) studentNum;
				System.out.println("최고점수: " + max);
				System.out.println("총점: " + sum);
				System.out.println(String.format("평균:%.2f", avg));

			} else {
				run = false;
			} // if

		} // while
		System.out.println("프로그램 종료");
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
}		
		

	}


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}//while
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	}//mian

}//class
			
			