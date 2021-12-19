package midterm;

import java.util.ArrayList;
import java.util.Scanner;

public class Store extends Book {
	int totalItems = 0;
	final int  maxItems = 10;
	
	ArrayList<Book> book = new ArrayList<Book>();
	Scanner input = new Scanner(System.in);
	public void add() {
//		Scanner input = new Scanner(System.in);
		Book b1 = new Book();
		System.out.println("Nhap id sach: \n");
		b1.setId(input.nextInt());
		input.nextLine();
		System.out.println("Nhap ten sach:\n");
		b1.setName(input.nextLine());
		System.out.println("Nhap gia sach:\n");
		b1.setPrice(input.nextInt());
		book.add(b1);
		totalItems++;
//		input.close();
	}
	
	public void edit() {
		int idSua;
		
//		Book b1 = new Book();
		System.out.println("Nhap vao id sach:\n");
		idSua = input.nextInt();
		
		for(int i =0; i < book.size(); i++) {
			if(book.get(i).getId() == idSua) {
				input.nextLine();
				System.out.println("Nhap ten sach moi:\n");
				book.get(i).setName(input.nextLine());
				System.out.println("Nhap gia sach moi:\n");
				book.get(i).setPrice(input.nextInt());
				System.out.println("Sua thanh cong !!");
				break;
			}
			
		}
	}
	
	public void delete() {
		int idXoa;
		
		Book b1 = new Book();
		System.out.println("Nhap vao id sach can xoa: \n");
		idXoa = input.nextInt();
		for(int i = 0; i < book.size(); i++) {
			if(book.get(i).getId() == idXoa) {
				book.remove(i);
				System.out.println("Xoa thanh cong !!");
				break;
			}
		}
		totalItems--;
	}
	
	public void find() {
		String name;
		Book b1 = new Book();
		System.out.println("Nhap vao ten sach");
		input.nextLine();
		name  = input.nextLine();
		for(int i = 0; i < book.size(); i++) {
			if(book.get(i).getName().equalsIgnoreCase(name)) {
				System.out.println(book.get(i));
				System.out.println("Da tim thay !!");
				break;
			}
		}
	}
	
	public void list() {
		System.out.println("Tong so sach trong kho la: " + totalItems);
	}
}
