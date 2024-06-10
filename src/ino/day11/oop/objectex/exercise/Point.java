package ino.day11.oop.objectex.exercise;

public class Point {
	int x;
	int y;

	public Point() {
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {
		Point point = (Point) obj;
		return x == point.x && y == point.y;
	}
//		if (x == point.x && y == point.y) {
//			return true;
//		} else {
//			return false;
//		}
}
