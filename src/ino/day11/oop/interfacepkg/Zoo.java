package ino.day11.oop.interfacepkg;

public class Zoo {

	public static void main(String[] args) {
		ZooKeeper z = new ZooKeeper();
		
		z.feed(new Lion());
		z.feed(new Tiger());
		z.feed(new Bear());
	}

}
