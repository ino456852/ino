package ino.day08.oop.objectarray;

import java.util.Scanner;

public class Exam_ObjectArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 여러 개의 책이 존재하는데 그 책의 정보를 여러개 저장하려고 함.
		// 책은 5권까지 저장할 수 있도록 하고 제목과 저자만 입력받아 저장할 수 있는
		// 프로그램을 작성하시오.
//		제목 >> 어린왕자
//		저자 >> 생택쥐패리
//		제목 >> 춘향뎐
//		저자 >> 작자미상
//		(어린왕자,생택쥐패리)
//		(춘향뎐,작자미상)
		
		Book [] books = new Book[3];
		Scanner sc = new Scanner(System.in);
		// 객체 배열 입력
		for (int i = 0;i < books.length;i++) {
			System.out.print("제목 >> ");
			String title = sc.nextLine();
			System.out.print("저자 >> ");
			String author = sc.nextLine();
			books[i] = new Book(title,author);
		}
		// 객체 배열 출력
		for (Book book : books) {
			System.out.println(book.toString());
		}
	}

}
