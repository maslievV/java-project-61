package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int NUMBER_OF_QUESTIONS = 3;
    public static final int RANDOM_SIZE = 100;

    public static void run(String[] userQuestions, String[] rightAnswers, String description) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\nMay I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");

        System.out.println(description);

        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            System.out.println("Question: " + userQuestions[i]);
            System.out.print("Your answer: ");
            String response = scanner.nextLine();

            if (rightAnswers[i].equals(response)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'"
                        + response + "'" + " is wrong answer ;(. Correct answer was " + "'"
                        + rightAnswers[i] + "'.");
                System.out.print("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
