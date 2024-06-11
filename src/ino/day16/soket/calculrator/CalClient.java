package ino.day16.soket.calculrator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class CalClient {
//	서버에 연결중입니다...
//	서버와 연결되었습니다!
//
//	계산식(빈칸으로 띄어 입력, 예 24 + 42) >> 24 + 42
//	계산 결과 : 66

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
			Socket socket = null;
			String address = "127.0.0.1";
			int port = 9999;
			OutputStream os = null;
			InputStream is = null;
			DataOutputStream dos = null;	// 입력값을 보내는 클래스
			DataInputStream dis = null;
			try {
				socket = new Socket(address, port);
				System.out.println("서버와의 연결이 완료되었습니다.");
//			socket.getInputStream();
				os = socket.getOutputStream();
				is = socket.getInputStream();
				dos = new DataOutputStream(os);
				dis = new DataInputStream(is);
				while(true) {
					System.out.print("계산식(빈칸으로 띄어 입력, 예 24 + 42) >> ");
					String sendMsg = sc.nextLine();
					dos.writeUTF(sendMsg);
					dos.flush();
					String recvMsg = dis.readUTF();
					System.out.println("계산 결과 : " + recvMsg);
					
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
