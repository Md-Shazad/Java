package assignment1;

import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		
		String a;
		String s="";
		while(true) {
			Scanner inp = new Scanner(System.in);
			a = inp.nextLine();
			if(a.equals("Xdone"))break;
			s+=a;
		}
		System.out.println(s);
	}

}
