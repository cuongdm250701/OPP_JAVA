package exercise_4;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Customer  customer = new Customer();
		Invoice invoice = new Invoice();
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Amount family: \t");
		n = sc.nextInt();
		while(n>0) {
			customer.inputFamily();
			System.out.println("invoice");
			invoice.inputInvoice();
			System.out.println("========");
			customer.showInfo();
			invoice.showInfo();
			System.out.println("next to:\n");
			n = n -1;
			
		}
		sc.close();

	}

}
