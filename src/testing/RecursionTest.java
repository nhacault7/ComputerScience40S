package testing;

import tools.Calculator;

/**
 *
 * @author n.hacault
 */
public class RecursionTest {

    public RecursionTest() {
        System.out.println("Recursion test starting...");

        // edge testing
        final int MIN = 0;
        final int MAX = 20;
        for (int i = MIN; i <= MAX; i++) {
            long answer = Calculator.factorial(i);
            System.out.println(i + " 5 factorial = " + answer);
        }

        final int MIN_E = 0;
        final int MAX_E = 10;
        final int MIN_B = 0;
        final int MAX_B = 50;

        for (int b = MIN_B; b <= MAX_B; b++) {
            for (int e = MIN_E; e <= MAX_E; e++) {
                long answer = Calculator.power(b, e);
                System.out.println(b + " to the power of " + e
                        + " = " + answer);
            }
        }

        System.out.println("Recursion test complete!");
    }

}
