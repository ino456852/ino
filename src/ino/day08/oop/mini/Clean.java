package ino.day08.oop.mini;

import java.util.Scanner;

public class Clean {
	int gender;
	int age;
	int House;
	int tool;
	String colleagues;
	
	public Clean() {}
	
	public void printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 메뉴 =====");
		System.out.println("1. 정보 입력");
		System.out.println("2. 집 선택");
		System.out.println("3. 도구 선택(최대2개)");
		System.out.println("4. 동료 선택");
		int choice = sc.nextInt();
	}
	
	public void getinfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 정보 입력 =====");
		System.out.println("1. 남자\t2. 여자");
		gender = sc.nextInt();
		System.out.println("나이 : ");
		age = sc.nextInt();
	}
	
	public void getHouse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 대 저택\t2. 마당있는 주택\t3. 원룸");
		House = sc.nextInt();
		
	}
	
	public void gettool() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 전기 청소기\t2. 손걸레\t3. 3. 긴 대걸레\n4. 손수건\t5. ");
	}
	
}
