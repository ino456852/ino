package ino.day05.dimarray.exercise;

public class Exercise_DimArray3 {

	public static void main(String[] args) {
		int [][]arrs = new int [5][5];
		int k = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arrs[j][i] = k++;
			}
		}
		for (int []arr : arrs) {
			for (int num : arr) {
				System.out.print(num + "\t");
			}
			System.out.println();
		}
	}
}
