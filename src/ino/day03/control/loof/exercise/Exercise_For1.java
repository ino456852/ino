package ino.day03.control.loof.exercise;

import java.util.Scanner;

public class Exercise_For1 {

	public static void main(String[] args) {
		// 정수 하나를 입력받아서 그 수가 1 ~ 9사이의 수 일때만
		// 그 수의 구구단을 출력하세요.
		// 단, 조건이 맞지 않으면 "1 ~ 9사이의 양수를 입력하여야 합니다"ㄹ,ㄹ
		// 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int dan = sc.nextInt();
		int sum;

		if(dan < 10 && dan > 1) // 단이 10보다 작고, 단이 1보다 크다면
			for(int i = 2; i <= 9; i++) {
				System.out.println("------------------");
				for(int j = 2; j <= 9; j++) {
					sum = i*j;
					System.out.println(i + "*" + j + "=" + sum);
				}
			} else {
				System.out.println("1 ~ 9사이의 양수를 입력하여야 합니다");
		}
//		if (dan > 1 && dan <= 9) {
//			for (int i = 2; i < 10; i++) {
//				System.out.println(dan + " * " + i + " = " + dan * i);
//			}
//		} else {
//			System.out.println("1 ~ 9사이의 양수를 입력하여야 합니다.");
//		}
	}

}
