package ino.day04.array.preactice;

import java.util.Scanner;

public class preactice10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String idNum = sc.next();
		
		char [] idNums = new char[idNum.length()];		// 입력 받은 문자열을 char 타입으로 받는다.
		for(int i = 0; i < idNums.length; i++) {
			idNums[i] = idNum.charAt(i);	// 스트링으로 받은 문자열을 한글자씩 char로 변경
		}
		char [] copy = new char[idNums.length]; // 복사할 새로운 배열
		
		for (int i = 0; i < idNums.length; i++) {	// 변환된 문자들의 for문
//			copy[i] = idNums[i];		
			if (i < 8) {		// 8번 자리 전 까지
				copy[i] = idNums[i];	// 새로운 배열에 변환된 문자들을 넣기
			} else {
				copy[i] = '*';	// 8번 자리 후 부터 *표시
			}
		}
		for (char num : copy) {		// 얕은 복사
			System.out.print(num);
		}
	}

}
