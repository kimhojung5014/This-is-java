package Ch14.LastTest;

import java.util.function.IntBinaryOperator;
import java.util.function.ToIntFunction;

public class Ex06 {

	public static Student[] students = {new Student("김", 90, 96),new Student("호", 95, 93)};
	
	public static double avg(ToIntFunction<Student> function) {
		double sum = 0;
		for(Student student: students) {
			sum+=function.applyAsInt(student);
		}return sum/students.length;
	}
	
	
	public static void main(String[] args) {
		double englishAvg = avg(s -> s.getEnglishScore());
		System.out.println("영어 평균 : "+ englishAvg);
		
		double mathAvg = avg(s -> s.getMathScore());
		System.out.println("수학 평균: "+ mathAvg);
	}

	public static class Student{
		private String name;
		private int englishScore;
		private int mathScore;
		
		public Student(String n,int e,int m ) {
			name = n;
			englishScore = e;
			mathScore = m;
		}

		public String getName() {return name;}

		public int getEnglishScore() {return englishScore;}

		public int getMathScore() {return mathScore;}
	}
}

	

