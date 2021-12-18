package exercise_2;

import java.util.Scanner;

public class Person {
	
	String fullName;
	String address;
	int yearOfBirth;
	
	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		String str;
		int i;
		System.out.println("full name: \t");
		str = sc.nextLine();
		this.fullName = str;
		System.out.println("address: \t");
		str = sc.nextLine();
		this.address = str;
		System.out.println("year of birth: \t");
		i = sc.nextInt();
		this.yearOfBirth = i;
		sc.close(); 
	}
	
	public void showInfo() { 
		System.out.println("===========================");
		System.out.println("full name:" + this.fullName);
		System.out.println("address:" + this.address);
		System.out.println("year of birth:" + this.yearOfBirth);
		
	}

}
