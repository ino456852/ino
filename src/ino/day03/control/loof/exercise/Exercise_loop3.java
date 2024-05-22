package ino.day03.control.loof.exercise;

import java.util.Scanner;

public class Exercise_loop3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 할 숫자 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= num; i++) {
			sum += i;
			if (i != num) System.out.print(i + " + ");
			else System.out.print(i +" = ");
		}
			System.out.println(sum);
			System.out.println("총합 : " + sum);
			System.out.println("1부터 " + num + "까지의 합 : " + sum);
			System.out.printf("1부터 %d까지의 합 : %d\n",num,sum);
	}

}
