package ino.day04.array.preactice;

import java.util.Scanner;

public class preactice1 {

	public static void main(String[] args) {
//		길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
//		순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
//
//		ex.
//		1 2 3 4 5 6 7 8 9 10
		
		int [] arr = new int[10];
		
//		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			arr[i] = i + 1;
		}
		for (int i = 0; i < 10; i++) {
//			System.out.print("정수 입력 : ");
//			arr[i] = sc.nextInt();
			
			System.out.print(arr[i] + " ");	
		}
		
	}

}
