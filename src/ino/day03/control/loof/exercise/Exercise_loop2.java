package ino.day03.control.loof.exercise;

import java.util.Scanner;

public class Exercise_loop2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		if (num >= 1)
			for (int i = num; i >= 1; i--) {
				System.out.print(i + " ");
			}
		else {
			System.out.println("1 이상의 숫자를 입력해주세요");
		}

	}
}
