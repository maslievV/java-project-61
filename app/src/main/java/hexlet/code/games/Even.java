package hexlet.code.games;

import hexlet.code.Util;
import hexlet.code.Cli;
import java.util.Scanner;

public class Even {
    private static final int numberOfQuestions = 3;

    public static void even() {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < numberOfQuestions; i++) {
            int randomNum = Util.makeRandomNumber();
            System.out.println("Question: " + randomNum);
            System.out.print("Your answer: ");
            String ans = scanner.nextLine();
            if(ans.equals(checkEven(randomNum))) {
                System.out.println("Correct!");
                count++;
                if (count == 3) {
                    System.out.println("Congratulations Vlad");
                }
            } else {
                System.out.println(ans + " is wrong answer ;(. Correct answer was " + checkEven(randomNum));
            }
        }
    }

    public static String checkEven(int num) {
        return num % 2 == 0 ? "yes" : "no";
    }
}
