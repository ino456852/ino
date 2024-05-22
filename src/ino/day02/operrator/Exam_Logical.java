package ino.day02.operrator;

public class Exam_Logical {
	public static void main(String [] args) {
		// 논리연산자 예제
		// 남자이면서 평균평점 4.3이상인 사람 -> and &&
		// 컴퓨터 공학과 또는 경영학과인 사람 -> or  ||
		boolean result1, result2, result3, result4;
//		boolean result2;
//		boolean result3;
//		boolean result4;
		// and -> &&, or -> ||
		int num1 = 50;
		int num2 = 30;
		result1 = (num1 == num2) && (num1 < num2); // false
		System.out.println("결과값1 : " + result1); 
		result2 = (num1 < num2) || (num1 == num2);// false
		System.out.println("결과값2 : " + result2);
		result3 = (num1 > num2) && (num1 != num2);// true
		System.out.println("결과값3 : " + result3);
		result4 = (num1 > num2) || (num1 == num2);// true
		System.out.println("결과값4 : " + result4);
		
		int a = 50;
		int b = 30;
		// a!=b (true) && a<b (false) false
		// a < b (false) || a == b (false) false
		// a > b (true) && a != b (true) true
		// a > b (true) || a == b (false) true
		boolean result5 = a != b && a < b;
		boolean result6 = a < b || a == b;
		boolean result7 = a > b && a != b;
		boolean result8 = a > b || a == b;
		
		System.out.println(result5);
		System.out.println(result6);
		System.out.println(result7);
		System.out.println(result8);
		
		int aa = 70;
		int bb = 55;
		boolean result9;
		boolean result10;
		boolean result11;
		boolean result12;
		// a == b (false) || a++ < 100 (true) true a=70 b=55
		// a < b (false) && --b < 55 (true) false a=71 b= 55
		// a != b (true) && b-- < a++ (true) true a=72 b=54
		// a++ != b (true) || b++ >= 85 (false) true a=73 b=53
		// a=73
		// b=54
		result9 = aa == bb || aa++ < 100;
		result10 = aa < bb && --bb < 55; // and의 경우 앞의 결과가 false면 뒤는 연산x
		result11 = aa != bb && bb-- < aa++;
		result12 = aa++ != bb || bb++ >= 85;// or의 경우 앞의 결과가 true면 뒤는 연산x
		
		System.out.println("result9 = " + result9);
		System.out.println("result10 = " + result10);
		System.out.println("result11 = " + result11);
		System.out.println("result12 = " + result12);
		System.out.println("aa = " + aa);
		System.out.println("bb = " + bb);
	}
}
