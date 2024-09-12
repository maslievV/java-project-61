package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class Progression {

    private static final int ARRAY_LENGTH = 10;
    private static final int MAXSTEP = 10;

    public static void progressionGame() {

        String[] questionsToUser = new String[Engine.getNUMBEROFQUESTIONS()];
        String[] correctAnswers = new String[Engine.getNUMBEROFQUESTIONS()];

        Cli.greeting();
        System.out.println("What number is missing in the progression? ");

        for (int i = 0; i < Engine.getNUMBEROFQUESTIONS(); i++) {
            int beginning = Engine.makeRandomNumber(Engine.getRandomsize());
            int step = Engine.makeRandomNumber(MAXSTEP);
            String[] numbers = makeProgression(beginning, step, ARRAY_LENGTH);

            int randomIndex = Engine.makeRandomNumber(numbers.length);
            String missedNumber = numbers[randomIndex];
            numbers[randomIndex] = "..";

            questionsToUser[i] = String.join(" ", numbers);
            correctAnswers[i] = missedNumber;
        }
        Engine.gameEngine(questionsToUser, correctAnswers);

    }

    public static String[] makeProgression(int start, int n, int arrayLength) {

        String[] arrayNum = new String[arrayLength];
        arrayNum[0] = String.valueOf(start);

        for (int i = 1; i < arrayLength; i++) {
            arrayNum[i] = String.valueOf(start + n);
            start = start + n;
        }
        return arrayNum;
    }


}

