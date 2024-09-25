package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int NUMBER_OF_QUESTIONS = 3;
    public static final int QUESTION_NUMBER = 0;
    public static final int ANSWER_NUMBER = 1;
    public static final int ELEMENTS_COUNT = 2;

    public static void run(String[][] questionsAndAnswers, String intro) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\nMay I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");

        System.out.println(intro);

        for (String[] questionAndAnswer: questionsAndAnswers) {
            System.out.println("Question: " + questionAndAnswer[QUESTION_NUMBER]);
            System.out.print("Your answer: ");
            String response = scanner.nextLine();

            if (questionAndAnswer[ANSWER_NUMBER].equalsIgnoreCase(response)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'"
                        + response + "'" + " is wrong answer ;(. Correct answer was " + "'"
                        + questionAndAnswer[ANSWER_NUMBER] + "'.");
                System.out.print("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
