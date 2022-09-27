package assignment1;
import java.util.Scanner;
public class Q3 {
	public static void CArea() {
		Scanner inp = new Scanner(System.in);
		System.out.println("enter radius: ");
		int r = inp.nextInt();
		System.out.println(3.14*r*r);
	}
	public static void Ccir() {
		Scanner inp = new Scanner(System.in);
		System.out.println("enter radius: ");
		int r = inp.nextInt();
		System.out.println(2*3.14*r);
	}
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int a=1 ;
		
		
		while(a!=3) {
			System.out.println("****Menu****");
			System.out.println("1.Calculate Area of Circle");
			System.out.println("2.Calculate Circumference of Circle");
			System.out.println("3.Exit");
			
			a = inp.nextInt();
			switch(a){
			case 1: CArea(); break;
			case 2:	Ccir();break;
			//case 3: break;
			
			}
			
		}
        
	}

}
