package ino.day10.oop.member;

import java.util.Scanner;

public class MemberRun {

	public static void main(String[] args) {
		// 회원 관리 프로그램
		
//		 * 1. 회원가입
//		 * 2. 회원검색
//		 * 3. 회원정보보기
		ViewMember view = new ViewMember();
		ManageMember mng = new ManageMember();
		end :
			while(true) {
				int menu = view.printMenu();
		 switch (menu) {
		 case 1 :
			 Member member = view.inputMember();
			 mng.registerMember(member);
			 break;
		 case 2 :
			 // 아이디 입력
			 String memberId = view.inputMemberId();
			 // 배열에서 찾기
			 member = mng.searchId(memberId);
			 // 찾은거 출력하기
			 if(member != null)
			 view.displayMember(member);
			 break;
		 case 3 :
//			 member = mng.allmember();
			 Member[] members = mng.allMember();
			 view.displayMemberList(members);
			 break;
		 case 4 :
//			 System.out.println("프로그램을 종료하겠습니다.");
			 view.printMessage("프로그램을 종료하겠습니다.");
			 break end;
		default :
//			System.out.println("잘못 입력하셨습니다.");
			view.printMessage("잘못 입력하셨습니다.");
			break;
		 }
	}
//		  3. 회원정보수정
//		  4. 회원정보삭제
	
}
}
