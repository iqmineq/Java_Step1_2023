package chapter03IF;

import java.util.Scanner;

public class Example02 {
public static void main(String[] args) {
	
	//gender가 F면 남자입니다 그렇지 않으면 여성입니다.
	//Scanner로 char입력받기
	
	Scanner scan=new Scanner(System.in);
	System.out.println("성별을 입력하세요(F/M)");
	
	char gender='F';
	gender=scan.nextLine().charAt(0);
	
	if(gender=='F') {
		System.out.println("남자입니다");
	}
	else {
		System.out.println("여성입니다");
	}
			
		
	
	System.out.println("----------------------------------");
	System.out.println();
	System.out.println("주문하시겠습니까?(Y,N)");
	
	char ch;
	ch=scan.next().charAt(0);
	
	//단, 조건에 논리함수 사용
      if(ch=='Y'||ch=='y') {
    	  System.out.println("메뉴를 입력하세요");
          String m1=scan.next();
          System.out.println(m1+"(가)이 주문 완료되었습니다");
      
      } else {
    	  System.out.println("이용해주셔서 감사합니다");
      }
      
	
	
	
	
	
	
	
	
}
}
