package Ch14.sec04.exam02_Local_variable;

public class UsingLocalValriable {
	void method(int arg) {
		int localVar = 40;
		
		
		
		MyFuntionInterface fi = ()->{
			System.out.println("arg: " +arg);
			System.out.println("localVar: "+localVar);
		};
		fi.method();
	}
}
