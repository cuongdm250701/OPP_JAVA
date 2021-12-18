package exercise_4;

import java.util.Scanner;

public class Invoice  {
	
	double oldNumber;
	double newNumber;
	double pay;
	Scanner sc = new Scanner(System.in);
	public void inputInvoice() {
	
		System.out.println("old number: \t");
		oldNumber = sc.nextDouble();
		System.out.println("new number: \t");
		newNumber = sc.nextDouble();
		pay = (newNumber - oldNumber) * 850000;
//		sc.close();
		
	}
	
	public void showInfo() {
		System.out.println("old number: " + this.oldNumber);
		System.out.println("new number: " + this.newNumber);
		System.out.println("pay: " + this.pay);
	}
}
