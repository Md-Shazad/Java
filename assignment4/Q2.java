package assignment4;

class Calc{
	public int sum(int a, int b) {
		return a+b;
	}
	
	public int subtract(int a, int b) {
		return a-b;
	}
	
	public static int multiply(int a, int b) {
		return a*b;
	}
}

@FunctionalInterface
interface ArithmeticManipulation{
	public int AM(int a, int b);
}

public class Q2 {

	public static void main(String[] args) {
	Calc obj = new Calc();
		
		
		ArithmeticManipulation add = obj::sum;
		System.out.println(add.AM(6,7));
		
		ArithmeticManipulation sub = obj::subtract;
		System.out.println(sub.AM(389, 111));
		
		ArithmeticManipulation mul = Calc::multiply;
		System.out.println(mul.AM(8,33));
	}

}
