package ino.day16.soket.calculrator.practice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class CalClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Socket socket = null;
		OutputStream os = null;
		String address = "127.0.0.1";
		int port = 0000;
		DataOutputStream dos = null;
		try {
			socket = new Socket(address,port);
			System.out.println("연결 완료");
			os = socket.getOutputStream();
			System.out.print("계산식 입력 : ");
			int sendMsg = sc.nextInt();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
//		Socket socket = null;
//		InputStream is = null;
//		OutputStream os = null;
//		DataInputStream dis = null;
//		DataOutputStream dos = null;
//		String address = "127.0.0.1";
//		int port = 7777;
//		Scanner sc = new Scanner(System.in);
//
//		try {
//			socket = new Socket(address, port);
//			System.out.println("서버와의 연결이 완료되었습니다.");
//			os = socket.getOutputStream();
//			is = socket.getInputStream();
//			dos = new DataOutputStream(os);
//			dis = new DataInputStream(is);
//			while (true) {
//				System.out.print("계산식(빈칸으로 띄어 입력, 예 24 + 42) >> ");
//				String sendMsg = sc.nextLine();
//				dos.writeUTF(sendMsg);
//				if("exit".equals(sendMsg)) {
////					dos.writeUTF("exit");
//					break;
//				}
//				dos.flush();
//				String recvMsg = dis.readUTF();
//				System.out.println("계산 결과 : " + recvMsg);
//
//			}
//		} catch (UnknownHostException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			try {
//				os.close();
//				socket.close();
//				dos.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}

}
