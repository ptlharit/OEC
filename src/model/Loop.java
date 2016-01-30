package model;

public class Loop 
{
	String [] story = {"Nish is Eating when he is hungry.","Nish is outside and he is walking."};
	String [] question = {"Can you make Nish Eat?\nHint - try typing While Nish is Hungry, Nish is Eating","Can you make Nish Walk?"};
	String [] answer = {"While Nish is Hungry, Nish is Eating","While Nish is Outside, Nish is Walking"};
	
	public String getStory(int module) 
	{
		return story[module - 1];
	}
	
	public String getQuestion(int module) 
	{
		return question[module - 1];
	}
	
	public String getAnswer(int module) 
	{
		return answer[module - 1];
	}
}