package com.cybage;
class Employee1{
	private String empId;
	private String ename;
	private float salary;
	static int count=0;
	//static initializer block
	{
		count=count+1;
	}
	public Employee1() {
		super();
	}
	public Employee1(String empId, String ename, float salary) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.salary = salary;
	}
	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", ename=" + ename + ", salary=" + salary + "]";
	}

}
public class Assignment3_2 {

	public static void main(String[] args) {
		//creating an array of employees
		Employee1 arr[]= {new Employee1("Emp101","RV1",2133.34F),
						 new Employee1("Emp102","RV2",2133.34F),
						 new Employee1("Emp103","RV3",2133.34F),
						 new Employee1("Emp104","RV4",2133.34F),
						 new Employee1("Emp105","RV5",2133.34F)};
		
		//printing number of employee objects created
		System.out.println("The number of object created are :"+Employee1.count);
		
		//printing each object
		for(Employee1 emp:arr) {
			System.out.println(emp.toString());
		}
	}

}
