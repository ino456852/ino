package ino.day04.contril.loof.exercise;

public class Exercise_ForDouble2 {

	public static void main(String[] args) {
		// 0시 0분부터 23시 59분까지 출력하기
		// 하나씩 해보고 합치기
		
		for (int i = 0; i < 24; i++) {
//			System.out.print(i + "시");
			for (int j = 0; j < 60; j++) {
				System.out.println(i + "시 "+j + "분");
			}
		}
		
	}

}
