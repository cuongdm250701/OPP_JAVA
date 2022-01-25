package opp_in_java;



public class DateTime {
	
	int date;
	int month ;
	int year;
	
	public void setDate(int date) {
		this.date = date;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getDate() {
		return this.date;
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public void showDate() {
		System.out.print("DATE:" + this.getDate() + "\n");
		System.out.print("MONTH: " + this.getMonth() + "\n");
		System.out.print("YEAR:" + this.getYear() + "\n");
		System.out.print(this.getDate() + "-" + this.getMonth() + "-" + this.getYear());
	}
}
