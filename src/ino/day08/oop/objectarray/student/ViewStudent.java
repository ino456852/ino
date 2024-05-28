package ino.day08.oop.objectarray.student;

import java.util.Scanner;

public class ViewStudent {
	

	public Student [] displayInput() {
		Scanner sc = new Scanner(System.in);
		Student [] students = new Student [3];
		for (int i = 0; i < students.length;i++) {
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("첫 번째 점수 : ");
			int fScore = sc.nextInt();
			System.out.print("두 번째 점수 : ");
			int sScore = sc.nextInt();
			students[i] = new Student(name,fScore,sScore);
			
		}
		return students;
		
	}
	public void displayInfo(Student [] student) {
		for (int i = 0; i < student.length; i++) {
			System.out.println(students[i].toString());
		}
	}
	public void displayMsg(String msg) {
		System.out.println(msg);
	}

		private int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 메인 메뉴 =====");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.println("선택 >> ");
		int choice = sc.nextInt();
		return choice;
	}
}
