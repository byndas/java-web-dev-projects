package technology;

public class Computer extends AbstractEntity {

	public Computer(String phoneNumber) {
		// phoneNumber is param given value in main
		// super allows child to give phoneNumber as arg to parent constructor
		super(phoneNumber);
	}
	@Override
	public void phoneCall() {
		System.out.println("computer calling: " + getPhoneNumber());
	}
}











////////////////////////////////////////////////////////////////
/*
STUDIO:
	make quiz console program
		that displays:
			* Multiple Choice, Checkbox, & True/False question,
			*	their answer options & correct answer(s)

	how are question types same & different?
		* design Question parent class containing common features
		* design child classes for each question type

	which methods are abstract in abstract parent Question class?

	abstract parent Quiz class:
		make questions ArrayList
		run & grade quiz

	review your design before coding

	make IntelliJ project with QuizRunner class containing only a main method

	program asks three questions & judges user input as correct or incorrect

=================================================================================

Bonus Mission
	add three more question types:
		short answer --> max 80 character user input
		linear scale --> allows integer range user input
		paragraph --> max 500 character user input
	use JUnit to test your classes
*/