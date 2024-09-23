package hexlet.code;


public class Utils {
    private static final int RANDOM_SIZE = 100;

    public static int makeRandomNumber(int num) {
        return (int) (Math.random() * num);
    }
    public static int makeRandomNumber() {
        return (int) (Math.random() * RANDOM_SIZE);
    }
}
