package ino.day04.contril.loof.exercise;

public class Exercise_ForDouble {
	public static void main(String[] args) {
//		*
//		**
//		***
//		****
//		*****
//		******
//		System.out.print("*");
//		System.out.println();
//		
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();

		for (int i = 1; i < 7; i++) {	//1
			for (int j = 0; j < i; j++) {	//2
				System.out.print("*");	//3
			}
			System.out.println("");	//4
		}

//		for(int i = 1; i < 7; i++) {
//			System.out.print("*");
//			for(int j = 1; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
	}
}
