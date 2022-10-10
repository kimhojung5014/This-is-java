package Ch12.sec08.ex01_Threadgroup;

public class ThreadGroupEx {

	public static void main(String[] args) {
		ThreadGroup myGroup = new ThreadGroup("MyGroup");
		WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
		WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("[main 스레드 그룹의 list() 메소드 출력내용]");
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		mainGroup.list();
		System.out.println();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		System.out.println("[myGroup 스레드 그룹의 interrupt() 메소드 호출]");
		myGroup.interrupt();
		
	}

}
