package Ch13.Test.ex03;

public class Container<T,M> {
	private T Key;
	private M Value;
	
	public T getKey() {
		return Key;
	}
	public void set(T key,M value) {
		Key = key;
		Value = value;
	}
	public M getValue() {
		return Value;
	}


}
