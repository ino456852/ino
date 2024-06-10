package ino.day15.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {

	public static void main(String[] args) {
//		InputStream is = new InputStream();		// 최상위 클래스라 객채생성 못함
		InputStream is = null;		
		int readByte;	// 읽은 값을 저장할 변수 선언
		try {	// 문자 하나하나 반복
			is = new FileInputStream("src/ino/day15/stream/inputstream/reading.txt");
			do {
				readByte = is.read();	// 저장
				System.out.print((char)readByte);	// byte로 리턴하기 때문에 강제 형변환
			} while(readByte != -1);	// 범위를 벗어나면 -1이 됨
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
