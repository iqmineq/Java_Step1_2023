package chapter03IF.FOR;

import java.util.Scanner;

public class ForTest18 {

	public static void main(String[] args) {
		
		
		//정수를 입력받아서 입력된 수만큼 ★출력
		Scanner scane= new Scanner(System.in);
		System.out.println("숫자를 입력하시오:");
	    int i, j, k;	
		int n = scane.nextInt();
		
		for(i=1; i<=n; i++) {
			for(j=1; j<=i; j++) {
				System.out.print("★");
			}
		  System.out.println();
		}

	}

}
