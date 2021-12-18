package exercise_1;

import java.util.Scanner;

public class Customer {
	String fullName;
	String address;
	String phone;
	String email;
	
	public Customer(String fullName, String address, String phone,String email) {
		this.fullName = fullName;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}
	
	public Customer() {
//		this.fullName = "";
//		this.address = ""; 
//		this.phone = "";
//		this.email = "";
	}
	
	public void inputInfoCustomer() {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("full name:\t");
		str = sc.nextLine();
		this.fullName = str;
		System.out.println("address:\t");
		str = sc.nextLine();
		this.address = str;
		System.out.println("phone:\t");
		str = sc.nextLine();
		this.phone = str;
		System.out.println("email:\t");
		str = sc.nextLine();
		this.email = str;
		sc.close();
	} 
	
	public void showInfoCustomer() {
		System.out.println("===============================");
		System.out.println("-- full name:" + this.fullName);
		System.out.println("-- address:" + this.address);
		System.out.println("-- phone:" + this.phone);
		System.out.println("-- email:" + this.email);
	}
	
	
	
}
