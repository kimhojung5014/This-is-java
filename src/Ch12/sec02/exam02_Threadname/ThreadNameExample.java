package Ch12.sec02.exam02_Threadname;

public class ThreadNameExample {

	public static void main(String[] args) {
		Thread thread = Thread.currentThread();		
		System.out.println("Program Start Thread Name: "+thread.getName());
		
		Thread threadA= new ThreadA();
		System.out.println("ThreadA를 생성한 쓰레드: "+threadA.getName());

		threadA.start();
		
		Thread threadB = new ThreadB();
		System.out.println("ThreadB를 생성한 쓰레드: "+threadB.getName());
		threadB.start();
	}

}

