package ino.day10.oop.interfaceex;

public class SamsungPhone implements PhoneInterface{

	@Override
	public void printLogo() {
		System.out.println("===== SAMSUNG =====");
	}

	@Override
	public void sandCall() {
		System.out.println("===== S-PHONE CALL =====");
	}
	
}
