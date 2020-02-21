package lv.bea;

import java.util.Arrays;
import java.util.Scanner;

import lv.bea.Options;
import lv.bea.Questions;
import lv.bea.Tips;

public class JavaProject {

	
public static void main(String[] args) {
		
		System.out.println("Game rules: \n You have to answer 10 questions! "
				+ "\n Every question will have only one correct answer!"
				+ "\n For every correct aswer you will earn 10 points!"
				+ "\n For every wrong answer you loose 2 points");

		Questions[] allQuestions = GetQuestions();

		Scanner sc = new Scanner(System.in);
		int points = 0;
		int points2 = 0;

		for (Questions questions : allQuestions) {
			System.out.println(questions.question);
			System.out.println(Arrays.toString(questions.options));
			String regex = "^([1-4])";

			int atbilde = 0;
			

			while (atbilde != questions.answer) {
				String atb = sc.next();
				if (tryParse(atb)) {
					atbilde = Integer.parseInt(atb);
					
					
					if (!(atb.matches(regex))) {
						System.out.println("Input number from 1 to 4");
						points += 2;

					} else if (atbilde != questions.answer) {
						System.out.println("Try again! Tip: " + questions.tip);
						points += 2;

					}
				} else {
					System.out.println("Input number from 1 to 4");
					points += 2;
				}
				
			}

			System.out.println("Correct! Good Job! 10 pointe earned");
			points2 += 10;
			System.out.println("For every wrong answer for this question you lost "+points+" points!");

		}
		int sum = points2 - points;
		System.out.println("You earned: " + sum + " points!");
		if(sum == 100) {
			System.out.println("Congratulations!");
		}else {
			System.out.println("You should repeat some basics!");
		}
		System.out.println();
		System.out.println("See you in next level!");


	}
	
	public static boolean tryParse(String atbilde) {

		try {
			Integer.parseInt(atbilde);
			return true;
		} catch (Exception e) {
			return false;
		}

		

	}

	private static Questions[] GetQuestions() {
		Questions[] returnArray = new Questions[10];
		Options options = new Options();

		returnArray[0] = new Questions("What is Java?", options.options1, 1, Tips.tip1);
		returnArray[1] = new Questions("What is JDK?", options.options2, 1, Tips.tip2);
		returnArray[2] = new Questions("Which one isn't access modifier in Java?", options.options3, 4, Tips.tip3);
		returnArray[3] = new Questions("When arrays are used?", options.options4, 4, Tips.tip4);
		returnArray[4] = new Questions("What you will see on console when enter: System.out.println(null)?",
				options.options5, 3, Tips.tip5);
		returnArray[5] = new Questions("Why Java program needs Java main method?", options.options6, 1, Tips.tip6);
		returnArray[6] = new Questions("Why we use package in Java?", options.options7, 4, Tips.tip7);
		returnArray[7] = new Questions(
				"Some Java Reserved Keywords are: abstract, boolean, break, case, class, enum, native, private, strictfp, super, throw, throne, void, while. Which word is wrong (not Keyword)?",
				options.options8, 4, Tips.tip8);
		returnArray[8] = new Questions("Which fact about the Constructor is wrong?", options.options9, 2, Tips.tip9);
		returnArray[9] = new Questions("Why isn't Java 100% Object-oriented?", options.options10, 3, Tips.tip10);

		return returnArray;
	}
}