package Ch13.sec06.exam01_generic_wildcard;

public class Course<T> {
	
	private String name;
	private T[]	students; //T타입의 배열 들어오는 값에 따라 타입이 달라진다.
	
	
	public Course(String name, int capacity) {
		this.name = name;
		this.students = (T[])new Object[capacity];
	}
	 
	public String getName() {return name;}
	public T[]	getStudents() {return students;}
	
	public void add(T t) {
		for(int i=0;i<students.length;i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
			
		}
	}
}
