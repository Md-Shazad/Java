package assignment4;

import java.util.*;
import java.util.stream.*;
class Employee{
	String fullName;
	Long Salary;
	String city;
	
	Employee(String name,Long sal, String city){
		this.fullName = name;
		this.Salary = sal;
		this.city = city;
	}
	
	public String getfullName() {
		return fullName;
	}
	
	public String getfirstName() {
		return getfullName().split(" ")[0];
	}
	
	public Long getSalary() {
		return this.Salary; //this is also the way to return instance members
	}
	
	public String getCity() {
		return city;
	}
}

public class Q4 {

	public static void main(String[] args) {

		List<Integer> num = Arrays.asList(4,3,5,6,8,1,14,13);
		List <Integer> res = num.stream()		
							.filter(e->e%2==0)
							.collect(Collectors.toList());
		System.out.println(res);
		
		List<Employee> emp=new ArrayList<Employee>();
		
		emp.add(new Employee("Md Shazad",4000L,"Delhi"));
		emp.add(new Employee("Raviranjan Singh",10000L,"Delhi"));
		emp.add(new Employee("Jagdamba",9000L,"Patna"));
		emp.add(new Employee("Joice",3000L,"Delhi"));
		
		System.out.println("first Name with <5000 salary from delhi is/are: ");
		
		emp.stream()
			.filter(e->e.getCity().equals("Delhi"))
			.filter(e->e.getSalary() < 5000)
			.map(Employee::getfirstName)
			.distinct()
			.forEach(e->System.out.println(e)); 	// OR System.out::println
			
	}

}
