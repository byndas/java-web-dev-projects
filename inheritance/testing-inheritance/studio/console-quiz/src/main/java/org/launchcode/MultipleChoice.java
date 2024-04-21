package org.launchcode;

import java.util.ArrayList;
import java.util.Scanner;

//import org.junit.Test;

public class MultipleChoice extends Question {

	private ArrayList<String> possibleAnswers;
	private int correctAnswer;

	// constructor
	public MultipleChoice(int pointValue, String text, int correctAnswer, ArrayList<String> possibleAnswers) {
		super(pointValue, text);
		this.correctAnswer = correctAnswer;
		this.possibleAnswers = possibleAnswers;
		setPointValue(1);
	}

	@Override
	public void displayAnswers () {
		for (int i = 0; i < possibleAnswers.size(); i++) {
			System.out.println(possibleAnswers.get(i));
		}
	}

	// conditional setter
	public boolean isCorrectAnswer (int possibleAnswer) {
		return possibleAnswer == correctAnswer;
	}

	@Override
	public int getAnswers() {
		Scanner answer = new Scanner(System.in);

		System.out.println(
				"What is your answer? " +
						"Enter correct option number. " +
						"Enter 1 to select first option."
		);
		int result = Integer.parseInt(answer.nextLine());

		return isCorrectAnswer(result) ? 1 : 0;
	}
}