package ino.day05.dimarray.exercise;

public class Exercise_DimArray1 {

	public static void main(String[] args) {
		int[][] nums = new int[5][5];
		int num = 5;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = num;
				num--;
			}
			num +=10;
		}
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
//		for (int i = 0; i < 5; i++) {
//			for(int j = 4; j >= 0; j--) {
//				nums[i][j] = num;
//				num ++;
//			}
//		}
//		for(int [] arr : nums) {
//			for(int input : arr) {
//				System.out.print(input + "\t");
//				
//			}
//			System.out.println();
//		}
	}
}
