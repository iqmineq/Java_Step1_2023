package chapter03IF.FOR;

import java.util.Scanner;

public class ForTest09 {

	public static void main(String[] args) {
	// 몇명의 성적을 입력 받을 것인지 정수로 인원수를 입력받고 총점과 평균을 구하시오(단.평균은 실수로 출력할 것)
		
		Scanner scan=new Scanner(System.in);
		int i=0;
		int sum=0;
		int cnt=0;
		int score;
		
		double avg=0;
		
		System.out.println("몇명의 학생 점수를 입력 받으시겠습니까?");
		int stu=scan.nextInt();
		
		for(i=1; i<=stu; i++) {
		    System.out.println(i+"번쨰 학생의 점수를 입력하세요:");
			
			score=scan.nextInt();
			sum+=score;
		    cnt++; // 인원수를 누적
			
		    } 
		
		//평균
		avg=sum/(double)cnt;
		System.out.println("총점: "+sum+", 평균:"+avg);
		

	}

}
