package ino.day10.oop.interfaceex;

public interface PhoneInterface {
	// 인터페이스는 상수형 필드만 가능
	// 추상 메소드로만 구성됨
	public static final int TIME_OUT = 10000;
	
//	public String name = "일용자";	// static final 생략됨 일반필드 사용 불가
	
	public abstract void printLogo();
	
//	public void sandCall() {};	// 일반 메소드 사용 불가
	
	void sandCall(); 	// public abstract 생략 가능
	
	public default void showLogo() {
		/*
		 * 디폴트 메소드 (기능 추가)
		 * 하위 호환성을 위해 작성하며
		 * 인터페이스의 보완이 가능함.
		 */
	}

}
