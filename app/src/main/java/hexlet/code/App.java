package hexlet.code;

import  hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import java.util.Scanner;


public class App {
    private static final int GREET = 1;

    private static final int EVEN = 2;

    private static final int CALC = 3;

    private static final int GCD = 4;

    private static final int PROGRESSION = 5;

    private static final int PRIME = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");
        int gameChoice = scanner.nextInt();
        System.out.println("Your choice: " + gameChoice + "\n");
        switch (gameChoice) {
            case GREET:
                Cli.startGreeting();
                break;
            case EVEN:
                Even.startEven();
                break;
            case CALC:
                Calc.startCalc();
                break;
            case GCD:
                Gcd.startGCD();
                break;
            case PROGRESSION:
                Progression.startProgression();
                break;
            case PRIME:
                Prime.startPrime();
                break;
            default:
                throw new IllegalStateException("Unexpected value " + gameChoice);
        }
    }
}
