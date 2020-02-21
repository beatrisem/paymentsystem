package lv.bea;

import java.util.Arrays;
import java.util.Scanner;

import lv.bea.Options;
import lv.bea.Questions;
import lv.bea.Tips;

public class JavaProject {

	
	public static void main(String[] args) {
		
		
		Questions[] allQuestions = GetQuestions();

		Scanner sc = new Scanner(System.in);

		for (Questions questions : allQuestions) {
			System.out.println(questions.question);
			System.out.println(Arrays.toString(questions.options));
			int atbilde = sc.nextInt();
			String regex = "^([1-4])";
			String data = Integer.toString(atbilde);
			
			while (atbilde != questions.answer) {
				if(!(data.matches(regex))){
					System.out.println("Input number from 1 to 4");
					}
				System.out.println("Try again! Tip: " + questions.tip);
			atbilde = sc.nextInt();
			}
					System.out.println("nais");
		}
				}
	
	
	public static boolean chechkStriInput(int atbilde){
		
		String regex = "^([1-4])";
		String data = Integer.toString(atbilde);
		
		return data.matches(regex);
		
	}

	private static Questions[] GetQuestions() {
	Questions[] returnArray = new Questions[10];
	Options options = new Options();
	

	returnArray[0] = new Questions("What is Java?", options.options1, 1, Tips.tip1);
	returnArray[1] = new Questions("What is JDK?", options.options2, 1, Tips.tip2);
	returnArray[2] = new Questions("Which one isn't access modifier in Java?", options.options3, 4, Tips.tip3);
	returnArray[3] = new Questions("When arrays are used?", options.options4, 4, Tips.tip4);
	returnArray[4] = new Questions("What you will see on console when enter: System.out.println(null)?", options.options5, 3, Tips.tip5);
	returnArray[5] = new Questions("Why Java program needs Java main method?", options.options6, 1, Tips.tip6);
	returnArray[6] = new Questions("Why we use package in Java?", options.options7, 4, Tips.tip7);
	returnArray[7] = new Questions("Some Java Reserved Keywords are: abstract, boolean, break, case, class, enum, native, private, strictfp, super, throw, throne, void, while. Which word is wrong (not Keyword)?", options.options8, 4, Tips.tip8);
	returnArray[8] = new Questions("Which fact about the Constructor is wrong?", options.options9, 2, Tips.tip9);
	returnArray[9] = new Questions("Why isn't Java 100% Object-oriented?", options.options10, 3, Tips.tip10);

		return returnArray;

	}
}