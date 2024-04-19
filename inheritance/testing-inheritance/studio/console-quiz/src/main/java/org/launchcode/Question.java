package org.launchcode;

// Question could be an abstract class
import java.util.Scanner;

public abstract class Question {

	private int pointValue;
	private String text;

	public Question(int pointValue, String text) {
		this.pointValue = pointValue;
		this.text = text;
	}

	public void displayQuestion () {
		System.out.println(text); // prints to console quiz question
	}

	public void setPointValue(int x) {
		this.pointValue = x;
	}

	public int getPointValue()  {
		return this.pointValue;
	}

	public abstract void displayAnswers ();

	public abstract int getAnswers();
}
