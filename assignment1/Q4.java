package assignment1;

import java.util.Scanner;

public class Q4 {
	
	private static void ColSum(int[][] arr) {
		int sum;
		System.out.println("ColSum incoming");
		for(int i=0; i<3; i++) {
			sum=0;
			for(int j=0; j<2; j++) {
				sum+=arr[j][i];
			}
			System.out.println("sum of column no. " + i + " is " + sum);
		}
	}
	


	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		int x,sum;
		
		int[][] a = new int[2][3];
		
		for(int i=0; i<2; i++) {
			sum = 0;
			for(int j=0; j<3; j++) {
				System.out.print("input value for a[" + i + "][" + j + "]: ");
				x = inp.nextInt();
				a[i][j] = x;
				sum += a[i][j];
				
			}
			System.out.println("sum of row no. "+ i + " is " + sum);
		}
		ColSum(a);
		//RowSum(a);
	}

}
