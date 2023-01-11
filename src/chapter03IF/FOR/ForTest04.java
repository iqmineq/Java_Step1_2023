package chapter03IF.FOR;

public class ForTest04 {

	public static void main(String[] args) {
		//0~100까지의 수중 홀수값만 합하기
		
		int num;
		int total=0;
		
		for(num=0; num<=100; num++) {
			//무시되는 수행문
			if(num%2==0)
				continue;//그냥 가세요~(무시하세요)
			
			total+=num;
			
		}
                System.out.println("0~100까지의 수중 홀수값만 합:"+total);
                System.out.println("==============================");
                System.out.println();
                System.out.println("1~20까지의 수중 홀수 값만 출력하시요");
               
                
                
        		int num1;
        		
        		
        		for(num1=0; num1<=20; num1++) {
        			
        			if(num1%2==1) {
        				System.out.print(num1+"   ");
        			}
        			
        		}
                
              
        		System.out.println("==============================");
                System.out.println();
                System.out.println("1~20까지의 수중 홀수 값만 출력하시요");
               
                
                
        		int num2;
        		
        		
        		for(num2=0; num2<=20; num2++) {
        			
        			if(num2%2!=0) {
        				System.out.print(num2+"   ");
        			}
        			
        		}
                
                
	}

}
