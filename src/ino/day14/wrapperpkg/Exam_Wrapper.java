package ino.day14.wrapperpkg;

public class Exam_Wrapper {

	public static void main(String[] args) {
		int num = 10;
		num = 0;
		if(num != 0) {}
		Integer su = null;
//		if(su != null) {}
		su = Integer.valueOf(57);
		su = 1023;			// 오토 - 박싱(auto-boxing)
							// 벨류오브에 넣지 않아도 됨
		num = su.intValue();
		num = su;			// 오토 - 언박싱(auto-unboxing)
		// int -> Integet
		// douvle -> Double
		// char -> Character
		// boolean -> Boolean
		// 문자열 -> 정수형 변환
		String openDay = "20240507";
		int openDate = Integer.parseInt(openDay);
		
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.toUpperCase('a'));
		char c1 = '5', c2 = 'F';
		if (Character.isDigit(c1)) {
			System.out.println(c1 + "은 숫자");
		}
		if (Character.isAlphabetic(c2)) {
			System.out.println(c2 + "은 영문자");
		}
		// ===================== 문자열로 바꾸기 ========================
		// 1. String,valueOf(1)
		// 2. +"" 붙이기
		// 3. .toString()
		System.out.println(String.valueOf(1) instanceof String);
		System.out.println(1+"" instanceof String);
		System.out.println(Integer.valueOf(1).toString() instanceof String);
	}

}
