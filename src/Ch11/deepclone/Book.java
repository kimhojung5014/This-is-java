package Ch11.deepclone;

public class Book implements Cloneable{
		String name;
		int price;
		public Book(String name,int price) {
			this.name  = name;
			this.price = price;
		}
		@Override
		public  Object clone() {
			Object object = null;
			try {
				object = super.clone();
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		return object;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		
}
