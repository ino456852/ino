package ino.day17.socket.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class BaseBallClient {

	public static void main(String[] args) {
		// 클라이언트 소켓을 생성하였습니다.
		
//		게임 준비 완료
//		숫자 입력(띄어쓰기로 구분) ex 1 2 3
		
//		--> 2 3 6
//		0 스트라이크 0볼
//		숫자 입력(띄어쓰기로 구분) ex 1 2 3
		
//		--> 1 3 6
//		1스트라이크 0볼
//		숫자 입력(띄어쓰기로 구분) ex 1 2 3
		
//		--> 1 4 6
//		2스트라이크 0볼
//		숫자 입력(띄어쓰기로 구분) ex 1 2 3
		
//		--> 6 4 1
//		1스트라이크 1볼
//		숫자 입력(띄어쓰기로 구분) ex 1 2 3
		
//		--> 5 1 4
//		0스트라이크 3볼
//		숫자 입력(띄어쓰기로 구분) ex 1 2 3

//		--> 1 4 5
//		3스트라이크 0볼
//		아웃! 게임종료!
		Socket socket = null;
		int port = 7777;
		String address = "127.0.0.1";
		OutputStream os = null;
		InputStream is = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			socket = new Socket(address,port);
			System.out.println("클라이언트소켓을 생성하였습니다.");
			os = socket.getOutputStream();
			is = socket.getInputStream();
			dos = new DataOutputStream(os);
			dis = new DataInputStream(is);
			
			System.out.println("게임 준비 완료");
			
			while(true) {
				System.out.print("숫자 입력(띄어쓰기로 구분) ex 1 2 3\n--> ");
				String sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg);
				dos.flush();
				
				String recvMsg = dis.readUTF();
				System.out.println(recvMsg);
				
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
