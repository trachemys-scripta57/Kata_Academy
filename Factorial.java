
/* Реализуйте метод factorial, вычисляющий факториал заданного натурального числа.
   Факториал N вычисляется как 1 ⋅ 2 ⋅ ... ⋅ N
   Требования:
1. Метод должен быть public.
1. Метод должен быть static.
3. Передаваемый параметр должен иметь тип int.
4. Метод должен быть реализован через цикл.
*/
package Bambuk.Modul_1_2;

import java.math.BigInteger;

public class Factorial {
    public static BigInteger factorial(int value) {
        BigInteger a = BigInteger.valueOf(value);
        BigInteger c = BigInteger.ONE;
        BigInteger d = BigInteger.ONE;

        do {
            c = c.multiply(d = d.add(BigInteger.ONE));
            if (a.compareTo(new BigInteger("2")) < 0) {
                c = BigInteger.ONE;
                break;
            }
        } while (d.compareTo(a) < 0);

        System.out.println(c);
        return c;
    }

    public static void main(String[] args) {
        factorial(25    );
    }
}