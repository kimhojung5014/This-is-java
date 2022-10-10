package Ch14.sec04.ex01_field;

public class UsingThis {
	public int outterField = 10;
	
	class Inner{
		int innerField = 20;
		
		void method() {
			MyFuntionInterface fi = () ->{
				System.out.println("outterField: "+outterField);
				System.out.println("innerField: "+innerField);
				System.out.println();
				System.out.println("outterField: "+UsingThis.this.outterField);
				System.out.println("innerField: "+this.innerField);
			
			
			
			};
			fi.method();}
	}
}
