package EmpSorting;

public class Employee {

	 String name;
	 String Department;
	 int age;
	
	public Employee()
	{
		
	}
	public Employee(String name, String department, int age) {
		super();
		this.name = name;
		Department = department;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", Department=" + Department + ", age=" + age + "]";
	}
	
	
}
