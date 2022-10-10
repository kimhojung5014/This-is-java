package Ch12.sec06.exam05_wait_notify;

public class DataBox {
	private String data;

	public synchronized String getData() {
		if(this.data == null) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		
		String returnValue = data;
		System.out.println("소비자가 읽은 데이터: "+returnValue);
		data = null;
		notify();
		return returnValue;
	}

	public synchronized void setData(String data) {
		if(this.data != null) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		this.data = data;
		System.out.println("생성자가 생성한 데이터"+data);
		notify();
	}
	
}
