package Ch12.sec02.exam01_createthread;

import java.awt.Toolkit;

public class BeepPrintExample3 {

	public static void main(String[] args) {
		//how1
//		Thread thread = new BeepThread();
//		thread.start();
		
		//how2
		Thread thread = new Thread() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5;i++) {
					toolkit.beep();
					try {Thread.sleep(1000);}catch(Exception e) {};
				}
			}
		};
		
		thread.start();
		//"띵" 문자열을 5번 출력하는 작업
		for(int i=0; i<5;i++) {
			
			System.out.println("띵");
			try {Thread.sleep(1000);}catch(Exception e) {};
		}
	}

}
