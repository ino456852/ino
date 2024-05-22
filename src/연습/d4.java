package 연습;

import java.util.Scanner;

public class d4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		//만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		if(num1 >= 1 && num2 >= 1) {
			for (int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
				}
			for (int j = num2; j <= num1; j++) {
				System.out.print(j+ " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요");
		}
	}

}
