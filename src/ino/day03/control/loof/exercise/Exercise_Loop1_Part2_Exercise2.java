package ino.day03.control.loof.exercise;

import java.util.Scanner;

public class Exercise_Loop1_Part2_Exercise2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for(int i = 0; i < num; i++) {
			System.out.println("*");
			for (int j = 1; j < num; j++) {
				System.out.print("*");
			}
			
		}
	}

}
