package opp_in_java;

import java.util.Scanner;

public class Worker {
	Scanner sc = new Scanner(System.in);
	public String name;
	public int age;
	public String address;
	public double salary;
	public int workTime;
	
	public Worker() {}
	
	public Worker(String name, int age, String address, double salary, int workTime) {
		this.name = name;
		this.age  = age;
		this.address = address;
		this.salary = salary;
		this.workTime = workTime;
	}
	
	public void inputInfo() {
		System.out.print("Nhap ten: ");
		this.name = sc.nextLine();
		System.out.print("Nhap tuoi: ");
		this.age = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhap dia chi: ");
		this.address = sc.nextLine();
		System.out.print("Nhap luong: ");
		this.salary = sc.nextDouble();
		System.out.print("Nhap so gio lam viec: ");
		this.workTime = sc.nextInt();
		sc.close();
	}
	
	public void printInfo() {
		System.out.print("NAME: " + this.name + "\n");
		System.out.print("AGE: " + this.age + "\n");
		System.out.print("ADDRESS: " + this.address + "\n");
		System.out.print("SALARY: " + this.salary + "\n");
		System.out.print("SUM HOURS: " + this.workTime + "\n");
	}
	
	public void bonus() {
		if(this.workTime >= 200) {
			this.salary *= 0.2;
		} else if(this.workTime < 200 && this.workTime >= 100) {
			this.salary *= 0.1;
		}
	}
	
}
