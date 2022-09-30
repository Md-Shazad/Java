package Assignment3;

import java.util.*;

class Employees{
	private String name;
	private int age;
	private String des;
	
	public Employees(String name, int age,String des) {
		this.name=name;
		this.age=age;
		this.des=des;
	}
	@Override
	public String toString() {
		return "Name of Employee" + name + "Age:" + age + " designation:"+des;
	}
}
public class Q4 {

	public static void main(String[] args) {
		Employees emp1 = new Employees("Ravi",26,"Sales");
		Employees emp2 = new Employees("jagdamba",24,"SE");
		Employees emp3 = new Employees("Shazad",32,"SSE");
		
		Map<Employees,Integer> map = new HashMap<>();
		
		map.put(emp3, 6677);
		map.put(emp2,  6788);
		map.put(emp1, 6888);
		
		for(Employees key: map.keySet()) {
			System.out.println(key + " Salary: " + map.get(key));
		}

	}

}

