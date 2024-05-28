package ino.day08.oop.score;

import java.util.Scanner;

public class ScoreProgran2 {

	static int kor;
	static int eng;
	static int math;	// ScoreProgran2 클래스의 멤버필드
	public static void main(String[] args) {
		finish :
		while(true) {
			int choice = printMenu();	// 반환된 메소드 대입
			switch(choice) {
			case 1 : 
				inputScore();
				break;
			case 2 :
				printScore();
				break;
			case 3 :
				displayMsg("프로그램을 종료합니다.");
				break finish;
			default:
				displayMsg("1 ~ 3 사이의 수를 입력해주세요.");
				
			}
		}
	}
	private static void displayMsg(String massage) {	
		// massage = "프로그램을 종료합니다";
		System.out.println(massage);
	}
	
	public static void printScore() {	// static 메소드 에선 non static 변수를 사용하지 못함
		System.out.println("===== 성적 출력 =====");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " + (kor+eng+math));
		System.out.println("평균 : " + (kor+eng+math)/3.0);
	
		
	}
	public static void inputScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 성적 입력 =====");
		System.out.println("국어 : ");
		kor = sc.nextInt();
		System.out.println("영어 : ");
		eng = sc.nextInt();
		System.out.println("수학 : ");
		math = sc.nextInt();
		System.out.println("총점 : ");
		System.out.println("평균 : ");
	}
	
	
	
	public static int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 메인 메뉴 ======");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 >>");
		int choice = sc.nextInt();
		return choice;
	}

}
