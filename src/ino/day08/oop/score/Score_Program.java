package ino.day08.oop.score;

import java.util.Scanner;

public class Score_Program {

	public static void main(String[] args) {
//		==== 메인 메뉴 ====
//		1. 성적입력
//		2. 성적출력
//		3.종료
//		선택 : 
		Scanner sc = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;
		end :
		while (true) {
			System.out.println("===== 메인 메뉴 =====");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			System.out.print("선택 : ");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("===== 성적 입력 =====");
				System.out.println("국어 : ");
				kor = sc.nextInt();
				System.out.println("영어 : ");
				eng = sc.nextInt();
				System.out.println("수학 : ");
				math = sc.nextInt();
				break;
			case 2:
				System.out.println("===== 성적 출력 =====");
				System.out.println("국어 : " + kor);
				System.out.println("영어 : " + eng);
				System.out.println("수학 : " + math);
				System.out.println("총점 : " + (kor+eng+math));
				System.out.println("평균 : " + (kor+eng+math)/3.0);
				break;
			case 3:
				System.out.println("프로그램이 종료 되었습니다.");
				break end;
			default:
				System.out.println("1 ~ 3 사이의 숫자를 입력해주세요.");
				break;
			}
		}

	}

}
