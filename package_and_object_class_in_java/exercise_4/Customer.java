package exercise_4;

import java.util.Scanner;

public class Customer {
	String name;
	int numberHome;
	int codeMeter;
	Scanner sc = new Scanner(System.in);
	public void inputFamily() {
		System.out.println("name:\t");
		name = sc.nextLine();
		System.out.println("number home:\t");
		numberHome = sc.nextInt();
		System.out.println("code meter:\t");
		codeMeter = sc.nextInt();
		sc.nextLine();
	}
	
	public void showInfo() {
		System.out.println("name:" + this.name);
		System.out.println("number home:" + this.numberHome);
		System.out.println("code meter:" + this.codeMeter);
	}
}
