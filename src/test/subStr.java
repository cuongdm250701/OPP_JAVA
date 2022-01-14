package test;

import java.util.Scanner;

public class subStr {

	public static void main(String[] args) {
		System.out.println("nhap vao chuoi bat ki:");
		Scanner sc = new Scanner(System.in);
		String str;
		str = sc.nextLine();
		sc.close();
		String result = str.substring(4,7);
		System.out.println("chuoi ban dau: \n" + str);
		System.out.println("chuoi sau khi cat: \n" + result);

	}

}
