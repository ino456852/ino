package ino.day08.oop.objectarray.student;

import java.util.Scanner;

public class StudentApp {


	public static void main(String[] args) {
//		====== 메인메뉴 ======
	//				1. 성적입력
	//				2. 성적출력
	//				3. 종료
	//				선택 : 1
	//
	//				이름 : 일용자
	//				첫번째 점수 : 70
	//				두번째 점수 : 55
	//				이름 : 이용자
	//				첫번째 점수 : 80
	//				두번째 점수 : 55
	//				이름 : 삼용자
	//				첫번째 점수 : 88
	//				두번째 점수 : 33
	//
	//				====== 메인메뉴 ======
	//				1. 성적입력
	//				2. 성적출력
	//				3. 종료
	//				선택 : 2
	//
	//				======1번째 학생의 정보 출력 ======
	//				일용자 학생의 첫번째 점수는 70점, 두번째 점수는 55점입니다.
	//				======2번째 학생의 정보 출력 ======
	//				이용자 학생의 첫번째 점수는 80점, 두번째 점수는 55점입니다.
	//				======3번째 학생의 정보 출력 ======
	//				삼용자 학생의 첫번째 점수는 88점, 두번째 점수는 33점입니다.
		ManageStudent msg = new ManageStudent();
		ViewStudent view = new ViewStudent();
		끝 :
		while(true) {
			int input = view.printMenu();
			Student [] students = null;
			switch(input) {
			inputInfo();
			case 1 :
				inputInfo();
				
				break;
			case 2 :
				printInfo();
				break;
			case 3 :
				displayMsg("프로그램을 종료합니다.");
				break 끝;
			default :
				displayMsg("1 ~ 3 사이의 수를 입력해주세요.");
			}
		}
	}
	
	
	

	
	
	
	

}
