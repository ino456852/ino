package ino.day06.arraysort;

public class Exma_ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정렬
		// 크기가 5인 배열이 있고 24 5 7 10 23
		// 7 24 5 23 10 -> 5 7 10 23 24
		// 01. 정렬 알고리즘
		// 알고리즘이란 문제 해결을 하귀 위한 절차나 방법,
		// 프로그래밍 언어로 어떻게 해결할 것인가를 고민해 가는 것
		// 02. 정렬 알고리즘 종류
		// 1. 삽입정렬
		// 2. 선택정렬
		// 3. 버블정렬
		// 4. 퀵정렬
		// 5. 병합정렬
		// 자리바꿈 발생
		// 1. 자리바꿈은 어떻게 해결할 것인가?
		// 2. 어떤 조건이 만족하면 바꿀것인가?
		
		int num1 = 5;
		int num2 = 7;
		System.out.printf("num1 : %d, num2 : %d", num1 , num2);
		// num1 에는 7이 들어가고 num2 에는 5가 들어가도록 해야함.
		
		int temp = num1;
		num1 = num2;	//사라지기 전에 5를 저장해야함
		num2 = num1;
		System.out.printf("num1 : %d, num2 : %d \n", num1 , num2);
		
		int nums [] = {2, 1, 3};
		int s = nums[0];
		nums[0] = nums[2];
		nums[2] = s;
		
		s = nums[1];
		nums[1] = nums[2];
		nums[2] = s;
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		int [] arrs = {24, 5 ,7};
		// 5 7 24 이 되도록 바꿔 보세요
		
		s = nums[0];
		// 0 5 7   //27 0 0
		int d = nums[1];
		// 0 5 0   //0 0 7
		arrs[0] = arrs[1];
		// 5 5 0  // 0 0 7
		arrs[1] = arrs[2];
		// 5 27 0  // 0 0 7
		arrs[2] = s;
		// 5 27 27
		for (int n : arrs) {
			System.out.println(n);
		}
				
	}

}
