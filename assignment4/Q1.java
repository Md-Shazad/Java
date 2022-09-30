package assignment4;

@FunctionalInterface
interface Greater{
	public boolean great(int first, int second);
}

@FunctionalInterface
interface Increment{
	public int increase(int num);
}

@FunctionalInterface
interface Concat{
	public String concat(String word1, String word2);
}

@FunctionalInterface
interface ConvertToUpper{
	public String convToUpper(String word);
}

public class Q1 {

	public static void main(String[] args) {
		Greater GrEx1 = (a,b)-> (a>b)?true:false;
		System.out.println(GrEx1.great(6, 5));
		
		Increment IncEx1 = a-> ++a;
		System.out.println(IncEx1.increase(8));
		
		Concat ConEx1 = (a,b)-> a+b;
		System.out.println(ConEx1.concat("Hello","Brother"));
		
		ConvertToUpper UpperEx1 = a->a.toUpperCase();
		System.out.println(UpperEx1.convToUpper("heloo"));

	}

}
