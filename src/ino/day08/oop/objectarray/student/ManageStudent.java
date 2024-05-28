package ino.day08.oop.objectarray.student;

import java.util.Scanner;

public class ManageStudent {
	static Student []student = new Student[3];
	
	public static void printInfo () {
		for(int i = 0; i < student.length; i++) {
			System.out.println(student[i].toString());
		}
	}
	

		
	public static void displayMsg(String msg) {
		System.out.println(msg);
	}

	
}
