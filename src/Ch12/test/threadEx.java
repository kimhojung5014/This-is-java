package Ch12.test;

public class threadEx implements Runnable{
	@Override
	public void run() {
		for(int i =0;i<5;i++) {
			System.out.println("탕");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				}
		}
	}
}
