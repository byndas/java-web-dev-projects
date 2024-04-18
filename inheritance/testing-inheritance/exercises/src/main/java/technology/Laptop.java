package technology;

public class Laptop extends AbstractEntity {
	public Laptop(String phoneNumber) {
		super(phoneNumber);
	}
	@Override
	public void phoneCall() {
		System.out.println("laptop calling: "+getPhoneNumber());
	}
}
