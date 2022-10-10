package Ch12.sec06.exam04_wait_notify;

public class WorkObject {
		
	public synchronized void methodA() {
		System.out.println("ThreadA의 methodA작업 실행");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB의 methodB작업 실행");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {}
	}
}
