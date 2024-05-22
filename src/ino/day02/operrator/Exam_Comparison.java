package ino.day02.operrator;

public class Exam_Comparison {

	public static void main(String[] args) {
		// 비교연산자
		// 더이상 = 이꼬르가 아니다
		// 이꼬르는 ==다
		int num1 = 50;
		int num2 = 30;
		boolean result;
		result = (num1 > num2);
		result = (num1 < num2);
		result = (num1 == num2);	// 값이 같을 때 true
		result = (num1 != num2);	// 값이 다를 때 true
		System.out.println("result = " + result);
		double a = (int)3.14 + 5.4;
		System.out.println(a);
		int b = (int)3.14 + 5;
		System.out.println(b);
	}

}
