package ino.day08.oop.student.prectice;

import java.util.Scanner;

import javax.swing.Spring;

public class ViewStudent {
	
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===== 메인 메뉴 =====");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		int choice = sc.nextInt();
		return choice;
	}
	
	public void printMsg(String Message) {
		System.out.println(Message);
	}
}
