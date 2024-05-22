package ino.day04.array.preactice;

public class preactice4 {

	public static void main(String[] args) {
//		메소드 명 : public void practice4(){}
//		길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후
//		배열 인덱스를 활용해서 귤을 출력하세요.
//
//		ex.
//		귤
//		String []arrs = new String[5];
//		arrs[0] = "사과";
//		String []arrs = {"사과","귤","포도","복숭아","참외"};
//		System.out.println(arrs[1]);
//		
//		for (int i = 0; i < arrs.length; i++) {
//			if(arrs[i].equals("귤")) {
//				System.out.println(arrs[i]);
//				break;
		String []arr = {"사과","귤","포도","복숭아"};
		for (int i = 0; i < arr.length; i++){
			if (arr[i].equals("귤")){
				System.out.println(arr[i]);
				break;
			}
			}
//			}
//		}
	}

}
