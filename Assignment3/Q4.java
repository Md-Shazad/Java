package Assignment3;

import java.util.*;

public class Q4 {

	public static void main(String[] args) {
		Employee emp1 = new Employee("Ravi",26,"Sales");
		Employee emp2 = new Employee("jagdamba",24,"SE");
		Employee emp3 = new Employee("Shazad",32,"SSE");
		
		Map<Employee,Integer> map = new HashMap<>();
		
		map.put(emp3, 6677);
		map.put(emp2,  6788);
		map.put(emp1, 6888);
		
		for(Employee key: map.keySet()) {
			System.out.println(key + "Salary: " + map.get(key));
		}

	}

}

class Employee{
	private String name;
	private int age;
	private String des;
	
	public Employee(String name, int age,String des) {
		this.name=name;
		this.age=age;
		this.des=des;
	}
	@Override
	public String toString() {
		return "Name of Employee" + name + "Age:" + age + " designation:"+des;
	}
}
