package lab7;

import java.util.ArrayList;
import java.util.List;
public class StudentManager {

	private List<Student> students;
	public StudentManager() { 
	    setStudents(new ArrayList<>());
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
}
