package chapter02;

public class Bit_Test01 {

	public static void main(String[] args) {
		//Bit연산

		int num1=5; // 0101
		int num2=10; //1010
		
		//Bit or(|)
		int result=num1|num2;
		System.out.println(result);
		
		//Bit and(&)
		int result1= num1&num2;
		System.out.println(result1);
		
		//Bit XOR(^)
		int result2= num1^num2;
		System.out.println(result2);
		
		
		
		
	}

}
