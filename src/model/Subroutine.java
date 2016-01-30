package model;

public class Subroutine {
	String [] learn = {"Nish is hungry.\n "
			+ "Nish wants to go to the restaurant with his fish, named Mish and his very clean dish.\n \n"
			+ "Let's get Nish to the restaurant. \n \n"
			+ "Try typing: \nNish goes to the restaurant with Mish and dish. ", 			
			
			"",
						"",
						"",
	};
	String [] answer = new String[5];
	String [] hint = new String[5];
	
	public String getLearn(int module) {
		return learn[module - 1];
	}

	public String getAnswer(int module) {
		return answer[module - 1];
	}

	public String getHint(int module) {
		return hint[module - 1];
	}
}
