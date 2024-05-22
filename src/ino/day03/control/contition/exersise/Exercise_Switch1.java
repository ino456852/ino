package ino.day03.control.contition.exersise;

import java.util.Scanner;

public class Exercise_Switch1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주문 할 커피 메뉴 : 1. 에스프레소, 2. 카푸치노, 3.아메리카노, 4. 카페라떼");
		int coffee = sc.nextInt();
		int price = 0;
		
		switch(coffee) {
			case 1 : 
				price = 3000;
//				System.out.println("에스프레소 3000원 입니다");
				break;
			case 2 :
				price = 4000;
//				System.out.println("카푸치노 4000원 입니다");
				break;
			case 3 :
				price = 3000;
//				System.out.println("아메리카노 3000원 입니다");
				break;
			case 4 :
				price = 4000;
//				System.out.println("카페라떼 4000원 입니다");
				break;
			default :
				System.out.println("없는 메누입니다");
		}
		if(price != 0)
			System.out.println(price+"원 입니다.");
	}

}
