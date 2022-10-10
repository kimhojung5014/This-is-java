package Ch11.deepclone;

public class BookEx {

	public static void main(String[] args) {
		Book book = new Book("java", 2);
		
		Book book2 = (Book) book.clone();
		
		BookStore bs1 = new BookStore(new Book("this is java", 3), "교보문고");
		BookStore bs2 = bs1.clone();
		bs2.getBook().setName("javajava");
		
		System.out.println(bs2.getBook().name);
		System.out.println(bs1.getBook().name);
		
		
	}

}
