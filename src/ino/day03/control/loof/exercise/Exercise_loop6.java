package ino.day03.control.loof.exercise;

import java.util.Scanner;

public class Exercise_loop6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		if (dan <= 9) {
			for (int i = dan; i <= 9; i++) {
				
				for(int j = 2; j <= 9; j++) {
					System.out.println(i + " x " + j + " = " + i * j);
			}
			}
		} else {
			System.out.println("9 이하의 숫자만 입력 해주세요");
		}
	}

}
