package Ch12.sec03.exam01_priority;

public class PriorityExample {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			Thread thread = new CalcThread("Thread"+i);
			if(i != 10) {
				thread.setPriority(thread.MIN_PRIORITY);
			}else {
				thread.setPriority(thread.MAX_PRIORITY);
			}
			thread.start();
		}
	}

}
