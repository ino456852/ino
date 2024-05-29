package ino.day09.oop.encapsulation;

public class Circle {
	
	public double radius;
	private String name;
	
	
	// setter()메소드
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// getter()메소드
	public double getRadius() {
		return this.radius;
	}
	public String getName() {
		return this.name;
	}
	
	
	public Circle () {}
	
	
	public double getArea() {
		double area = 3.14*this.radius*this.radius;
		return area;
	}
}
