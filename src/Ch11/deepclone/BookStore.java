package Ch11.deepclone;

public class BookStore implements Cloneable{
	private Book book;
	private String name;
	
	public BookStore(Book book, String name) {
		this.book = book;
		this.name = name;
	}
	
	@Override
	public BookStore clone() {
		Object object = null;
		try {
			object = super.clone();
		} catch (Exception e) {}
		BookStore bs = (BookStore)object;
		bs.setBook(new Book(this.book.getName(), this.book.getPrice()));
		return bs;
		
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
