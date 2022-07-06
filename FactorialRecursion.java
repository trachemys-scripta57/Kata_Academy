
//корректно считает до n=12 для int, n=20 для long

package Bambuk.Modul_1_2;

public class FactorialRecursion {
    private long factorial(int n) {
        long result = 1;

        if (n < 0) {
            System.out.println("Неожиданное исключение: java.lang.StackOverflowError");
            return 0;
        }

        if (n == 0) {
            System.out.print(" = ");
            return result;
        } else if (n == 1) {
            System.out.print(" * 1 = ");
            return result;
        }
        System.out.print(n);
        if (n!= 2) {
            System.out.print(" * ");
        }
        result = n * factorial(n - 1);
        return result;
    }

    public static void main(String[] args) {
        FactorialRecursion f = new FactorialRecursion();
        System.out.println(f.factorial(-1) + "!");
    }
}
