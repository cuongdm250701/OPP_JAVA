package test;

public class bubbleSort {

	public static void main(String[] args) {
		int arrInt [] = { 99,-10,1000123,18,-978, 5623,463,-9,287,49};
		for(int i =0; i < arrInt.length - 1; i++ ) {
			for(int j =0; j < arrInt.length - 1 -i; j++) {
				if(arrInt[j] > arrInt[j+1]) {
					int temp = arrInt[j];
					arrInt[j] = arrInt[j+1];
					arrInt[j+1] = temp;
				}
			}
		}

	}

}
