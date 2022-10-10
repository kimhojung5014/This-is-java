package Ch12.sec06.exam06_stop;


public class StopFlagExample {

	public static void main(String[] args) {
		printThread1 printThread1 =new printThread1();
		printThread1.start();
		
		try {
			Thread.sleep(10); 
		} catch (InterruptedException e) {}
		printThread1.setStop(true);
	}

}
