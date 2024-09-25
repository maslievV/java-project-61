package hexlet.code;


public class Utils {
    private static final int RANDOM_UPPER_LIMIT = 100;

    public static int makeRandomNumber(int num) {
        return (int) (Math.random() * num);
    }
    public static int makeRandomNumber() {
        return makeRandomNumber(RANDOM_UPPER_LIMIT);
    }
}
