package ino.day09.oop.encapsulation;

import ino.day09.inheritance.Point;

class Super {
	public int pub;
	int def;
	protected int pro;
	private int pri;
}
class Sub extends Super{
	void set() {
		Super sup = new Super();
		sup.pro = 507;
		super.pub = 24;
		super.def = 24;
		super.pro = 24;
//		super.pri = 1023;	//is not visible
	}
}

class ShowPoint extends Point{
	void set() {
		Point p = new Point();
		p.pub = 24; // public 이라 접근가능
//		p.def = 57; // default는 같은 패키지 에서만 가능
//		p.pro = 10; // protected는 같은 패키지 또는 상속일 때 가능
//		p.pri = 24 // 당연히 안됨 private
		
		super.pub = 2024;
//		super.def = 507;
		super.pro = 23;		// super.pro 상속 후 다른패키지 일 때 가져오는법
//		super.pri = 223;
	}
}
public class Exam_Protected {
	
	
	
}
