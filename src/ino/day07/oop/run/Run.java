package ino.day07.oop.run;

import java.util.Scanner;

import ino.day07.oop.Book;
import ino.day07.oop.Circle;
import ino.day07.oop.exercise.Rectangle;

// 실행용 클래스
public class Run {

	public static void main(String[] args) {
		Run ex = new Run();
		Run.oopExercise();
		oopExercise();
//		Math.random();
		
		

		

		

	}
	public void constructorEx() {
		// 생성자 예제 연습
//		Book book = new Book();	// 기본 생성자 이용해서 객채 생성
//								// title, author는 모두 비어있음
//		
//		book.title = "춘향뎐";
//		book.author = "작자미상";

		Book book = new Book("춘향뎐", "작자미상");
		Book emptyBook = new Book();
	}
	
	public static void oopPrectice () {
		// 예제1
				// Circle의 instance를 이용하여
				// 이름이 달덩이, 반지름은 5인
				// Circle의 넓이를 출력해보세요
				Circle circle = new Circle();

				circle.name = "달덩이"; // name을 public으로 해서 쓸수있음
				circle.radius = 5;
				double area = circle.getRedius();
				System.out.println(area); // 메소드 안의 계산식으로 계산한걸 출력함

				Circle donut = new Circle();
				donut.radius = 2;
				donut.name = "던킨도넛";
				area = donut.getRedius();
				System.out.println(area);
	}
	
	public static void oopExercise () {
		Circle bintz = new Circle();
//		bintz.radius = 10;
		bintz.setRadius(10);

		Scanner sc = new Scanner(System.in); // 값 입력받기
		Rectangle re = new Rectangle(); // 클래스 불러오기
		System.out.print("너비 입력 : ");
		re.width = sc.nextDouble();
		System.out.print("높이 입력 : ");
		re.height = sc.nextDouble();

		double result = re.result();
		System.out.println("사각형의 넓이는 " +  result + "입니다.");
	}
	
	public static void memberPectice() {
		Scanner sc = new Scanner(System.in); // 값 입력받기
		Rectangle re = new Rectangle(); // 클래스 불러오기
		System.out.print("너비 입력 : ");
		re.width = sc.nextDouble();
		System.out.print("높이 입력 : ");
		re.height = sc.nextDouble();

		double result = re.result();
		System.out.println("사각형의 넓이는 " +  result + "입니다.");
	}
}
