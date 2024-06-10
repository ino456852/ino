package ino.day15.stream.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam_FileCopy {
	public static void main(String [] args) {
		// C드라이브에 있는 파일을 E드라이브로 복사해보자
		// C:\Temp\Image20240610143445.png -> D:\temp\Image20240610143445.png
		
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream("C:\\Temp\\Image20240610143445.png");
			os = new FileOutputStream("D:\\temp\\Imag.png");
			int readCount;		// 읽은 값 저장할 변수
			byte[] bytes = new byte [3];		// bytes 배열길이 3 생성
			while((readCount = is.read(bytes)) != -1) {		// bytes가 불러온 값이 -1이 아닐때까지
				os.write(bytes,0,readCount);			// bytes의 0부터 조건식에서 readCount에 bytes의 값을 넣었으니 3까지
				os.flush();							// 버퍼 지우기 
			}
			System.out.println("복사 완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				is.close();		// 자원 해제
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		InputStream is = null;
//		OutputStream os = null;
//		
//		try {
//			is = new FileInputStream("C:\\Temp\\Image20240610143445.png");
//			os = new FileOutputStream("D:\\temp\\img.png");
//			byte [] bytes = new byte[1024];
//			int readCount;
//			while((readCount = is.read(bytes)) != -1) {
//				os.write(bytes,0,readCount);
//				os.flush();
//			}
//			System.out.println("복사가 완료되었습니다");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				is.close();
//				os.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
	}
}
