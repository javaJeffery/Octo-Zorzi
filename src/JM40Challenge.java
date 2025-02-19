package src;

public class JM40Challenge {
    public static void main(String[] args) {
        double twenty = 20.0;
        double eighty = 80.0;
        double x = (twenty + eighty) * 100.0;

        double remainder = x % 40.0;
        boolean isZero = remainder == 0;

        System.out.println(isZero);

        String s = isZero ? "YES" : "NO";

        System.out.println(s);
    }
}
