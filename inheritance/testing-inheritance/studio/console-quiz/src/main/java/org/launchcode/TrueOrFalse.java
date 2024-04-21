package org.launchcode;

import java.util.Scanner;

public class TrueOrFalse extends Question {

	private boolean correctAnswer;

	public TrueOrFalse(int pointValue, String text, boolean correctAnswer) {
		super(pointValue, text);
		this.correctAnswer = correctAnswer;
		setPointValue(1);
	}

	public boolean isCorrectAnswer (boolean possibleAnswer) {
		return possibleAnswer == correctAnswer;
	}

	@Override
	public void displayAnswers() {
		System.out.println("True or False");
	}

	@Override
	public int getAnswers() {
		Scanner answer = new Scanner(System.in);
		System.out.println("What will your answer be? Type 't' for True and 'f' for False");
		if (answer.nextLine().indexOf('t') >= 0) {
			return isCorrectAnswer(true) ? 1 : 0;
		}
		else { return isCorrectAnswer(false) ? 1 : 0; }
	}
}