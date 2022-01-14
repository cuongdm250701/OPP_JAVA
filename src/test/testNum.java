package test;

import java.io.*;

public class testNum {

	public static void main(String[] args) {
		int n = 0;
		try {
			System.out.println("Nhap vao so bat ky: ");
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String s;
			s = in.readLine();
			n = Integer.parseInt(s);
		}catch(Exception e) {
			System.out.println("Nhap loi!");
		}
		System.out.println("Ban vua nhap so: "+ n);
	}

}
