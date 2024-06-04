package ino.day10.oop.abstractex;

class Line extends Shape{
	@Override
	public void draw() { 		// 추상클래스가 조상이면 무조건 오버라이딩 해야함
	}
}

// 추상클래스
// 그냥 클래스
public abstract class Shape {
	String name;
	public Shape() {}
	public void paint() {}	// 일반 메소드
	public abstract void draw();	//추상 메소드 몸체 {}없음, 있으면 반드시 추상클래스
}
