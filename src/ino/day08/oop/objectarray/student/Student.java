package ino.day08.oop.objectarray.student;

public class Student {
	
	public int fScore;
	public int sScore;
	public String name;
	
	
	public Student(String name, int firstScore, int secondScore) {
		this.name = name;
		this.fScore = firstScore;
		this.sScore = secondScore;
	}
	
	
	
	public String toString () {
		return this.name+" 학생의 첫번째 점수는 " + this.fScore + "점, 두번째 점수는 "
				+this.sScore + "점입니다.";
	}
}
