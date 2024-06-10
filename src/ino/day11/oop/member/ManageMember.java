package ino.day11.oop.member;

public class ManageMember {

	Member[] members;
	int index;

	// 필드 초가화를 생성자에서 함
	public ManageMember() {
		members = new Member[5];
		index = 0;
	}

	// 회원 정보 저장
	public void insertMember(Member member) {
		if (index < members.length) {
			this.members[index] = member;
			index++;
		}
	}
	
	
	// 회원 전체 정보
	public Member[] getAllMembers() {
		return members;
	}
	// 이메일로 회원 검색
	public Member searchOneByEmail(String email) {
		for(Member member : members) {
			if(member != null && email.equals(member.getMemberEmail())) {
				return member;
			}
		}
		return null;
	}
	
	
	// 전체 정보 삭제
	public void updateMember(Member member) {
		int i = 0;
		for(Member mOrigin : members) {
			if(mOrigin != null) {
				String memberEmail = mOrigin.getMemberEmail();
					if(memberEmail.equals(member.getMemberEmail())){
//						mOrigin.setMemberAddress(member.getMemberAddress());
//						mOrigin.setMemberName(member.getMemberName());
//						mOrigin.setMemberPhone(member.getMemberPhone());
				members[i] = member;
			}
			i++;
		}
		}
	}
	
	public void deleteAllMembers() {
		members = new Member[5];
		index = 0; 
		
//		for(Member member : members) {
//			member = null;
//		}
		
	}

}
