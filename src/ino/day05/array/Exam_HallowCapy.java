package ino.day05.array;

public class Exam_HallowCapy {

	public static void main(String[] args) {
		
		// 배열의 복수 중 얕은 복사
		int [] arrs = new int[4];
		
		for (int i = 0; i < arrs.length; i++) {
			arrs[i] = i*i;
		}
		// for-each문
		// 원래
		// for (int i = 0; i < arrs.length; i++)
		for (int i : arrs) {
			System.out.print(i + " ");
		}
		System.out.println();
		int [] copy = arrs;
		for (int i : copy) {
			System.out.print(i + " ");
		}
		copy[1] = 11;
	}

}
