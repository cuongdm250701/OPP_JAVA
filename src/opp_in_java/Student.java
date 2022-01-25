package opp_in_java;
import java.util.Scanner;

public class Student {
	Scanner sc = new Scanner(System.in);
	String code;
	double avgPoint;
	int age;
	String className;
	
	public Student() {}
	
	public Student(String code, double avgPoint, int age, String className) {
		this.code = code;
		this.avgPoint = avgPoint;
		this.age = age;
		this.className = className;
	}
	
	public void inputInfo() {
		System.out.print("Nhap code: ");
		this.code = sc.nextLine();
		System.out.print("Nhap tuoi: ");
		this.age = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhap diemTB: ");
		this.avgPoint = sc.nextDouble();
		sc.nextLine();
		System.out.print("Nhap lop: ");
		this.className = sc.nextLine();
		sc.close();
	}
	
	public int checkCode(String code) {
		if(code.length() == 8) {
			return 1;
		}
		return 0;
	}
	
	public int checkAvg(double avgPoint) {
		if(avgPoint >= 0.0 && avgPoint <= 10.0) {
			return 1;
		}
		return 0;
	}
	
	public int checkAge(int age) {
		if(age >18) {
			return 1;
		}
		return 0;
	}
	
	public int checkClass(String className) {
		if("A".equals(className.charAt(0)) || "C".equals(className.charAt(0)) ) {
			return 1;
		}
		return 0;
	}
	
	public void showInfo() {
		int checkCode = this.checkCode(this.code);
		int checkAge = this.checkAge(this.age);
		int checkClass = this.checkClass(this.className);
		int checkAvg = this.checkAvg(this.avgPoint);
		if(checkCode == 1) {
			System.out.print("CODE: " + this.code);
		}
		if(checkAge == 1) {
			System.out.print("CODE: " + this.age);
		}
		if(checkClass == 1) {
			System.out.print("CODE: " + this.className);
		}
		if(checkAvg == 1) {
			System.out.print("CODE: " + this.avgPoint);
		}
	}
}
