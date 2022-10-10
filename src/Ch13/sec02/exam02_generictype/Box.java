package Ch13.sec02.exam02_generictype;

public class Box<T> {
		private T t;
		
		public void set(T t) {
			this.t = t;
		}
		public T get() {
			return t;
		}
		
		
}
