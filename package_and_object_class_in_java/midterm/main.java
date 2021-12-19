package midterm;

import java.util.Scanner;

public class main {

	public static void select() {
		System.out.println("An phim 1 de them sach\n");
		System.out.println("An phim 2 de sua sach\n");
		System.out.println("An phim 3 de tim sach\n");
		System.out.println("An phim 4 de xoa sach\n");
		System.out.println("An phim 5 de tong sach\n");
		System.out.println("An phim 0 de thoat\n");
		System.out.println("==========================");
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int select;
		Store store = new Store();
		while(true) {
			select();
			select = input.nextInt();
			switch(select)
			{
			case 1: 
			{
				store.add();
				break;
			}
			case 2: 
			{
				store.edit();
				break;
			}
			case 3: 
			{
				store.find();
				break;
			}
			case 4: 
			{
				store.delete();
				break;
			}
			case 5: 
			{
				store.list();
				break;
			}
			default:
			{
				System.out.println("===== The end =====");
				break;
			}
			}
			if(select == 0) {
				break;
			}
			
		}
		
		
		
	}

}
