package Ch14.sec05.exam04_function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FuctionExample1 {
	
	private static List<Student>list  = Arrays.asList(
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93));
	
	public static void printString(Function<Student, String> function) {
		for(Student student: list) {
			System.out.print(function.apply(student)+" ");
		}
		System.out.println();
	}
	
	public static void printInt(ToIntFunction<Student>function) {
		for(Student student: list) {
			System.out.print(function.applyAsInt(student)+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		System.out.println("[학생 이름]");
		printString(t->t.getName());
		// 위에 매개변수 t->t.getName()를 풀어쓰면 아래와 같다.
//		Function<Student, String>function = new Function<Student, String>() {
//			@Override
//			public String apply(Student t) {
//				return t.getName();
//			}
//		};
//		printString(function);
		
		System.out.println("[영어 점수]");
		printInt(t->t.getEnglishScore());
		
		System.out.println("[수학 점수]");
		printInt(t->t.getMathScore());
	}

}
