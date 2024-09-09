package hexlet.code.games;

import hexlet.code.Engine;
import  hexlet.code.Cli;
import hexlet.code.Util;

public class gcd {

    public static void gcdGame() {

        String[] questionsToUser = new String[Engine.getNUMBEROFQUESTIONS()];
        String[] correctAnswers = new String[Engine.getNUMBEROFQUESTIONS()];

        Cli.greeting();

        System.out.println("Find the greatest common divisor of given numbers.");
        for( int i = 0; i < Engine.getNUMBEROFQUESTIONS(); i++) {
            int firstNum = Util.makeRandomNumber(100), secondNum = Util.makeRandomNumber(100);
            questionsToUser[i] = String.format("%s %s", firstNum, secondNum);
            correctAnswers[i] = String.valueOf(findGCD(firstNum, secondNum));

        }
        Engine.gameEngine(questionsToUser, correctAnswers);
    }

    public static int findGCD(int num1, int num2) {
        while(num1 != 0 && num2 != 0) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }
        return num1 + num2;
    }

}
