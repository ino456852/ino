package ino.day16.soket.basic;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SoketClient {
	public static void main(String[] args) {
		String address = "127.0.0.1";	// 나혼자 할때 쓰는 번호
		int port = 8888;
		try {
			Socket socket = new Socket(address,port);
			System.out.println("서버와 연뎔되었습니다.");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
