package ino.day13.collection.music.modell;

import java.util.ArrayList;
import java.util.List;

public class ManageMusic {

	private List<Music> mList;

	public ManageMusic() {
		mList = new ArrayList<Music>();
	}

	public void registerMusic(Music music) {
		mList.add(music);

	}

	public void registerMusicAtFirst(Music music) {
		mList.add(0, music);

	}

	public List<Music> getAllMusics() {
		return mList;
	}

	public Music searchMusicByTitle(String name) {
		if (name != "" && name != null) {
			for (Music music : mList) {
				if (name.equals(music.getTitle())) {
					return music;
				}
			}
		}
		return null;
	}

	public int searchIndexByName(String name) {
		if (name != "" && name != null) {
			int index = 0;
			for (Music music : mList) {
				if (name.equals(music.getTitle())) {
					return index;
				}
				index++;
			}
		}
		return 0;
	}

	public void modifyMusic(int index, Music music) {
		mList.set(index, music);
	}

	public void deleteMusic(int index) {
		mList.remove(index);
	}
}
