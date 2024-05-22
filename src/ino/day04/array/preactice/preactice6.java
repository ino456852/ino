package ino.day04.array.preactice;

import java.util.Scanner;

public class preactice6 {

	public static void main(String[] args) {
//		“월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
//		입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
//		범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
//		String []day = new String[7];
//		String []day = {"월요일","화요일","수요일",}
//		day[0] = "월요일";
//		day[1] = "화요일";
//		day[2] = "수요일";
//		day[3] = "목요일";
//		day[4] = "금요일";
//		day[5] = "토요일";
//		day[6] = "일요일";
//		int []weeks = new int[num];
		if(num < 0 || num > 6) {
			System.out.println("잘못 입력하셨습니다.");
		}else {
			char [] weeks = {'월','화','수','목','금','토','일'};
			System.out.println(weeks[num] + "요일");
		}
	}

}
