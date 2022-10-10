package Ch12.test;

public class settest {

	public static void main(String[] args) throws InterruptedException {
		Thread.currentThread().setName("스레드1");;
		Thread.State state = Thread.currentThread().getState();
		Thread.sleep(2000);
		
		System.out.println(state);
	}

}
