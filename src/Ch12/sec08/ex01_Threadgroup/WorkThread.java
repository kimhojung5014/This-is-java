package Ch12.sec08.ex01_Threadgroup;

public class WorkThread extends	Thread{
	
	public WorkThread(ThreadGroup threadGroup,String threadName) {
		super(threadGroup, threadName);
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(getName()+" interruped");
				break;
			}
		}System.out.println(getName()+" 종료됨");
	}
}
