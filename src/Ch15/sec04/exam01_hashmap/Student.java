package Ch15.sec04.exam01_hashmap;

import java.util.Objects;

public class Student {
	private int sno;
	private String name;
	
	public Student(int sno,String name) {
		this.sno = sno;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			return (name.equals(student.name))&&(sno==student.sno);
		}return false;
	}
	
	@Override
	public int hashCode() { 
		return Objects.hash(sno,name);
	}
}
