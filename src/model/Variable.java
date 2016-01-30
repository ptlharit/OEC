package model;

<<<<<<< HEAD
=======

>>>>>>> 2d2a929c1df9488d7c5823d5b5c0870812fbab3b
public class Variable {
	String[] story = { "Hi, my name is Nish and I am 20 years old.",
			"Nish just had a birthday. Now, he is 21 years old.", "Nish is wearing a Blue colour shirt.",
			"Nish is wearing a Red shirt", "Nish is sleeping.", "Nish is playing Hockey.",
			"Nish is 23 years old.\nHe is wearing a Yellow shirt.\nHe is not sleeping.",
			"Nish is 23 years old.\nHe is wearing a Yellow shirt.\nHe is not sleeping.",
			"Nish is 23 years old.\nHe is wearing a Yellow shirt.\nHe is not sleeping." };
	String[] question = { "How old is Nish?\nHint - try typing: Nish is 20", "How old is Nish now?",
			"What kind of shirt is Nish wearing?\nHint - try typing: Shirt is Blue", "What is the colour of his shirt?",
			"Is Nish sleeping?\nHint - try typing: Sleep is Yes", "Is Nish sleeping?", "How Old is Nish?",
			"Whats the colour of the shirt?", "Is Nish sleeping?" };
	String[] answer = { "Nish is 20", "Nish is 21", "Shirt is Blue", "Shirt is Red", "Sleep is Yes", "Sleep is No",
			"Nish is 23", "Shirt is Yellow", "Sleep is No" };
<<<<<<< HEAD

=======
	
>>>>>>> 2d2a929c1df9488d7c5823d5b5c0870812fbab3b
	public String getStory(int module) {
		return story[module - 1];
	}

	public String getQuestion(int module) {
		return question[module - 1];
	}

	public String getAnswer(int module) {
		return answer[module - 1];
	}

	public int getMaxSlideNumber() {
		return story.length;
	}
}