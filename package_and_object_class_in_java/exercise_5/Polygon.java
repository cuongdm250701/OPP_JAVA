package exercise_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Polygon {
	int amountEdge;
	List<Integer> sizeEdge = new ArrayList<Integer>();
	
	int valueEdge;
	
	public void inputValue() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Amount edge:");
		amountEdge = sc.nextInt();
		for(int i = 1; i<= amountEdge; i++ ) {
			System.out.printf("edge: %d\n",i);
			valueEdge = sc.nextInt();
			sizeEdge.add(valueEdge);
		}
		sc.close();
//		System.out.println("sizeEdge: " + sizeEdge.size());
	}
	 
	public int perimeter() {
		int result = 0;
		for(int i = 0; i < sizeEdge.size(); i++ ) {
			result += sizeEdge.get(i);
		}
		System.out.println("result: "+ result);
		return result;
	}
	
	public void showValueEdge() {
		System.out.println("value edges: " + sizeEdge);
	}
	
}
