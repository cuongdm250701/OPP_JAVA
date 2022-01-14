package opp_in_java;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle c1 = new Circle();
		System.out.println("Nhap radious: ");
		double radious = sc.nextDouble();
		c1.setRadious(radious);
		System.out.println("\n");
		sc.nextLine();
		System.out.println("Nhap color: ");
		String color = sc.nextLine();
		c1.setColor(color);
		System.out.println("========\n");
		c1.showCircle();
		System.out.println("========\n");
		Circle c2 = new Circle(1.0, "yellow");
		c2.showCircle();
		System.out.println("========\n");
		Circle c3 = new Circle(1.0);
		c3.showCircle();
		System.out.println("========\n");
		Circle c4 = new Circle("green");
		c4.showCircle();
	}

}
