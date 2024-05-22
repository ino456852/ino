package ino.day02.control.contition.exercise;

import java.util.Scanner;

public class Exam_if1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 0~100 : ");
		int score = sc.nextInt();
		System.out.print("학년을 입력하세요(1~4) : ");
		int grade = sc.nextInt();
		
		if(grade < 4 && score >= 60) {
			System.out.println("합격입니다");
		} else {
			System.out.println("불합격입니다");
		}
	}

}
