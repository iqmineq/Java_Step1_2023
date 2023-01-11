package chapter06;

public class Student {

	
	//필드
	  int StudentID;
	  public String studentName;
	  int grade;
	  String address;
	
	  //디폴트 생성자 (free complie)
	  //오버로딩된 생성자가 있을시 디폴트를 사용하기 위해서 반드시 명시한다(즉 생략이 불가능)
	  public Student() {
		  
	  }
	
	  
	  //생성자  오버로딩
	  public Student(String studentName, String address) {
		  this.studentName=studentName;
		  this.address=address;
		  
	  }
	 
	  public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	  
	  
	  public void showStudentInfo() {
		System.out.println(studentName+ " ," +address);
	}
	  
	  
	  
	  
	  
	  
}
