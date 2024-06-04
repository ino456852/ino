package ino.day10.oop.abstractex.exercise;

public class CalcRen {

	public static void main(String[] args) {
		Calculator  C = new GoodCalc(); 
		
//		GoodCalc gC = new GoodCalc();
		System.out.println("합 : " + C.add(5, 7));
		System.out.println("차 : " + C.substract(10, 23));
		int [] nums = {5,7,10,23};
//		System.out.println("평균 : " + C.average(new int [] {5,7,10,23}));
		System.out.println("평균 : " + C.average(nums));
	}

}
