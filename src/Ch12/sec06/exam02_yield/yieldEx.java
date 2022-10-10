package Ch12.sec06.exam02_yield;

public class yieldEx {

	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		threadA.start();
		threadB.start();
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {}
		threadA.work = true;
	}	

}
