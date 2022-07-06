package Modul_1_2;

public class PowerOfTwo2 {
    public static boolean isPowerOfTwo(int value) {
        boolean q;
        double a = Math.abs(value); //модуль введённого числа
        double n = Math.log(a) / Math.log(2); //степень по основанию 2
        System.out.println("Модуль введённого числа: " + a);
        System.out.println("Степень по основанию 2: " + n);
        if (n == (int) n) {
            q = true;
            System.out.println("Введённое число (в абсолюте) является степенью числа 2: " + true);
        } else {
            q = false;
            System.out.println("Введённое число (в абсолюте) не является степенью числа 2: " + false);
        }
        return q;
    }

    public static void main(String[] args) {
        isPowerOfTwo(6);
    }
}
