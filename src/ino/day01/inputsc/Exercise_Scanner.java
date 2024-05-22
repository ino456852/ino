package ino.day01.inputsc;

import java.util.Scanner;

public class Exercise_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 = ");
			String name = sc.next();
		System.out.print("도시 = ");
			String city = sc.next();
		System.out.print("나이 = ");
			int age = sc.nextInt();
		System.out.print("체중 = ");
			int body = sc.nextInt();
		System.out.print("독신 = ");
			boolean solo = sc.nextBoolean();
		
		System.out.print("이름은 "+name+" 도시는 "+city+" 나이는 "+age+" 체중은 "+body+" 독신 여부는 "+solo+" 입니다");
	}

}
