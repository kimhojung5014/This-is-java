package Ch13.sec07.exam01_generic_extends_implements;

public class ChildProductAndStorageExample {

	public static void main(String[] args) {
		ChildProduct<Tv, String, String> product = new ChildProduct<Tv, String, String>();
		
		product.setKind(new Tv());
		product.setModel("스마트 TV");
		product.setCompany("삼성");
		
		Storage<Tv>storage = new StorageImpl<Tv>(100);
		storage.add(new Tv(), 0);
		Tv tv = storage.get(0);
	}

}
