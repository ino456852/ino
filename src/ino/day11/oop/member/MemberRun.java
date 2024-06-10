package ino.day11.oop.member;

public class MemberRun {

	public static void main(String[] args) {
		ViewMember view = new ViewMember();
		ManageMember mng = new ManageMember();
		end :
		while(true) {
			int choice = view.mainMenu();
			switch(choice) {
			case 1 : 
				Member member = view.inputMember();
				mng.insertMember(member);	// 저장완료
				break;
			case 2 : 
				// 회원 검색(이메일)
				String email = view.inputEmail("검색");
				member = mng.searchOneByEmail(email);
				if(member != null) {
					view.printOneMember(member);
				} else {
					view.displayMsg("검색 결과가 없습니다.");
				}
				break;
			case 3 : 
				// 회원 전체정보 출력
				Member[] members = mng.getAllMembers();
				view.printAllMembers(members);
				break;
			case 4 : 
				// 회원 정보 삭제
				// 수정할 이메일 입력
				email = view.inputEmail("수겅");
				// 데이터 확인
				member = mng.searchOneByEmail(email);
				if(member != null) { // 있으면 
					view.modifyMember(member);
					// 수정할 값 입력 받음
//					member = view.modifyMember(email);
					// 입력값이 완료되면 수정
//					mng.updateMember(member);
				}
				break;
			case 5 : 
				// 전체정보 삭제
				mng.deleteAllMembers();
				break;
			case 0 :
				view.displayMsg("프로그램을 종료합니다");
				break end;
			default :
				view.displayMsg("잘못 입력하였습니다.");	
			}
		}
	}

}
