package ino.day15.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Read_ByteOff {

	public static void main(String[] args) {
		InputStream is = null;

		try { 
			is = new FileInputStream("src/ino/day15/stream/inputstream/reading.txt");
			byte[] readBytes = new byte[3];
			int readCount;
			String result = "";
			while (true) {
				readCount = is.read(readBytes, 0 , 3);	//0부터 3까지 
				if (readCount == -1) break;
				result += new String(readBytes, 0, readCount);
			}
			is.close();
			System.out.println(result);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 예외가 발생하든 안하든반드시 실행하는 코드
			try {
				is.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
