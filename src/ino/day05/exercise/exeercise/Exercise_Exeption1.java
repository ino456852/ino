package ino.day05.exercise.exeercise;

import java.util.Scanner;

public class Exercise_Exeption1 {

	public static void main(String[] args) {
		// 문제 1
				// 정수를 0으로 나누는 경우에 "0으로 나눌 수 없습니다!
				// 출력하고 다시 입력 받는 프로그램을 작성하시오
				
				while(true) {
					int result = 0;
					try {
						Scanner sc = new Scanner(System.in);
						System.out.print("정수 첫번째 : ");
						int num1 = sc.nextInt();
						System.out.print("정수 두번째 : ");
						int num2 = sc.nextInt();
						result = num1 / num2;
					} catch (ArithmeticException e) {
						System.out.println("0으로 나눌 수 없습니다.");
						continue;		// 중요**
					}
					System.out.println("몫 : " + result);
				}
	}

}
