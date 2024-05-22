package ino.day03.control.loof.exercise;

import java.util.Scanner;

public class Exercise_loop5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print(" 단 입력 = ");
		int dan = sc.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			
			System.out.println(dan + " x " + i + " = " + dan*i);
		}
	}

}
