package Ch11.cloned;

class Student implements Cloneable{
	String name;
	
	Student(String name){
	this.name = name;
	}
	
	@Override
	public Student clone(){
		
		try {
			 Student student = (Student)super.clone();
			return  student;
		} catch (CloneNotSupportedException e) {}
		return null;
		
	}
	@Override
	public String toString() {
		return name;
	}
	
}

public class objectDemo{
	public static void main(String[] args) {
		Student s1 = new Student("egoing");
		Student s2 =  (Student)s1.clone();
		System.out.println(s1);
		System.out.println(s2);
		s1.name = "not";
		System.out.println(s1);
		System.out.println(s2);
		
		
		
	}
}
