package model;

public class Conditional {
	String [] story = new String[]{
								  "When it is morning, Nish is awake.",
								  
								  "Good job! Now Nish will be awake every morning.\n"
								  + "\n"								  
								  + "But if it is night, Nish is asleep.",
									
								  "Good Job! You used CONDITIONS to make Nish do different things at different times.",
								  
								  "Nish loves to play outside when it is sunny.",
								  
								  "Nish loves to play outside when it is sunny,\n"
								  + "but hates to play outside when it is raining."
								  
								  };
	
	String [] answer = new String[]{"if it is Morning\n"
									+ " Nish is Awake",
									
									"if it is Morning\n"
									+ "	Nish is Awake\n"
									+ "if is is Night\n"
									+ " Nish is Asleep",
									
									"",
									
									"if it is Sunny\n"
									+ " Nish is Outside",
									
									"if it is Sunny\n"
									+ " Nish is Outside\n"
									+ "if it is Raining\n"
									+ " Nish is Inside"};
	
	String [] question = new String[]{"Let's wake up Nish in the morning.\n"
									+ "Try typing:\n"
			  						+ "if it is Morning\n"
			  						+ " Nish is Awake",
			  						
			  						"Let's wake up Nish in the morning, and sleep at night.\n"
			  						+ "Try typing:\n"
									+ "if it is Morning\n"
									+ " Nish is Awake\n"
									+ "if it is Night\n"
									+ " Nish is Asleep",
									
									"Here is another example:\n"
									+ "\n"
									+ "if it is School\n"
									+ " Nish is Studying\n"
									+ "if it is Park\n"
									+ " Nish is Playing\n",
									
									"Let's make Nish go outside when it is sunny.\n"
									+ "Try typing:\n"
									+ "if it is Sunny\n"
									+ " Nish is Outside",
									
									"Let's make Nish go outside when it is sunny and\n"
									+ "come back inside when it is raining.\n"
									+ "Hint - Try typing: \n"
									+ "if it is Sunny\n"
									+ " Nish is Outside\n"
									+ "if it is Raining\n"
									+ " Nish is _______"
									};
	
	

	public String getStory(int module) {
		return story[module - 1];
	}

	public String getAnswer(int module) {
		return answer[module - 1];
	}

	public String getQuestion(int module) {
		return question[module - 1];
	}
	
	public int getMaxSlideNumber() {
		return story.length;
	}
}
