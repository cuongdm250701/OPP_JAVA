package opp_in_java;

public class Rectangle {
	double length;
	double width;
	
	public Rectangle() {}
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getLength() {
		return this.length;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public double getRectangleArea() {
		return this.width * this.length;
	}
	
	public void showRectangle() {
		System.out.println("Length: " + this.getLength());
		System.out.println("Width: " + this.getWidth());
		System.out.println("Area: " + this.getRectangleArea());
	}
}
