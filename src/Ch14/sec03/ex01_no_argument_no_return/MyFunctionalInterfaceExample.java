package Ch14.sec03.ex01_no_argument_no_return;

public class MyFunctionalInterfaceExample {

	public static void main(String[] args) {
		MyFuntionalInterface fi;
		fi = () -> {
			String str = "method call";
			System.out.println(str);
		};
		fi.method();
		
		fi = () -> {System.out.println("method2 call2");
		};
		fi.method();
		
		fi = () -> System.out.println("method3 call3");
		fi.method();
	}

}
