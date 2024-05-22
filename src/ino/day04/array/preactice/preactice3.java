package ino.day04.array.preactice;

import java.util.Scanner;

public class preactice3 {

	public static void main(String[] args) {
//		사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
//		1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		int []nums = new int[num];
		
		if (num > 0) {
			for (int i = 0; i < nums.length; i++) {
				nums[i] = i + 1;
			}
			for (int i = 0; i < nums.length; i++) {
				System.out.print(nums[i] + " ");
			
		} 
			
		
//		int []arrs = new int[sc.nextInt()];
		
//		if(input > 0) {
//			int []arrs = new int[input];
//			for (int i = 1; i <= input; i++) {
//				arrs[i-1] = i;
//				System.out.print(arrs[i-1] + " ");
//			}
//			System.out.println();
//			for (int i = 0; i < input; i++) {
//				arrs[i] = i+1;
//				System.out.print(arrs[i] + " ");
//		}
		
		}
//		for (int i = 0; i < arrs.length; i++) {
//			int 
//			arrs[i] = i;
//			
//		}
//		for (int i = 0; i < arrs.length; i++) {
//			System.out.print(arrs[i] + " ");
//		}
	}

}
