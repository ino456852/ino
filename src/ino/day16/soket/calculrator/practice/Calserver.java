package ino.day16.soket.calculrator.practice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Calserver {

	public static void main(String[] args) {
		ServerSocket serversocket = null;
		int port = 0000;
		Socket socket = null;
		InputStream is = null;
		
		try {
			serversocket = new ServerSocket(port);
			System.out.println("연결중");
			socket = serversocket.accept();
			is = socket.getInputStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
//		ServerSocket serverSocket = null;
//		int port = 7777;
//		Socket socket = null;
//		InputStream is = null;
//		OutputStream os = null;
//		DataInputStream dis = null;
//		DataOutputStream dos = null;
//
//		try {
//			serverSocket = new ServerSocket(port);
//			System.out.println("연결을 기다리고 있습니다.");
//			socket = serverSocket.accept();
//			System.out.println("연결이 완료되었습니다.");
//			is = socket.getInputStream();
//			os = socket.getOutputStream();
//			dis = new DataInputStream(is);
//			dos = new DataOutputStream(os);
//			while(true) {
//				String recvMsg = dis.readUTF();
//				if("exit".equals(recvMsg)) break;
//				System.out.println(recvMsg);
//				String[] data = recvMsg.split(" ");
//				int num1 = Integer.parseInt(data[0]);
//				int num2 = Integer.parseInt(data[2]);
//				String operator = data[1];
//				String result = "";
//				switch (operator) {
//				case "+":	result = num1 + num2 + "";	break;
//				case "-":	result = num1 - num2 + "";	break;
//				case "*":	result = num1 * num2 + "";	break;
//				case "/":	result = num1 / num2 + "";	break;
//				case "%":	result = num1 % num2 + "";	break;
//				}
//				dos.writeUTF(result);
//				dos.flush();
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

}
