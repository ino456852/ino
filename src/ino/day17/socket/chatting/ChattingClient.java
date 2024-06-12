package ino.day17.socket.chatting;

import java.io.*;
import java.net.*;
import java.util.*;

public class ChattingClient {

	public static void main(String[] args) {
		Socket socket = null;
		int port = 5555;
		String address = "127.0.0.1";
		OutputStream os = null;
		InputStream is = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			socket = new Socket(address,port);
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			
			System.out.println("서버와 연결이 완료 되었습니다.");
			while(true) {
				String recvMsg = dis.readUTF();
				if("end".equals(recvMsg)) {
					System.out.println("상대방이 채팅을 종료하였습니다.");
					break;
				}
				
				System.out.println("서버(상대) :  " + recvMsg);
				System.out.print("클라이언트(나) : ");
				String sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg);
				dos.flush();
				
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
