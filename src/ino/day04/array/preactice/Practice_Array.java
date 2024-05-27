package ino.day04.array.preactice;

import java.util.Scanner;

public class Practice_Array {

	public void practice1() {
		
	}
	public void practice2() {
		// 길이가 10인 배열
		// 1 ~ 10까지 역순으로 배열에서 출력하기
//			System.out.print("정수 입력 : ");
//			arrs[i] = sc.nextInt();
//			System.out.println(arrs[i] + " ");
//		int[] arrs = new int[10];
//
//		Scanner sc = new Scanner(System.in);
////		int count = 10;
//		for (int i = 0, count = 10; i < 10; i++, count--) {
//			arrs[i] = count;
//		}
//		for (int i = 0; i < 10; i++) {
//			arrs[i] = 10 - i;
//		}
//		for(int i = 0; i < 10; i++) {
//			System.out.print(arrs[i] + " ");
//		}
		// 배열 선언
		int []arr = new int[10];
		// for문으로 초기화
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		// 역순으로 출력
		System.out.println("배열의 값 (역순) : ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
	public void practice3() {
//		사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
//		1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		int []nums = new int[num];
		
		if (num > 0) {
			for (int i = 0; i < nums.length; i++) {
				nums[i] = i + 1;
			}
			for (int i = 0; i < nums.length; i++) {
				System.out.print(nums[i] + " ");
			
		} 
			
		
//		int []arrs = new int[sc.nextInt()];
		
//		if(input > 0) {
//			int []arrs = new int[input];
//			for (int i = 1; i <= input; i++) {
//				arrs[i-1] = i;
//				System.out.print(arrs[i-1] + " ");
//			}
//			System.out.println();
//			for (int i = 0; i < input; i++) {
//				arrs[i] = i+1;
//				System.out.print(arrs[i] + " ");
//		}
		
		}
//		for (int i = 0; i < arrs.length; i++) {
//			int 
//			arrs[i] = i;
//			
//		}
//		for (int i = 0; i < arrs.length; i++) {
//			System.out.print(arrs[i] + " ");
//		}
	}
	public void practice4() {
//		메소드 명 : public void practice4(){}
//		길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후
//		배열 인덱스를 활용해서 귤을 출력하세요.
//
//		ex.
//		귤
		String [] arrs = {"사과","귤","포도","복숭아","참외"};
		
		for (int i = 0; i < arrs.length; i++) {
			if(arrs[i].equals("귤")) {
				System.out.println(arrs[i]);
			}
		}
//		String []arrs = new String[5];
//		arrs[0] = "사과";
//		String []arrs = {"사과","귤","포도","복숭아","참외"};
//		System.out.println(arrs[1]);
//		
//		for (int i = 0; i < arrs.length; i++) {
//			if(arrs[i].equals("귤")) {
//				System.out.println(arrs[i]);
//				break;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력 : ");
//		int num = sc.nextInt();
//		String [] arr = new String[num];
//		System.out.println(arr[num]);
//		}
//		
//		String []arrs = {"사과","귤","포도","복숭아","참외"};
//		System.out.println(arrs.length);
//		for (int i = 0; i < arrs.length; i++) {
//			System.out.print(arrs[i] + " ");
//		
//			}
//		}
	}
	public void practice5() {
//		문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열
//		에 몇 개 들어가 있는지
//		개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
//
//		ex.
//		문자열 : application
//		문자 : i
//		application에 i가 존재하는 위치(인덱스) : 4 8
//		i 개수 : 2
		// 입력 받은 문자열을 어떻게 문자 하나하나 배열에 넣을 것인가?
		// 그럼 그 배열은 무슨 배열이어야 하는가?
		// 그 배열에 어떻게 검색한 문자가 있는지 처리할 것인가?
//		System.out.println("application에 i가 존재하는 위치(인덱스) : ");
//		System.out.println("i 개수 : ");
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String object = sc.next();
		int count = 0;
		int size = object.length();		// "문자열".length() 하면 ""안에 문자열의 길이가 구해짐. 이경우 3이 나옴
		char [] words = new char[size]; // 만들어지는 문자배열은 입력한 문자열의 길이만큼 크기를 가져야 함.
		for (int i = 0; i < object.length(); i++) {
			words[i] = object.charAt(i);	// "문자열".charAt(0) 하면 ""안에 문자열 중 0번째에 해당하는 문자를 가져옴. 이경우 '문'이 구해짐
		}
		System.out.print("검색할 문자 : ");
		char serch = sc.next().charAt(0);	// 입력한 문자열에서 무조건 첫번째 문자를 구해줌
		System.out.print(object + "에 " + serch +"가 존재하는 위치(인덱스) : ");
		for (int i = 0; i < words.length; i++) {	// 배열.length 하면 배열의 크기가 구해짐 배열이면 다 가능
			if (words[i] == serch) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println("i 개수 : " + count);
//		words[0] = object.charAt(0);
//		words[1] = object.charAt(1);
//		words[2] = object.charAt(2);	// 이러한 작업을 문자열의 길이만큼 반복해야함
//		words[3] = object.charAt(3);
//		words[4] = object.charAt(4);
//		words[5] = object.charAt(5);
	}
	public void practice6() {
//		“월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
//		입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
//		범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
//		String []day = new String[7];
//		String []day = {"월요일","화요일","수요일",}
//		day[0] = "월요일";
//		day[1] = "화요일";
//		day[2] = "수요일";
//		day[3] = "목요일";
//		day[4] = "금요일";
//		day[5] = "토요일";
//		day[6] = "일요일";
//		int []weeks = new int[num];
		if(num < 0 || num > 6) {
			System.out.println("잘못 입력하셨습니다.");
		}else {
			char [] weeks = {'월','화','수','목','금','토','일'};
			System.out.println(weeks[num] + "요일");
		}
	}
	public void practice7() {
//		사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
//		배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
//		그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
//
//		ex.
//		정수 : 5
//		배열 0번째 인덱스에 넣을 값 : 4
//		배열 1번째 인덱스에 넣을 값 : -4
//		배열 2번째 인덱스에 넣을 값 : 3
//		배열 3번째 인덱스에 넣을 값 : -3
//		배열 4번째 인덱스에 넣을 값 : 2
//		4 -4 3 -3 2
//		총 합 : 2
		Scanner sc = new Scanner(System.in);
		System.out.print("인덱스 길이 입력 : ");
		int num = sc.nextInt();
		int[] nums = new int [num];
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			System.out.print("인덱스 " + i + "의 값을 입력하세요 : ");
			nums[i] = sc.nextInt();
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < nums.length; i++) {
			sum = nums[i];
			
		}
		System.out.print("총 합 : " + sum);
		
	}
	public void practice8() {
		
	}
	public void practice9() {
		
	}
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String idNum = sc.next();
		
		char [] idNums = new char[idNum.length()];		// 입력 받은 문자열을 char 타입으로 받는다.
		for(int i = 0; i < idNums.length; i++) {
			idNums[i] = idNum.charAt(i);	// 스트링으로 받은 문자열을 한글자씩 char로 변경
		}
		char [] copy = new char[idNums.length]; // 복사할 새로운 배열
		
		for (int i = 0; i < idNums.length; i++) {	// 변환된 문자들의 for문
//			copy[i] = idNums[i];		
			if (i < 8) {		// 8번 자리 전 까지
				copy[i] = idNums[i];	// 새로운 배열에 변환된 문자들을 넣기
			} else {
				copy[i] = '*';	// 8번 자리 후 부터 *표시
			}
		}
		for (char num : copy) {		// 얕은 복사
			System.out.print(num);
		}
	}
}
