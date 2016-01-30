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
	
	static Conditional ConditionalModel = new Conditional();
	static Loop LoopModel = new Loop();
	static Subroutine SubroutineModel = new Subroutine();
	static Variable VariableModel = new Variable();
	
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
			picturePath = "/pics/" + "var" + slideNumber + ".jpg";
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
			picturePath = "/pics/" + "cdn" + slideNumber + ".jpg";
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
			picturePath = "/pics/" + "loop" + slideNumber + ".jpg";
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
			picturePath = "/pics/" + "sub" + slideNumber + ".jpg";
			questionText = subroutine.getQuestion(slideNumber);
			slideLabelText = "Slide " + slideNumber + " of " + subroutine.getMaxSlideNumber();
		}
		
		String[] values = { titleText, storyText, picturePath, questionText, slideLabelText };
		return values;
	}
	
	public static boolean checkAns(String ans, int module, int slideNumber){
		return false;
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		MainScreen ms = new MainScreen();
	}
	
public static boolean CompareAnswers(int moduleNo, String studentAnswer, int slideNo){
		
		String modelAnswer = null;		
		switch(moduleNo){
		case 1:
			modelAnswer = VariableModel.getAnswer(slideNo);
			break;
		case 2:
			modelAnswer = ConditionalModel.getAnswer(slideNo);
			break;
		case 3:
			modelAnswer = LoopModel.getAnswer(slideNo);
			break;
		case 4:
			modelAnswer = SubroutineModel.getAnswer(slideNo);
			break;
		}
		
		String answer[] = modelAnswer.split("\\n");
		String answer2[] = studentAnswer.split("\\n");
		String wrong = "";
		
		switch(answer.length){
		case 1:
			if(answer[0].equals(answer2[0]))
				return true;
			else
				return false;
			
		case 2:
			if(answer[0].equals(answer2[0]) && answer[1].equals(answer2[1]))
				return true;
			else 
				return false;
		case 3:
			if(answer[0].equals(answer2[0]) && answer[1].equals(answer2[1]) && answer[2].equals(answer2[2]))
				return true;
			else
				return false;
		case 4:
			if(answer[0].equals(answer2[0]) && answer[1].equals(answer2[1]) && answer[2].equals(answer2[2]) && answer[3].equals(answer2[3]))
				return true;
			else
				return false;
		default:
			return true;
				
//				if(answer[0].equals(answer2[0]) && answer[1].equals(answer2[1])){
//			return true;
//		} else {
////			String[] subAnswer = {};
//			String[] subAnswer2 = {};
//			for(int j = 0; j < 2; j++){ 
//				for(int i=0; i < answer.length; i++){
//					if(answer[j].charAt(i)==answer2[j].charAt(i)){
//						//
//					} else {
//						wrong+=answer[j].charAt(i);
//					}
//				}
//			}
//			System.out.println(answer[0].toString());
//			System.out.println(answer2[0].toString());
//			return false;
			
		}
	}
	
	
}
