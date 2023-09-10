/*
 * Credits to durron597
 * https://codegolf.stackexchange.com/a/28815
 */

public class TwoPlusTwoEdgeCase {
    public static void main(String... args) {
        double two = two();
        System.out.println("Variable two = " + two);
        double four = Math.ceil(two + two); // round just in case
        System.out.format("two + two = %.15f%n", four);

        assert two() == 2.0000000000000004;
    }

    // 20 * .1 = 2
    private static double two() {
        double two = 0;
        for(int i = 0; i < 20; i++) {
            two += .1;
        }
        return two;
    }
}
