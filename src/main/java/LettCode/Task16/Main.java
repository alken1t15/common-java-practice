package LettCode.Task16;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println(divide(-2147483648, 1));
        // System.out.println(divide2(2147483647,-1));
    }

    public static long divide(long dividend, int divisor) {
        BigInteger value = new BigInteger(String.valueOf(dividend)).divide(BigInteger.valueOf(divisor));
        int b = value.intValue();
        if (dividend == -2147483648 && divisor == -1) {
            return 2147483647;
        }
        return b;
    }

    public static int divide2(int dividend, int divisor) {
        if (dividend == -2147483648 && divisor == -1) {
            return 2147483647;
        } else if (dividend == -2147483648 && divisor == 1) {
            return -2147483648;
        }
        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;


        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        int quotient = 0;

        while (dividend >= divisor) {
            dividend -= divisor;
            ++quotient;
        }

        if (sign == -1)
            quotient = -quotient;

        return quotient;
    }
}
