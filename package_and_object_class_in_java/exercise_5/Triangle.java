package exercise_5;
import java.lang.Math;

public class Triangle extends Polygon {
	
	public void inputValue() {
		super.inputValue();
	}
	
	public int perimeter() {
		return super.perimeter();
	}
	
	public void showValueEdge() {
		super.showValueEdge();
	}
	
	public void acreage() {
		int p = perimeter() / 2;
		int SS = p;
		for(int i =0; i < this.sizeEdge.size(); i++) {
			SS *= (p - this.sizeEdge.get(i)); 
		}
		System.out.println("acreage:" + Math.sqrt(SS));
	}
}
