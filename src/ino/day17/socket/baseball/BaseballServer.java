package ino.day17.socket.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class BaseballServer {

	public static void main(String[] args) {
//		서버 소켓을 생성하였습니다.
//		클라이언트의 접속을 기다립니다.
		
//		클라이언트가 접속했습니다.
//		1 4 5
//		서버 준비 완료
//		받기 : 2 3 6
//		받기 : 1 3 6
//		받기 : 1 4 6
//		받기 : 6 4 1
//		받기 : 5 1 4
//		받기 : 1 4 5
		ServerSocket serverSocket = null;
		Socket socket = null;
		int port = 7777;
		OutputStream os = null;
		InputStream is = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("서버 소켓을 생성하였습니다\n클라이언트의 접속을 기다립니다.");
			socket = serverSocket.accept();
			int [] numbers = new int [3];
			for(int i = 0; i < numbers.length; i++) {
				// 중복 없이 3개 숫자 1 ~ 9사이의 수
				// Math.random() * (최대값 - 최솟값 + 1) + 최솟값
				numbers[i] = (int)(Math.random()*9)+1;
				for(int j = 0; j < i;j++ ) {
					if(numbers[i] == numbers[j] ) {
						i--;
						break;
					}
				}
			}
			for (int number : numbers) {
				System.out.print(number+ " ");
			}
			System.out.println("\n서버 준비 완료");
			System.out.println("클라이언트가 접속했습니다.");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			
			while(true) {
				String recvMsg = dis.readUTF();
				String [] inputnums = recvMsg.split(" ");
				System.out.println("받기 : " + recvMsg);
				
				
				int strike = 0;
				int ball = 0;
				for (int i = 0; i < numbers.length; i++) {
					for(int j = 0; j < numbers.length; j++) {
						int number = Integer.parseInt(inputnums[j]);
						if(numbers[i] == number) {
							if(numbers[j] == numbers[j]) {
								strike++;
							} else {
								ball++;
							}
								
							}
					}
				}
				
//				String [] data = recvMsg.split(" ");
//				int num1 = Integer.parseInt(data[0]);
//				int num2 = Integer.parseInt(data[1]);
//				
//				num1 = (int)Math.random();
//				num2 = (int)Math.random();
//				
				String sendMsg = strike +"스트라이크" + ball + "볼";
				dos.writeUTF(sendMsg);
				dos.flush();
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
