package chapter05;

public class FunTest05 {

	
	
	
	
	public String channel;//멤버 변수
	public int channelInt;//멤버 변수
	public int volumel;//멤버 변수
	//생략가능
		/*public FunTest05(int volume)	{
			
		}*/
	public void channelUp(int volume) {
		System.out.println("소리를"+volume+"만큼 올립니다.");
	}
	
	public void channelDown(int volume) {
		System.out.println("소리를"+volume+"만큼 내립니다.");
	}
	//오버로딩(다형성 만족)
	public void channelchange(String channel) {
		System.out.println("채널을"+channel+"로 바꿉니다");
	}
	//오버로딩(다형성 만족)
	public void channelchange(int channelInt) {
		System.out.println("채널을"+channelInt+"로 바꿉니다");
	}
	
	
	
	//================================================================
	public static void main(String[] args) {

		FunTest05 tv = new FunTest05();
		tv.channelUp(3);
		tv.channelDown(3);

		tv.channelchange("tvN");
		tv.channelchange(5);
		




}
}
