package Ch11.toString;

public class SmartPhone {
	private String company,os;
	
	public SmartPhone(String company,String os) {
		this. company = company;
		this. os = os;
	}
	
	@Override
	public String toString() {
		return company+","+os;
	}
}
