package Ch12.sec03.exam01_priority;

public class CalcThread extends Thread{
	public CalcThread(String name) {
		setName(name);
	}
	
	@Override
	public void run() {
		for(int i=0;i<2000000000;i++) {
			
		}
		System.out.println(getName());
	}
}
