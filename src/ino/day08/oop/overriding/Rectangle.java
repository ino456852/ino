package ino.day08.oop.overriding;

public class Rectangle extends Shape{
	// @Override // 어노테이션 생략 가능
	public void draw() {
		System.out.println("Rectangle");
	}
}
