package Ch15.sec06.exam02_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Message>messagesQueue = new LinkedList<Message>();
		
		messagesQueue.offer(new Message("sendmail", "홍"));
		messagesQueue.offer(new Message("sendsms", "길"));
		messagesQueue.offer(new Message("sendkakaotok", "동"));
		
		while (!messagesQueue.isEmpty()) {
			Message message = messagesQueue.poll();
			switch (message.command) {
			case "sendmail":
				System.out.println(message.to+"에게 메일을 보냅니다.");
				break;
			case "sendsms":
				System.out.println(message.to+"에게 문자를 보냅니다.");
				break;
			case "sendkakaotok":
				System.out.println(message.to+"에게 카카오톡을 보냅니다.");
				break;
			}
		}
	}

}
