package ino.day07.oop;

public class Book {

	String title;
	String author;

	public Book() {
		this("", "");
	}

	public Book(String title, String author) {

		this.title = title;
		this.author = author;

	}

	// 멤버필드
	// 이름 bookTitle
	// 가격 bookPrice
	// 저자 bookAuthor
	// 카테고리 category
	// 출판사 publisher
	// 출판날자 publisingDate
//	String title;
//	int price;
//	String author;
//	String category;
//	String publisher;
//	String publisingDate;

	// 멤버메소드
	// 빌려주다, 팔리다, 입고되다(등록), ...
}
