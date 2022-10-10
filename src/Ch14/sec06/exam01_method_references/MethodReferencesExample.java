package Ch14.sec06.exam01_method_references;

import java.util.function.IntBinaryOperator;

public class MethodReferencesExample {

	public static void main(String[] args) {
		IntBinaryOperator operator ;
		//정적
		operator = (x,y)->Calcuulator.statiMethod(x, y);
		System.out.println("결과1: "+operator.applyAsInt(1, 2));
		operator = Calcuulator :: statiMethod;
		System.out.println("결과2: "+operator.applyAsInt(3, 4));
		
		//인스턴스 
		Calcuulator obj = new Calcuulator();
		operator = (x,y) -> obj.instanceMethod(x, y);
		System.out.println("결과3: "+operator.applyAsInt(5, 6));
		operator = obj :: instanceMethod;
		System.out.println("결과4: "+operator.applyAsInt(7, 8));
		
		
		
		
	}

}
