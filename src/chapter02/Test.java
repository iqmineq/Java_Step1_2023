package chapter02;

public class Test {

	public static void main(String[] args) {
		
	// Q1 바이트 크기가 작은 자료형을 더 큰자료형으로 대입하는 자동 형 변환의 코드 2가지 구현
	

		byte cNum=20; 
		int dNum=cNum;
		
		System.out.println(cNum);
		System.out.println(dNum);
		
		int eNum=30;
		long fNum=eNum;
		System.out.println(eNum);
		System.out.println(fNum);
		
		// Q2 실수를 정수형 변수에 대입하는 경우에 형변환이 자동으로 이루어지고 소수점 이하 부분이 없어지는 형변환 코드 2가지 구현
		
		double Num1= 1.3;
		float Num2 = 0.8f;
		
		int Num3 = (int)(Num1+Num2);
		System.out.println(Num3);
		
		int Num4=(int)Num1+(int)Num2;
		System.out.println(Num4);
		
		
		//Q3 더 많은 실수를 표현하기 위해서 가수부와 지수로 비트를 나누어 표현하는 방식
		
		 System.out.println("부동소수점방식");
		//Q4 변수 두개를 선언해서 10과 2.5을 대입하고 두 변수의 사칙 연산 결과를 정수로만 출력
		
		int a =10;
		double b=2.5;
		
	System.out.println("두수의 합:"+(int)(a+b));
	System.out.println("두수의 차:"+(int)(a-b));
	System.out.println("두수의 곱:"+(int)(a*b));
	System.out.println("두수의 나누기:"+(int)(a/b));
		
		//Q5 '글'이라는 한글 문자의 유니코드 값을 찾아서 char형으로 선언한 변수에 저장한 뒤 
	//그 변수를 출력
	
	
	char ch1='글';
	char ch2='\uAE00'; 
	
	System.out.println(ch1);
	System.out.println(ch2);

	}
}
