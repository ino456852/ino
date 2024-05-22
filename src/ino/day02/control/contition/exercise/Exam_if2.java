package ino.day02.control.contition.exercise;

import java.util.Scanner;

public class Exam_if2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("주문하시겠어요? 각겨을 알려드립니다.\n (에스프레소, 카푸치노, 카페라떼, 아메리카노\n메뉴를 입력해주세요 : ");
		
		String menu = sc.next();
		if(menu.equals("에스프레소")) { // 문자열 비교는 ==이 안됨, 문자열 비교는 equals
			System.out.println("2500원 입니다");
		} else if (menu.equals("카푸치노")) {  // contains 메소드도 있음!! 포함되면 true 리턴!!
			System.out.println("4000원 입니다");
		} else if (menu.equals("카페라떼")) {
			System.out.println("4000원 입니다");
		} else if (menu.equals("아메리카노")) {
			System.out.println("3000원 입니다");
		} else {
			System.out.println("없는메뉴 입니다");
		}
	}

}
