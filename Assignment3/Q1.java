package Assignment3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Q1 {

	public static void main(String[] args) {
		List<Double> ls = new ArrayList<Double>();
		ls.add(3.44);
		ls.add(3.0);
		ls.add(3.4);
		ls.add(3.44);
		ls.add(3.44);
		
		Double sum = listSum(ls);
		System.out.println("Sum of elements in list: "+ sum);
	}
	public static Double listSum(List<Double> ls) {
		Double sum = 0.0;
		Iterator<Double> it = ls.iterator();
		
		while(it.hasNext()) {
			sum+=it.next();
		}
		return sum;
	}
}
