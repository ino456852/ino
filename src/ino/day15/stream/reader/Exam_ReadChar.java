package ino.day15.stream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReadChar {

	public static void main(String[] args) {
		Reader reader = null;
		
		try {
			reader = new FileReader("src/ino/day15/stream/reader/Reading.txt");
			int readCount;
			char [] cBuf = new char[3];
			String result = "";
			while(true) {
				readCount = reader.read(cBuf);
				if(readCount == -1) break;
				result += new String (cBuf, 0 , readCount);
			}
			System.out.println(result);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
