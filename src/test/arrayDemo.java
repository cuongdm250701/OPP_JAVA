package test;

import java.util.Scanner;

public class arrayDemo {

	public static void main(String[] args) {
	    int arrInt[] = new int[10];
		Scanner sc = new Scanner(System.in);
		int ele;
		for(int i=0; i < 10; i++ ) {
			System.out.printf("nhap vao phan tu thu %d \n", i);
			ele = sc.nextInt();
			arrInt[i] = ele;
		}
		System.out.println("================");
		for(int i = 0; i < 10; i++) {
			System.out.printf("Phan tu thu %d: \n", i);
			System.out.println(arrInt[i]);
		}
		sc.close();

	}

}
