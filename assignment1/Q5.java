package assignment1;

class Employee{
	private String FirstName ;
	private String LastName;
	private int age;
	private String designation;
	
	Employee() {
		
	}
	Employee(String fn, String ln, int a, String des) {
		FirstName = fn;
		LastName = ln;
		age = a;
		designation = des;
	}

	public void setFirst(String first) {
		FirstName = first;
	}
	
	public String getFirst() {
		return FirstName;
	}
	
	public void setLast(String last) {
		LastName = last;
	}
	
	public String getLast() {
		return LastName;
	}
	
	public void setAge(int a) {
		age = a;
	}
	public int getAge() {
		return age;
	}
	
	public void setDesig(String des) {
		designation = des;
	}
	
	public String getDesig() {
		return designation;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getFirst() + " " + getLast() + " " + getAge() + " " + getDesig();
	}
}
public class Q5 {

	public static void main(String[] args) {
		Employee obj1 = new Employee();
		Employee obj2 = new Employee("md","shazad",20,"Software Engineer");
		System.out.println(obj2.toString());
	}
}
