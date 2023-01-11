package chapter03IF.FOR;
import java.util.Scanner;
public class ForTest15 {

	public static void main(String[] args) {
		
		Scanner scane=new Scanner(System.in);
		
		
		int i;
		int j;
		System.out.println("행을 입력하세요 ");
		int a = scane.nextInt();
		System.out.println("열을 입력하세요 ");
		int b = scane.nextInt();
		
		
		
		
		for (i=1; i<=a; i++) {
			for(j=1; j<=b; j++) {
				System.out.print(i*j+" ");
			}
		        System.out.println();
		}
		
		
		
		
		

	}

}
