package chapter03IF.FOR;

import java.util.Scanner;

public class ForTest17 {
public static void main(String[] args) {
	//정수를 입력받아서 입력된 수만큼  ★출력

	Scanner scane= new Scanner(System.in);
	System.out.println("숫자를 입력하시오:");
    int i, j, k;	
	int n = scane.nextInt();
	
	
	for( i=0; i<n; i++)
	{
		for( j=0; j<=n-1-i; j++)
		{
			System.out.print(" ");
		}
		for( j=0; j<2*i+1; j++)
		{
			System.out.print("★");
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
