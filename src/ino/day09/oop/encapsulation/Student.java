package ino.day09.oop.encapsulation;

public class Student {
	
	private int fScore;
	private int sScore;
	private String name;
	
	
	public Student() {
		
	}
	
	public Student(String name, int firstScore, int secondScore) {
		this.name = name;
		this.fScore = firstScore;
		this.sScore = secondScore;
	}
	
	public void setFScore(int fScore) {
		this.fScore = fScore;
	}
	public void setSScore(int sScore) {
		this.sScore = sScore;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getFScore() {	// this 안붙여도 됨
		return fScore;
	}
	public int getSScore() {
		return sScore;
	}
	
	public String getName() {
		return this.name;
	}
	
	
	
	
	
	public String toString () {
		return this.name+" 학생의 첫번째 점수는 " + this.fScore + "점, 두번째 점수는 "
				+this.sScore + "점입니다.";
	}
}
