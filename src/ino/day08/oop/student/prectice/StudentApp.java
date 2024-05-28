package ino.day08.oop.student.prectice;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ManageStudent studentApp = new ManageStudent();
		ViewStudent viewStdnet = new ViewStudent();
		
		while (true) {
			viewStdnet.printMenu();
			int choice = 0;
			switch(choice) {
			case 1 :
				studentApp.inputScore();
				break;
			case 2 :
				studentApp.printScore();
				break;
			case 3 :
				viewStdnet.printMsg("프로그램을 종료합니다.");
				break;
			default :
				viewStdnet.printMsg(" 1 ~ 3 까지 선택해주세요.");
				
			}
		}
	}

}
