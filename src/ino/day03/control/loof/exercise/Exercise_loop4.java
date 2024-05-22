package ino.day03.control.loof.exercise;

import java.util.Scanner;

public class Exercise_loop4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 = ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 = ");
		int num2 = sc.nextInt();
		int sum = 0;
		
		if(num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			
		}else {
			// 입력된 두개의 값중 작은값은 초기식에 큰값은 조건식에 입력되도록
//			힌트, min max를 사용하는 방법도 있음
			int min = 0, max = 0;
			if(num1 > num2) {
				max = num1;
				min = num2;
			}else {
				max = num2;
				min = num1;
			}
			for (int i = min+1; i < max; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			for (int i = num1; i <= num2; i++) { //num1이 무조건 num2보다 작다고 가정
				sum = num1+num2;
				System.out.print(i+ " ");
		}
			
		}
			
			
	}

}
