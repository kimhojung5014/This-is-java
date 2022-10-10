package Ch12.test;

import java.awt.Toolkit;

public class thread {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
//		Runnable tRunnable = new threadEx();
		Thread thread1 = Thread.currentThread();
		thread1.setName("123");
		System.out.println(thread1.getName());
		Thread thread = new Thread( new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0;i<5;i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		});
		thread.start();
		for(int i =0;i<5;i++) {
			System.out.println("탕");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				}
		}
		
		
	}
}
