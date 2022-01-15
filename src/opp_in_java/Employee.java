package opp_in_java;

public class Employee {
	int id;
	String firstName;
	String lastName;
	double salary;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getFullName() {
		return this.lastName + this.firstName;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalaryMonthly() {
		return this.salary * 25;
	}
	
	public double getSalaryYearly() {
		return this.getSalaryMonthly() * 12;
	}
	
	public void showInfomation() {
		System.out.println("ID:" + this.getId());
		System.out.println("FIRST NAME: " + this.getFirstName());
		System.out.println("LAST NAME: " + this.getLastName());
		System.out.println("FULL NAME: " + this.getFullName());
		System.out.println("SALARY MONTHLY: " + this.getSalaryMonthly());
		System.out.println("SALARY YEARLY: " + this.getSalaryYearly());
	}
}
