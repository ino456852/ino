package ino.day08.oop.objectarray.student;


public class ManageStudent {
	static Student[] students = new Student[3];

	public Student [] printInfo() {
		return students;
		}
	

	public void inputInfo(Student [] students) {
		this.students = students;
	}

}
