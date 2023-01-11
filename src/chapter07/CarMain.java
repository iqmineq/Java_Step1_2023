package chapter07;

public class CarMain {

	public static void main(String[] args) {
		// 객체를 생성하면서 초기화
		
		
		Car myCar=new Car("검정",3000);
		//멤버변수이용하여 하나씩 초기화
       
		
		
		System.out.println("color:" + myCar.color);
		System.out.println("cc:" + myCar.cc);
		
		
		// 멤버변수에 직접 접근하여 출력
		
       
		
		
		System.out.println("--------------------------");

		System.out.println("color:" + myCar.getColor());
		System.out.println("cc:" + myCar.getCc());
		
		// 메소드를 필요한 출력

	}

}
