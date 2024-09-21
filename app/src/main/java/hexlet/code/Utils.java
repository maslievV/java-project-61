package hexlet.code;


public class Utils {
    public static int makeRandomNumber(int num) {
        return (int) (Math.random() * num);
    }
    public static int makeRandomNumber() { return (int) (Math.random() * 100); }
}
