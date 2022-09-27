package assignment1;

public class Q1 {
	static String FirstName = "Md";
	static String LastName = "Shazad";
	static int age = 25;
	
	static { //static block
		System.out.println(FirstName);
	}
	
	public static void show() {//static method
		System.out.println(LastName);
	}
	public static void main(String[] args) {
		Q1.show();
		
		System.out.println(age);

	}

}
