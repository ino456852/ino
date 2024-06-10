package ino.day11.oop.interfacepkg.music;

public class Stage {

	public static void main(String[] args) {
		Musicion musicion = new Musicion();
		musicion.play(new Drum());
		musicion.play(new Guitar());
		musicion.play(new Piano());
	}

}
