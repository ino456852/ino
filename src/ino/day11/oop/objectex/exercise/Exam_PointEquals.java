package ino.day11.oop.objectex.exercise;

public class Exam_PointEquals {

	public static void main(String[] args) {
		Point p1 = new Point(5, 5);
		Point p2 = new Point(7, 5);

		if (p1.equals(p2)) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}
	}

}
