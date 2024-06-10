package ino.day15.stream.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_ImageCopy {
	public static void main(String[] args) {
		// C:\Windows\Web\Wallpaper\Spotlight\img50.jpg
		// C:\Temp\copyimg.jpg
		FileInputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream("C:\\Windows\\Web\\Wallpaper\\Spotlight\\img50.jpg");
			os = new FileOutputStream("C:\\Temp\\copyimg.jpg");
			byte [] byteImges = new byte[1024];
			int readCount;
			while(true) {
				readCount = is.read(byteImges);
				if(readCount == -1) break;
				os.write(byteImges,0,readCount);
				os.flush();
			}
			System.out.println("복사가 완료되었습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}
