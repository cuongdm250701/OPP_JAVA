package opp_in_java;

public class Account {
	int id;
	String name;
	int balance;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	public void credit(int amount) {
		this.balance += amount;
	}
	
	public int debit(int amount) {
		if(this.balance >= amount) {
			this.balance -= amount;
			return 1;
		}else {
//			System.out.print("Tai khoan khong du");
			return 0;
		}
	}
	
	public void tranferTo(Account account, int amount) {
		int check = this.debit(amount);
		if(check == 1) {
			account.credit(amount);
		} else if(check == 0) {
			System.out.print("Tai khoan khong du\n");
		}
		
	}
	
	public void showInfomation() {
		System.out.print("ID: " + this.getId() + "\n" );
		System.out.print("NAME: " + this.getName() + "\n");
		System.out.print("BALANCE: " + this.getBalance() + "\n");
	}
}
