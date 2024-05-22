package 연습;

import java.util.Scanner;

public class d5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자로부터 입력 받은 숫자의 단을 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " x " + i + " = " + dan*i);
		}
	}

}
