package Ch14.sec05.exam08_and_or_negate_isequal;

import java.util.function.Predicate;

public class predicateIsEqualsExample {

	public static void main(String[] args) {
		Predicate<String>predicate;
		
		predicate = Predicate.isEqual(null);
		System.out.println("null과 null: "+predicate.test(null));
		
		predicate = Predicate.isEqual("Java8");
		System.out.println("null과 Java8: "+predicate.test(null));
		
		predicate = Predicate.isEqual(null);
		System.out.println("null과 null: "+predicate.test("Java8"));
		
		predicate = Predicate.isEqual("Java8");
		System.out.println("Java8과 Java8: "+predicate.test("Java8"));
	}

}
