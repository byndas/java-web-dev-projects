package technology;
import java.util.UUID;

public abstract class AbstractEntity {
	private String id;
	private String phoneNumber;

	// constructor
	public AbstractEntity(String phoneNumber) {
		this.id = UUID.randomUUID().toString();
		this.phoneNumber = phoneNumber;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	// abstract method
	abstract void phoneCall();

	public String getPhoneNumber() {
		return phoneNumber;
	}
}
