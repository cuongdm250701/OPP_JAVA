package opp_in_java;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
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
		System.out.println("**********************************");
		System.out.println("RECTANGLE \n");
		Rectangle rec1 = new Rectangle();
		System.out.println("Nhap width: ");
		double width = sc.nextDouble();
		rec1.setWidth(width);
		System.out.println("\n");
		System.out.println("Nhap length: ");
		double length = sc.nextDouble();
		rec1.setLength(length);
		System.out.println("==============");
		rec1.showRectangle();
		System.out.println("==============");
		Rectangle rec2 = new Rectangle(6.0, 3.0);
		rec2.showRectangle();
		System.out.println("***********************************");
		System.out.println("EMPLOYEE \n");
		Employee e = new Employee();
		System.out.println("Nhap id: ");
		int id =sc.nextInt();
		e.setId(id);
		System.out.println("\n");
		System.out.println("Nhap first name: ");
		sc.nextLine();
		String firstName = sc.nextLine();
		e.setFirstName(firstName);
		sc.nextLine();
		System.out.println("\n");
		System.out.println("Nhap last name: ");
		String latstName = sc.nextLine();
		e.setLastName(latstName);
		sc.nextLine();
		System.out.println("\n");
		System.out.println("Nhap salary: ");
		double salary = sc.nextDouble();
		e.setSalary(salary);
		System.out.println("======================");
		e.showInfomation();
		
		Account acc1 = new Account();
		Account acc2 = new Account();
		acc1.setId(1);
		acc1.setName("Cuongdz");
		acc1.setBalance(1000);
		acc2.setId(2);
		acc2.setName("Tuyet Ngoc");
		acc2.setBalance(500);
		System.out.print("Nhap so tien muon chuyen: ");
		int amount  = sc.nextInt();
		acc1.tranferTo(acc2, amount);
		acc1.showInfomation();
		System.out.print("-------\n");
		acc2.showInfomation();
		
		
		Calendar calendar = new GregorianCalendar();
		Date date = new Date();
		DateTime datetime = new DateTime();
		datetime.setDate(date.getDate());
		datetime.setMonth(date.getMonth() + 1);
		datetime.setYear(calendar.get(Calendar.YEAR));
		datetime.showDate();
		
		Worker worker = new Worker();
		worker.inputInfo();
		worker.bonus();
		System.out.print("---------\n");
		worker.printInfo();
		
		Student student = new Student();
		student.inputInfo();
		student.showInfo();
		sc.close();
	}

}
