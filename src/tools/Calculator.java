package tools;

/**
 *
 * @author n.hacault
 */
public class Calculator {

    public static long factorial(int number) {
        /* base case(s) - stops the recursion
        they are the "special" cases */
        if (number <= 0) return 0;
        if (number == 1) return 1;

        /* recursive case(s) - where the
        method calls itself */
        return number * factorial(number - 1);
    }
    
    public static long power(int base, int exponent) {
        if (exponent == 0) return 1;    // base
        if (exponent == 1) return base; // base       
        if (exponent < 0) {
            return 1 / power(base, exponent * -1);
        }
        
        return base * power(base, exponent - 1); // recursive
    }

}
