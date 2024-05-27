package ino.day07.oop.exercise;

public class Suit {
	
	public static void main(String[] args) {
		Suit s = new Suit(100);
	}
	private int size;
	private String brand;
	private int price;
	
	public Suit(int size) {	// 18번째줄 호출
		// 22번째 줄 출력 후 14번째 줄 완료
		this(size,"Hazzys");
		
		System.out.println("Suit(int)호출!!");
	}
	public Suit(int size,String brand) {
		this(size,brand, 100000);	//28번째 호출
		// 34번째 줄 출력 후 19번째 줄 완료
		
		System.out.println("Suit(int,String)호출");
	}
	
	
	
	
	public Suit(int size,String brand,int price) {
	
			this.size = size;
			this.brand = brand;
			this.price = price;
			
			System.out.println("Suit(int,String,int)호출");
	}
	
}
