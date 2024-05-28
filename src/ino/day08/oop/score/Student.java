package ino.day08.oop.score;

import java.util.Scanner;

public class Student {
	// 멤버 필드
	 int kor;
	 int eng;
	 int math;
	
	// 생성자
	public Student () {}	// Student 객체 생성하기 위해 필요
	
	
	// 멤버 메소드
	// 메뉴 출력
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 메인 메뉴 ======");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 >>");
		int choice = sc.nextInt();
		return choice;	// void가 있으면 반환못함

}
	// 성적 입력
	public void inputScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 성적 입력 =====");
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();
	}
	// 성적 출력
	public void printScore() {	// static 메소드 에선 non static 변수를 사용하지 못함
		System.out.println("===== 성적 출력 =====");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " + (kor+eng+math));
		System.out.println("평균 : " + (kor+eng+math)/3.0);
	
		
	}
	// 메시지 출력
	public void displayMsg(String massage) {	
		// massage = "프로그램을 종료합니다";
		System.out.println(massage);
	}
}
