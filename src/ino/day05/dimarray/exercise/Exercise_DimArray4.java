package ino.day05.dimarray.exercise;

public class Exercise_DimArray4 {

	public static void main(String[] args) {
		// 1 2 3 4 5
		// arrs[0][0] arrs[0][0] arrs[0][0] arrs[0][0] arrs[0][0]
		// 10 9 8 7 6
		// arrs[0][0] arrs[0][0] arrs[0][0] arrs[0][0] arrs[0][0]
		// 11 12 13 14 15
		// 
		int [][] arrs = new int [5][5];
				int k = 1;
		for (int i = 0; i < 5; i++) {
			if(i % 2 ==0) {
			for (int j = 0; i < 5; j++) {
				arrs[i][j] = k++;
			}
			
			}else {
				for(int j = 4; j >= 0; j--) {
				arrs[i][j] = k++;
			}
				
			}
		}
	}
}
