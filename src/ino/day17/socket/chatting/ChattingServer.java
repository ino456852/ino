package ino.day17.socket.chatting;

import java.io.*;
import java.net.*;
import java.util.*;

public class ChattingServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		int port = 5555;			// 서로 port가 맞아야 정성작동함
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("클라이언트의 연결을 기다리고 있습니다...");
			socket = serverSocket.accept();
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);		// 보조 스트림 주 스트림을 전달값으로 받는다
			dos = new DataOutputStream(os);		// 보조 스트림	
			
			System.out.println("클라이언트와 연결이 되었습니다.");
			while(true) {
				System.out.print("서버(나) : ");
				String sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg);
				if("end".equals(sendMsg)) break;
				dos.flush();
				
				String recvMsg = dis.readUTF();
				System.out.println("클라이언트(상대) : " + recvMsg);
				
			}
			
//			String [] data = sendMsg.split(" ");
//			int num1 = Integer.parseInt(data[0]);
//			int num2 = Integer.parseInt(data[2]);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
