package ino.day04.contril.loof;

public class Exam_ForDouble {

	public static void main(String[] args) {
		// 중첩 for문 - for문 안의 for문
		// 문법
		// for ( ) { for ( ) { } }
		// 복합대입연산자
		// i = i + 1;
		// i++;
		// i += 1;
		
		// i = i * 2;
		// i *= 2;
		
		// i = i + 2; 
		// i += 2;
		
		System.out.println("2 x 2 = 4");
		System.out.println("2 x 3 = 6");
		System.out.println("2 x 4 = 8");
		System.out.println("2 x 5 = 10");
		System.out.println("2 x 6 = 12");
		System.out.println("2 x 7 = 14");
		System.out.println("2 x 8 = 16");
		System.out.println("2 x 9 = 18");
//		int dan = 2;
		for (int i = 2; i <= 9; i++) {
			// 1. i는 2일 때 시작
			// 2. 안에 있는 for문으로 2단출력
			// 4. i는 3이 되어서
			// 5. 안에있는 for문으로 3단출력
			// 7. i는 4가되어서
			// 8. 안에 있는 for문으로 4단출력
			// 10. 조건식이 false가 되므로 중첩 for문 동작 끝
			for (int j = 2; j <= 9; j++) {
				// 2단 출력중
				System.out.println(i + " x " + j + " = " + i*j);
				
			}
			//3. 2단출력이 모두 끝나면 바깥 for문에 증감식 동작
			// 6. 3단 출력 끝, 끝나면 바깥 for문에 증가식 동작
			// 9. 4단 출력 끝, 끝나면 바깥 for문에 증가식 동작
//			dan++;
		}
	}

}
