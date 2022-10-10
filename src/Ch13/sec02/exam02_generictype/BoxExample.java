package Ch13.sec02.exam02_generictype;

public class BoxExample {

	public static void main(String[] args) {
		Box<String>box = new Box<String>();
		box.set("홍길동");
		String name = box.get();
		System.out.println(name);
		
		Box<Integer>box2 = new Box<Integer>();
		 box2.set(100);
		 int i = box2.get();
		System.out.println(i);
	}

}
