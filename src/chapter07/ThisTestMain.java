package chapter07;

import javax.swing.JOptionPane;

public class ThisTestMain {

	public static void main(String[] args) {
		
		ThisTest R1= new ThisTest();
		
		
		R1.Move();
		R1.Move();
        System.out.println("============================");
        R1.RAge();
        System.out.println("============================");
	
	    int R_speed=Integer.parseInt(JOptionPane.showInputDialog("로봇속도"));
	    int R_age=Integer.parseInt(JOptionPane.showInputDialog("로봇나이"));
	    String R_name=JOptionPane.showInputDialog("로봇이름");
	    String R_num=JOptionPane.showInputDialog("로봇번호");

	    ThisTest R2=new ThisTest(R_speed,R_age,R_name,R_num);
	    
	    int speed=R2.getSpeed();
	    
	    System.out.println("속도 : " + speed);
	    System.out.println("나이 : " + R2.getAge());
	    System.out.println("이름 : " + R2.getRobotName());
	    System.out.println("번호 : " + R2.getRobotNum());
	    System.out.println("============================");
	    R2.Move();
	    R2.Rname();
	    R2.getAge();
	    R2.Move();
	    R2.Move();
	    R2.stop();
	    
	    
	    
	    
	
	
	
	
	
	
	
	
	}

}
