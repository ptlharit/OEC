package controller;

import model.Conditional;
import model.Loop;
import model.Subroutine;
import model.Variable;
import view.MainScreen;

public class Controller {
	
	private static Variable variable;
	private static Conditional conditional;
	private static Loop loop;
	private static Subroutine subroutine;
	
	private static String titleText = "";
	private static String storyText = "";
	private static String picturePath = "";
	private static String questionText = "";
	private static String slideLabelText = "";
	
	public static String[] next(int module, int slideNumber) {
		if (slideNumber <= 0) {
			String[] values = { "", "" };
			return values;
		}
		
		if (module == 1) {
			variable = new Variable();
			if (variable.getMaxSlideNumber() < slideNumber) {
				String[] values = { "" };
				return values;
			}
			titleText = "VARIABLES";
			storyText = variable.getStory(slideNumber);
			picturePath = "pics/logo.png";
			questionText = variable.getQuestion(slideNumber);
			slideLabelText = "Slide " + slideNumber + " of " + variable.getMaxSlideNumber();
		}
		
		if (module == 2) {
			conditional = new Conditional();
			if (conditional.getMaxSlideNumber() < slideNumber) {
				String[] values = { "" };
				return values;
			}
			titleText = "CONDITIONALS";
			storyText = conditional.getStory(slideNumber);
			picturePath = "pics/logo.png";
			questionText = conditional.getQuestion(slideNumber);
			slideLabelText = "Slide " + slideNumber + " of " + conditional.getMaxSlideNumber();
		}
		
		if (module == 3) {
			loop = new Loop();
			if (loop.getMaxSlideNumber() < slideNumber) {
				String[] values = { "" };
				return values;
			}
			titleText = "LOOPS";
			storyText = loop.getStory(slideNumber);
			picturePath = "pics/logo.png";
			questionText = loop.getQuestion(slideNumber);
			slideLabelText = "Slide " + slideNumber + " of " + loop.getMaxSlideNumber();
		}
		
		if (module == 4) {
			subroutine = new Subroutine();
			if (subroutine.getMaxSlideNumber() < slideNumber) {
				String[] values = { "" };
				return values;
			}
			titleText = "SUBROUTINE";
			storyText = subroutine.getStory(slideNumber);
			picturePath = "pics/logo.png";
			questionText = subroutine.getQuestion(slideNumber);
			slideLabelText = "Slide " + slideNumber + " of " + subroutine.getMaxSlideNumber();
		}
		
		String[] values = { titleText, storyText, picturePath, questionText, slideLabelText };
		return values;
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		MainScreen ms = new MainScreen();
	}
	
	
}
