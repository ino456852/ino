package ino.day08.oop.student.prectice;

import java.util.Scanner;

public class ManageStudent {

	int kor;
	int eng;
	int math;
	
	public void inputScore() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		math = sc.nextInt();
	}
	
	public void printScore() {
		System.out.println("===== 성적 출력 =====");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " + (kor+eng+math));
		System.out.println("평균 : " + (kor+eng+math)/3.0);
	}
}
