package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.String;

public class inverstString {

	public static void main(String[] args) {
		try {
			System.out.println("Nhap vao chuoi bat ky: ");
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String s =in.readLine();
			
			System.out.println("Chuoi vua nhap la: " + s);
			int strLength = s.length();
			String newStr ="";
			for(int i = strLength -1; i >= 0; i--) {
//				System.out.println("da vao day");
				
				newStr += s.charAt(i);
//				System.out.println("da vao day");
			}
			System.out.println("Chuoi sau khi invert la: "+ newStr );
		}catch(Exception e) {
			System.out.println("Nhap loi!");
		}

	}

}
