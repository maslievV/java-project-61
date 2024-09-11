package hexlet.code;

import  hexlet.code.games.*;
import java.util.Scanner;


public class App {
    private static final int GREET = 1;

    private static final int EVEN = 2;

    private static final int CALC = 3;

    private static final int GCD = 4;

    private static final int PROGRESSION = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                0 - Exit""");
        int gameChoice = scanner.nextInt();
        System.out.println("Your choice: " + gameChoice + "\n");
        switch (gameChoice) {
            case GREET:
                Cli.greeting();
                break;
            case EVEN:
                Even.evenGame();
                break;
            case CALC:
                Calc.calcGame();
                break;
            case GCD:
                gcd.gcdGame();
                break;
            case PROGRESSION:
                Progression.progressionGame();
                break;
        }
    }
}
