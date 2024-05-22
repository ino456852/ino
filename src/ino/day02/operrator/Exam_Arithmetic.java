package ino.day02.operrator;

import java.util.Scanner;

public class Exam_Arithmetic {
	public static void main(String [] args) {
		// 산술 연산
		// +, -, *, /, %
		// % : 나머지를 구해주는 연산자
		// 문제1
		// 초 단위의 정수를 입력받고,몇시간, 몇분, 몇초인지 출력하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력할 초 : ");
		int num1 = sc.nextInt();
		int num2 = (num1/60) % 60;	// 분
		int num3 = num1 / 60 / 60;	// 시간
		int num4 = num1 % 60;	// 초
		System.out.println(num3 + "시간 " + num2 + "분 " + num4 + "초");
	}
}
