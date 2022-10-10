package Ch15.sec06.exam01_stack;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<Coin>coinBox = new Stack<Coin>();
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(10));
		
		while(!coinBox.empty()) {
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전: "+coin.getValue());
		}
		
	}

}
