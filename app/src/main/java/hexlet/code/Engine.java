package hexlet.code;

import java.util.Scanner;

public class Engine {

    private static final int NUMBEROFQUESTIONS = 3;

    public static void gameEngine(String[] userQuestions, String[] rightAnswers) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        for (int i = 0; i < NUMBEROFQUESTIONS; i++) {
            System.out.println("Question: " + userQuestions[i]);
            System.out.print("Your answer: ");
            String response = scanner.nextLine();

            if (rightAnswers[i].equals(response)) {
                System.out.println("Correct!");
                count++;
                if (count == 3) {
                    System.out.println("Congratulations, " + Cli.getUserName() + "!");
                }
            } else {
                System.out.println(" " + response + " " + " is wrong answer ;(. Correct answer was " + rightAnswers[i] + ".");
                System.out.print("Let's try again " + Cli.getUserName() + "!");
                break;
            }
        }
    }
    public static int makeRandomNumber(int num) {
        return (int) (Math.random() * num);
    }

    public static int getNUMBEROFQUESTIONS() {
        return NUMBEROFQUESTIONS;
    }

}
