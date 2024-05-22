package ino.day02.operrator;

public class Exam_Unery {

	public static void main(String[] args) {
		// 단항 연산자
		// a++, ++a -> a = a+1;
		int a1 = 1;
		System.out.println(++a1);
		System.out.println(a1++);
		System.out.println(a1);
		
		// 문제1
		// a가 10, b는 20, c는 30
		// a++;
		// b = (--a) + b;
		// c = (a++) + (--b);
		//a, b, c의 값은 얼마일까요?
		// a = 11, b = 29, c = 39
		int a = 10;
		int b = 20;
		int c = 30;
		
		a++;
		b = (--a) + b;
		c = (a++) + (--b);
		System.out.println("a = "+ a +", b = " + b +", c = "+c);
		
		boolean flag = true;
		flag = !!!!flag;
		System.out.println(flag);
		
		int x = 100;
		int y = 33;
		int z = 0;
		x--;		// x = 100, y = 33, z = 0

		z = x-- + --y;		// x = 99, y = 32, z = 131

		x = 99 + x++ + x;		// x = 99, y = 32, z = 131

		y = y-- + y + ++y; 		// x = 99, y = 33, z = 131
		// x = 99, y = 32, z = 131

		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		
	}

}
