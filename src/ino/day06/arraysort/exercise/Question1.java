package ino.day06.arraysort.exercise;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = 5;
		int [] arrs = new int[5];
		int min;
		
		for (int i = 0; i < arrs.length; i++) {
			System.out.print(i+1 +"번째 정수 입력 : ");
			k = sc.nextInt();
			arrs[i] = k;
		}
		// 2 5 3 1 4
		
		
		
		for (int i = 0; i < arrs.length-1; i++) {
			for(int j = 0; j < (arrs.length-1)-i; j++){
					if (arrs[j] > arrs[j+1]) {
						int temp = arrs[j];
						arrs[j] = arrs[j+1];
						arrs[j+1] = temp;
					}
			}
		}
		for (int num : arrs) {
			
		System.out.print("정렬된 결과 : " + num + " ");
		System.out.println('1'+'1');
		}
	}

}



































/*
 * 		1. 크기 5인 정수 배열 생성
 * 		int [] nums = new int [5];
 * 		Scanner sc = new Scanner(System.in);
 * 		2. 배열에 값 입력하기 5번
 * 		for (int i = 0; i < nums.length; i++) {
 * 				System.out.print(i+1 + "번째 정수 입력 : ");
 * 				int num = sc.nextInt();
 * 				nums[i] = num;
 *      }
 *      3. 정렬하기 - 버블정렬 알고리즘
 *      1 - 2, 2 - 3, 3 - 4, 4 - 5
 *      최대값을 맨 오른쪽에 위치하면서 정렬하는 알고리즘
 *      1 - 2, 2 - 3, 3 - 4
 *      1 - 2, 2 - 3
 *      1 - 2
 *      for(int i = 0; i < nums.length-1; i++) {
 *      	for(int j = 0; j < (nums.length-1)-i; j++) {
	 *      	if(nums[0] > nums[1] {
	 *      	int temp = nums[1];
	 *      	nums[1] = nums[0]
	 *      	nums[0] = temp;
	 *      	}
 *      	}
 *      }
 *      4. 출력하기
 *      for (int num : nums) {
 *      	System.out.println(nums + " ");
 *      	}
 *      }
 *      5. 처음과 끝 합해서 출력하기
 *      System.ot.print(nums[0]+nums[4]);
 */


