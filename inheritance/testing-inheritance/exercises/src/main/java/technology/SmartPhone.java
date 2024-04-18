package technology;

public class SmartPhone extends AbstractEntity {
	public SmartPhone(String phoneNumber) {
		super(phoneNumber);
	}
	@Override
	public void phoneCall() {
		System.out.println("smart phone calling: "+getPhoneNumber());
	}
}
