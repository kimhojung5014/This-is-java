package Ch12.sec05.exam_state;

public class ThreadStateExample {

	public static void main(String[] args) {
		StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
		statePrintThread.start();
	}

}
