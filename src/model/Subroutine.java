package model;

public class Subroutine {
	String [] answer = {"Nish goes to the restaurant with Mish and dish\n"
					+	"Nish goes back home",
					
						"Nish goes to the restaurant with Mish and dish\n"
					+	"Nish gets Pizza\n"
					+	"Nish goes back home",

						"Nish goes to the restaurant with Mish and dish\n"
					+	"Nish gets Pizza"
				};
	
	String [] story = {"Nish is hungry.\n"
			+	"Nish wants to go to the restaurant with his fish named Mish and his very clean dish\n"
			+	"Nish then goes back home\n"
			+	"Let's get Nish to the restaurant.\n"
			+ 	"\n"
			,
			
			"You just made a SUBROUTINE call.\n"
			+	"That is when you want to do something outside of your home. \n"
			+	"Once you get there, you might want to do something, so you will do what you want to do. It can be more than one thing but at the end of the day, you will go back home.\n" 
			+ 	"We'll show you some examples:\n"
			+ 	"1. 	Nish goes to the mall\n"
			+	"		Nish buys clothes\n"
			+	" 		Nish goes back home\n"
			+	"\n"
			+	"2. 	Nish goes to school\n"
			+	"		Nish learns programming\n"
			+	"		Nish likes programming\n"
			+ 	"		Nish goes back home\n"
			+	"\n"
			+ 	"3. 	Nish goes to the Park\n"
			+ 	" 		Nish plays on the slide\n"
			+	"		Nish finds a ball\n"
			+	"		Nish makes a new friend\n"
			+	"		Nish goes back home \n"
			,
				
				
				"This time, Nish wants to get food at the restaurant"
			+	"When Nish goes to the restaurant, he gets food. \n"
			,
					
			"Sometimes you might want to do something at the place forever, or you can even go to another place that's not home.\n"
			+	"The problem with that is you always have to return to the place you went to before.\n"
			+	"So if you went to the park after going to the restaurant, you have to go back to restaurant\n"
			+	"We'll show you some examples: \n"
			+	"1. 	Nish goes to the mall\n"
			+	"		Nish goes to the park\n"
			+	"		Nish goes back to the mall\n"
			+	"		Nish goes back home"
			,
					
			"Nish decides to go to the restaurant again. \n"
			+	"Nish gets a pizza.\n"
			+	"This time, for some reason, Nish didn't want to come back home. Oh no.\n"
			+	"\n"
							
			};
	
	
	String [] question = {"Try typing:\n"
					+	"	Nish goes to the restaurant with Mish and dish\n"
					+ 	"	Nish goes back home" ,
					
				"",
					
				"Let's get Nish to the restaurant, buy some food and back home. \n",
					
				"",
					
				"Let's get Nish to the restaurant, but he doesn't want to come back home. \n",	
				
				""
	};
	
	String[] hint = {"Type:\n"
			+	"	Nish goes to the restaurant with Mish and dish\n"
			+ 	"	Nish goes back home" ,
			
			"",
			
			"	Nish goes to the restaurant with Mish and dish\n"
			+	"	Nish gets _____\n"
			+	" 	Remember Nish has to go back home"
			,
			
			"",
			
			"	Nish goes to the restaurant with Mish and dish\n"
			+	"	Nish gets _____\n",
			
			""
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
}
