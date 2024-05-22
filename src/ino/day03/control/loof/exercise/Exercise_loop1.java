package ino.day03.control.loof.exercise;

import java.util.Scanner;

public class Exercise_loop1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 사용자로부터 입력받기 위한 준비
		System.out.print("정수 입력 : ");	// 가이드 메시지
		int num = sc.nextInt();				// 정수 하나 입력받기 위한 명령어,
											// 입력받은 후 num에 저장
		// 정수 입력 : 5
		// 1 2 3 4 5
		
		if (num >= 1)	
		for(int i = 1; i <= num; i++) { 	
			
			System.out.print(i + " ");
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요");
		}
	}

}
