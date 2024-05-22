package ino.day04.array.preactice;

import java.util.Scanner;

public class preactice2 {

	public static void main(String[] args) {
		// 길이가 10인 배열
		// 1 ~ 10까지 역순으로 배열에서 출력하기
//			System.out.print("정수 입력 : ");
//			arrs[i] = sc.nextInt();
//			System.out.println(arrs[i] + " ");
//		int[] arrs = new int[10];
//
//		Scanner sc = new Scanner(System.in);
////		int count = 10;
//		for (int i = 0, count = 10; i < 10; i++, count--) {
//			arrs[i] = count;
//		}
//		for (int i = 0; i < 10; i++) {
//			arrs[i] = 10 - i;
//		}
//		for(int i = 0; i < 10; i++) {
//			System.out.print(arrs[i] + " ");
//		}
		// 배열 선언
		int []arr = new int[10];
		// for문으로 초기화
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		// 역순으로 출력
		System.out.println("배열의 값 (역순) : ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
				
				
	}

}
