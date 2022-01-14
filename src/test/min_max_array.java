package test;

public class min_max_array {

	public static void main(String[] args) {
		int arrInt [] = { 0,9,6,2,5,8,3,7,8,2 };
		int max = arrInt[0];
		int min = arrInt[0];
		for(int i = 1; i < arrInt.length; i++) {
			if(arrInt[i] >= max) {
				max = arrInt[i];
			}
			if(arrInt[i] <= min) {
				min = arrInt[i];
			}
		}
		System.out.printf("so lon nhat trong mang la: %d\n", max);
		System.out.printf("so nho nhat trong mang la: %d\n", min);

	}

}
