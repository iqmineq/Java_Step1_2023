package chapter03IF.While;

import java.util.Scanner;

public class WhileTest06 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
        
		 int num;
		 String menu = "";
		 do 
		 {System.out.println("1.입력하기");
			System.out.println("2.출력하기");
			System.out.println("3.삭제하기");
			System.out.println("4.끝내기");
			System.out.print("작업할 번호를 선택하세요.: ");
			num = scan.nextInt();
            if(num<1 || num>3) {
			if(num==4) {
				break;
			}
			 menu="잘못 입력하셨습니다";
            }else {
			if(num==1) {
				menu="입력하기를";
				
			}
			
			else if(num==2) {
				menu="출력하기를";
			}
			else if(num==3) {
				menu="삭제하기를";}
            }
			System.out.print(menu+"선택하셨습니다.\n");
		 
            
            }while(num!=4);
		 System.out.println("\n 끝내기를 선택하셨습니다");
		 
	}
	
}