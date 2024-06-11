package ino.day16.soket.stream;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientProgram {

	public static void main(String[] args) {
		
		String address = "127.0.0.1";
		int port = 8888;
		OutputStream os = null;
		Socket socket = null;
		try {
			socket = new Socket(address,port);
			System.out.println("서버와의 연결에 성공하셨습나다.");
//			socket.getInputStream();
			os = socket.getOutputStream();
			os.write(104);		// 주는 값 Output
			os.write(116);
			os.write(109);
			os.write(108);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				os.close();
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
