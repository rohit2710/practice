package com.cybage;

//creating employee class
class Employee{
	private String empId;
	private String empName;
	private float empSalary;
	
	//parameter less ctor
	public Employee() {
		super();
	}
	
	//parameterized ctor
	public Employee(String empId, String empName, float empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	//mutators(setters) and accessors(getters)
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
	
	//toString 
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
}
public class Assignment2_1 {

	public static void main(String[] args) {
		//creating employee object
		Employee e1=new Employee();
		//setting the values using mutators
		e1.setEmpId("e101");
		e1.setEmpName("rv");
		e1.setEmpSalary(12356.43F);
		//printing the values
		System.out.println(e1.toString());
		
		//creating another object and same
		Employee e2=new Employee();
		e2.setEmpId("e102");
		e2.setEmpName("rv");
		e2.setEmpSalary(1342356.43F);
		System.out.println(e2.toString());
	}
}
