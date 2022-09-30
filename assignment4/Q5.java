package assignment4;

interface multi1{
	default void display() {
		System.out.println("multi1");
	}
}

interface multi2{
	default void display() {
		System.out.println("multi2");
	}
}

interface multi3{
	default void display() {
		System.out.println("multi3");
	}
}

interface multiInter extends multi1,multi2,multi3 { //multiple inheritance
	default void display() {
		multi1.super.display();
		multi2.super.display();
		multi3.super.display();
		System.out.println("multiInter");
	}
}
public class Q5 implements multiInter{
	public void display() {
		multiInter.super.display();
		System.out.println();
	}
	public static void main(String[] args) {
		new Q5().display();
	}

}
