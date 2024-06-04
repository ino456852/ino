package ino.day10.oop.member;

public class ManageMember {
	
	private Member [] members;
	private int index;
	
		
		public ManageMember () {
			members = new Member[5];
			index = 0;
		}
		public void registerMember(Member member) {
//		this.member = member;
		members[index] = member;
		if(index < members.length-1) {
			
			index++;
		}
	}

	public Member [] allMember() {
		// TODO Auto-generated method stub
		return members;
	}
	public Member searchId(String memberId) {
		for(Member member : members) {
			if(member != null && memberId.equals(member.getMemberId()));
			return member;
		}
		return null;
	}
}
