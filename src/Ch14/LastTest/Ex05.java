package Ch14.LastTest;

import java.util.function.IntBinaryOperator;

public class Ex05 {
		private static int[] scores = { 10,53,3};

	public static int  maxOrMin(IntBinaryOperator operator) {
	
		int result = scores[0];
		for(int score: scores) {
			result = operator.applyAsInt(score, result);
		}return result;
	}
	public static void main(String[] args) {

		int max = maxOrMin( (x,y)-> { if(x>y) { return x;} else {  return y;}});
		
		System.out.println("최대 값: "+max);
		
		int min = maxOrMin( (x,y)-> { if(x<y) { return x;} else {  return y;}});
		
		System.out.println("최소값: "+min);
		
		
	}

}
