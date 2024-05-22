package 연습;

import java.util.Scanner;

public class d3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1부터 사용자에게 입력 받은 수까지의
		// 정수들의 합을 for문을 이용하여 출력하세요
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			sum += i;
			System.out.print(i + "  ");
		}
		System.out.println("총 합 : " + sum);
	}

}
