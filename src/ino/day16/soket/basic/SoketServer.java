package ino.day16.soket.basic;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SoketServer {
	public static void main(String [] args) {
		ServerSocket serverSocket = null;
		int port = 8888;
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("클라이언트의 열결을 기다리고 있습니다..");
			Socket socket = serverSocket.accept();
			System.out.println("연결이 완료되었습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
