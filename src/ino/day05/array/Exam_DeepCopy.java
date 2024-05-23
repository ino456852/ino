package ino.day05.array;

public class Exam_DeepCopy {

	public static void main(String[] args) {
		// 배열 복사 중 깊은 복사
		
		int [] arrs = {0, 1, 4, 9}; 
		int [] copy = new int [4];	// 새로운 배열의 공간을 만들어야 함
		
		for (int i = 0; i < arrs.length; i++) {		// arrs배열의 값을 하나씩 넣어준다
			copy[i] = arrs[i];						// 복사 코드
		}
		copy[1] = 11;
		for (int i : copy) {					//for-each문
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i : arrs) {
			System.out.print(i + " ");
		}
	}

}
