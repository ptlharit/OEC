package model;

public class Loop {
	String [] learn = new String[5];
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
