package ino.day12.collection.student;

import java.util.ArrayList;
import java.util.List;

public class ManageStudent implements ManageInterface {

	private List<Student> sList;
	
	public ManageStudent() {
		sList = new ArrayList<Student>();
	}
	
	public void registerStudent(Student student) {
	}

	public List<Student> searchOnebyName(String name){
		if(name != null) {
			List<Student> searchList = new ArrayList<Student>();
			for(Student std : sList) {
				if(name.equals(std.getName())) {
					searchList.add(std);
				}
			}
			return searchList;
		}
		return null;
	}

	public List<Student> selectAllStudents() {
		return sList;
	}

	public void modifyStudent(int index, Student student) {
		
	}

	public void deleteStudent(int index) {
		
	}


}
