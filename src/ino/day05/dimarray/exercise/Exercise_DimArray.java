package ino.day05.dimarray.exercise;

public class Exercise_DimArray {

	public void practice() {

		int[][] nums = new int[5][5];
		int num = 1;
//		for (int i = 0; i < nums.length; i++) {
//			for (int j = 0; j < nums[i].length; j++) {
//				nums[i][j] = num;
//				num--;
//			}
//			num +=10;
//		}
//		for (int i = 0; i < nums.length; i++) {
//			for (int j = 0; j < nums[i].length; j++) {
//				System.out.print(nums[i][j] + " ");
//			}
//			System.out.println();
//		}
	}

	public void practice3() {
		int[][] arrs = new int[5][5];
		int k = 1;
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs.length; j++) {
				arrs[j][i] = k++;
			}
		}
		for (int[] arr : arrs) {
			for (int num : arr) {
				System.out.print(num + "\t");
			}
			System.out.println();
		}
	}

	public void practice4() {
		// 1 2 3 4 5
		// arrs[0][0] arrs[0][0] arrs[0][0] arrs[0][0] arrs[0][0]
		// 10 9 8 7 6
		// arrs[0][0] arrs[0][0] arrs[0][0] arrs[0][0] arrs[0][0]
		// 11 12 13 14 15
		//
		int[][] arrs = new int[5][5];
		int k = 1;
		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < 5; j++) {
					arrs[i][j] = k;
					k++;
				}

			} else {
				for (int j = 4; j >= 0; j--) {
					arrs[i][j] = k++;
				}

			}

		}
	}
}
