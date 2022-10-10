package Ch12.sec04.exam01_unsynchronized;

public class User1 extends Thread{
	private Calculator calculator;

	public void setCalculator(Calculator calculator) {
		this.setName("User1");
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory(100);
	}
	
}
