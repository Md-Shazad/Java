package Assignment3;

import java.util.*;
import java.util.Collections;
import java.util.Comparator;

class Employee implements Comparable<Employee>{
	double age;
	double salary;
	String name;
	
	
	Employee(Double age, Double salary, String name){
		this.age = age;
		this.salary = salary;
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public int compareTo(Employee emp) {
		return this.name.compareTo(emp.getName());
	}
	
	@Override
	public String toString() {
		return this.name + ", " + this.salary;
	}
	
}
public class Q2 {

	public static void main(String[] args) {
		Employee emp1 = new Employee(33.0,4555.33,"Joice Parker");
		Employee emp2 = new Employee(34.0,38388.0,"Pan Peter");
		Employee emp3 = new Employee(35.0,89999.0,"Hrithik roshan");
		
		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		
		System.out.println("By default sort using name overriding compareTo: ");
		System.out.println(employees);
		
		Collections.sort(employees,new Comparator<Employee>(){
			@Override
			public int compare(Employee e1,Employee e2) {
				return((int) (e1.getSalary()-e2.getSalary()));
			}
		});
		
		System.out.println("Sorted by salary: ");
		System.out.println(employees);
		//sort based on salary
		
	}

}
