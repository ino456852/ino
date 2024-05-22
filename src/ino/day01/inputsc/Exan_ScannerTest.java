package ino.day01.inputsc;

import java.util.Scanner;

public class Exan_ScannerTest {

	public static void main(String[] args) {
//		System.out.println("Test");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("하나의 수를 입력해주세요 : ");
		int a = sc.nextInt();
		System.out.print("더할 수를 입력해주세요 : ");
		int b = sc.nextInt();
		System.out.print(a+b);
	}

}
