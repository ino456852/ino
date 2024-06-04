package ino.day12.collection.student;

import java.util.List;
import java.util.Scanner;

public class StudentRun {

	public static void main(String[] args) {
		ViewStudent view = new ViewStudent();
		ManageStudent mng = new ManageStudent();
		end: while (true) {
			int input = view.printMenu();
			switch (input) {
			case 1:
				Student std = view.inputStudent();
				mng.registerStudent(std);
				break;
			case 2:
				String name = view.inputName();
				List<Student> sList = mng.searchOnebyName(name);
				view.displayStudents(sList);
				break;
			case 3:
				List<Student> stdList = mng.selectAllStudents();
				view.displayStudents(stdList);
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 0:
				view.displayMsg("프로그램을 종료합니다.");
				break end;
			default:
				view.displayMsg("잘못 입력하셨습니다.");
				break;
			}
		}
	}

}
