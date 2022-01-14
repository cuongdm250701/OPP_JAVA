package test;
import java.io.*;

public class testing {

	public static void main(String[] args) {
		char ch = ' ';
		try {
			System.out.print("vui long nhap ky tu: ");
			ch = (char) System.in.read();
		}catch (Exception e) {
			System.out.println("Nhap loi");
		}
		System.out.println("Ky tu vua nhap:" + ch);
		

	}

}
