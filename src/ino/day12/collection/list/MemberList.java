package ino.day12.collection.list;

class Member {
	/*
	 * 배열의 한계...
	배열은 1개의 데이터타입에 대해서
	여러개의 데이터를 넣을 수 있음.
	-> 1개의 데이터타입에 대해서만 넣을 수 있는 것이 배열의 한계임...
	 */
}
									
public class MemberList {
	Member [] members;
	int size;
	
	public MemberList() {
		members = new Member[3];
		
		size = 0; 
	}
	
	public void add(Member member) {
		members [size] = member;
		size ++;
	}
	
	public Member get(int index) {
		return members[index];
//		return members; // member[]
	}
	
	public int size () {
		return size;
	}
	
	public void clear() {
		members = new Member[5];
		size = 0;
	}
}
