package Ch12.sec06.exam04_wait_notify;

public class WaitNotifyExam {

	public static void main(String[] args) {
		WorkObject workObject = new WorkObject();
		ThreadA threadA = new ThreadA(workObject);
		ThreadB threadB = new ThreadB(workObject);
		
		threadA.start();
		threadB.start();
	}

}
