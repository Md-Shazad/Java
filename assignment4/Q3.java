package assignment4;



public class Q3  {

	public static void main(String[] args) throws InterruptedException{
		new Thread(()-> System.out.println("started")).start();
		Thread.sleep(1000);
		System.out.println("why took pausse");

	}


}
