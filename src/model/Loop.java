package model;

public class Loop 
{
	String [] story = {};
	String [] question = {};
	String [] answer = {};
	
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