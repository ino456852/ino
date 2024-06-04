package ino.day10.oop.polymorphism;

class Car{}
class Sonata extends Car{}
class Genesis extends Car{}
class GV80 extends Genesis{}

public class Exam_InstenceOf {
	
	static void print (Car car) {
		if (car instanceof Sonata) {
			System.out.println("소나타 점프 방방!");
		}
		if (car instanceof Genesis) {
			System.out.println("제네시스 스웩 부릉~");	
		}
		if(car instanceof GV80) {
			System.out.println("GV80");		
		}//GV80이 제네시스의 상속을 받아서 두번 출력  
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(new Car());
		// 조상 클래스
		print(new Sonata());
		// 자손 클래스
		print(new Genesis());
		// 자손 클래스
		print(new GV80());
		// 자손 의 자손클래스
		
	}

}
