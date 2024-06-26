package launchcode.org.models;

public class Event {

	private int id;
	private static int nextId = 1;

	private String name;
	private String description;

	public Event(String name, String description) {
		this.name = name;
		this.description = description;
		this.id = nextId;
		nextId++;
	}

//	getters & setters

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return name;
	}
}
