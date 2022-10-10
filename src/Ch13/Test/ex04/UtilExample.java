package Ch13.Test.ex04;

public class UtilExample {
	public static void main(String[] args) {
		Pair<String,Integer>pair = new Pair<String, Integer>("홍길동", 35);
		Integer age = Util.getValue(pair, "홍길동");
		System.out.println(age);
		
		ChildPair<String, Integer>childPair = new ChildPair<String, Integer>("홍삼원", 20);
		Integer ChildAge = Util.getValue(childPair, "홍삼순");
		System.out.println(ChildAge);
		
		Thread thread = new Thread(  () ->{} );
		
		Thread thread2 = new Thread() {
			public void run() {};
		};
		
		Runnable runnable = () ->{		};
				
		Runnable runnable2 = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		};
		
//		OtherPair<String, Integer>otherPair	= new OtherPair<String, Integer>("홍삼원", 20);
//		int otherAge = Util.getValue(otherPair, "홍삼원");
//		
		
	}
}
