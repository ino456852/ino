package ino.day07.oop;

public class Circle {
	// 반지름
	// 이름
	public String name;
	public double radius;
	
	public void setRadius(double radius) {
	this.radius = radius;
	}
	// 넓이구하기
	
	public double getRedius() {
//		return을 쓰면 public 옆에
//		리턴값과 같은 데이터타입을 써야함
		return 3.14*this.radius*this.radius;
	}
}
