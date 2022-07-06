package Bambuk.Modul_1_2;

import java.math.BigInteger;

public class FactorialBigIntegerRecurtion {
    public static BigInteger factorial(int value) {
        if (value <= 1) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(value).multiply((factorial(value - 1)));
    }

    public static void main(String[] args) {
        System.out.println(factorial(-3));
    }
}