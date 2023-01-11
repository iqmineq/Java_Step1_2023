package chapter07;

public class PersonMain {

	public static void main(String[] args) {
	
		
		
		Person personKim=new Person();
		System.out.println(personKim.name="김유신");
		System.out.println(personKim.height=180f);
		System.out.println(personKim.weight=80f);
		
		System.out.println("-----------------------");
		
		Person personKang=new Person();
		System.out.println(personKim.name="강감찬");
		System.out.println(personKim.height=175f);
		System.out.println(personKim.weight=75f);
		
	System.out.println("-----------------------");
		
		Person personLee=new Person("이순신",180f,80f);
		System.out.println(personLee.name);
		System.out.println(personKim.height);
		System.out.println(personKim.weight);
		
		
		
		
		
	}

}
