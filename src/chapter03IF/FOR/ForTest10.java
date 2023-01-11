package chapter03IF.FOR;

import java.util.Scanner;

public class ForTest10 {

	public static void main(String[] args) {
          //입력받은 수를 초과하면 반복을 멈추는 조건
             Scanner scan=new Scanner(System.in);
             int i;
             int sum=0;
             System.out.println("정수를 입력하세요: ");//20
             int num = scan.nextInt();
             
             
             for(i=1; ; i++) {
            	 
            	 if(sum>num) {
            		 break;
            	 }
                  
                  sum+=i;              
             
             }
             System.out.println(i-1+"번쨰까지의 총합:"+sum);
	}

}
