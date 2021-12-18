package exercise_3;

import java.util.Calendar;
import java.util.Scanner;

public class Student {
	String fullName;
	int yearOfBirth;
	String classStudent;
	int currentYear = Calendar.getInstance().get(Calendar.YEAR);
	int age = currentYear - yearOfBirth;
	
	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("full name: \t");
		str = sc.nextLine();
		this.fullName = str;
		System.out.println("class: \t"); 
		str = sc.nextLine();
		this.classStudent = str;
		System.out.println("yearOfBirth: \t");
		yearOfBirth = sc.nextInt();
		this.yearOfBirth = yearOfBirth;
		this.age = age;
		sc.close();
	}
	
	public void showInfo() {
		System.out.println("===========================");
		System.out.println("full name:" + this.fullName);
		System.out.println("class:" + this.classStudent);
		System.out.println("year of birth:" + this.yearOfBirth);
		System.out.println("age:" + this.age);
	}
	
}
