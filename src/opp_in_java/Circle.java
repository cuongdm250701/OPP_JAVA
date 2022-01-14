package opp_in_java;


public class Circle {
	double radious;
	String color;
	
	public Circle() {}
	
	public Circle(double radious, String color){
		this.radious = radious;
		this.color = color;
	}
	
	public Circle(double radious) {
		this.radious = radious;
	}
	
	public Circle(String color) {
		this.color = color;
	}
	
	public void setRadious(double radious) {
		this.radious = radious;
	}
	
	public double getRadious() {
		return this.radious;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	} 
	
	public void showCircle() {
		System.out.println("Radious: " + getRadious());
		System.out.println("Color: " + getColor());
	}
}
