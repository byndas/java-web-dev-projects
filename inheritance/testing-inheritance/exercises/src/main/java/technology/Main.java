package technology;

public class Main {
	public static void main(String[] args) {
		Computer hp = new Computer("555-5555");
		System.out.println("id: "+hp.getId());
		hp.phoneCall();

		Laptop macBook = new Laptop("111-1111");
		System.out.println("id: "+macBook.getId());
		macBook.phoneCall();

		SmartPhone iPhone = new SmartPhone("222-2222");
		System.out.println("id: "+iPhone.getId());
		iPhone.phoneCall();
	}
}
/*
Parent class: add three fields, two methods, & constructor

Child class: add field & method

Abstract class design:
	* assign unique ID field to each object instance child_
	* create AbstractEntity abstract parent class
			with ID getter & setter extending to child classes_
*/
