package exercise_3;

import java.util.Scanner;

public class Card extends Student {
	
	int idCard;
	String dateBorrow;
	String expierd_at;
	int idBook;
	
	
	public void inputCard() {
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("idCard:");
		idCard = sc.nextInt();
		System.out.println("date borrow:\t");
		dateBorrow = sc.nextLine();
		this.dateBorrow = dateBorrow;
		System.out.println("idBook:");
		idBook = sc.nextInt();
		System.out.println("expierd_at:\t");
		expierd_at = sc.nextLine();
		this.expierd_at = expierd_at;
		super.inputInfo(); 
		sc.close();
	}
	
	public void showCard() {
		System.out.println("===========================");
		System.out.println("idCard:" + this.idCard);
		System.out.println("dateBorrow:" + this.dateBorrow);
		System.out.println("expierd_at:" + this.expierd_at);
		System.out.println("idBook:" + this.idBook);
		super.showInfo();
	}
	

}
