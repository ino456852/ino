package ino.day08.oop.student;

import java.util.Scanner;

public class ViewStudent {

	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 메인 메뉴 ======");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 >>");
		int choice = sc.nextInt();
		return choice; // void가 있으면 반환못함

	}

	public void displayMsg(String massage) {
		// massage = "프로그램을 종료합니다";
		System.out.println(massage);
	}

}
