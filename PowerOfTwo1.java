package Modul_1_2;/* Проверка: является ли число степенью двойки?
 * двоичный логорифм */

public class PowerOfTwo1 {

public static double isPowerOfTwo(int value){
    double a = Math.abs(value); //модуль введённого числа
    double n = Math.log(a)/Math.log(2); //степень по основанию 2
    System.out.println("Модуль введённого числа: " + a);
    System.out.println("Степень по основанию 2: " + n);
    if(n ==(int)n){
        System.out.println("Ввендённое число (в абсолюте) является степенью числа 2");
    }else{
        System.out.println("Ввендённое число (в абсолюте) не является степенью числа 2");
    }
    return n;
}

    public static void main(String[] args) {

        isPowerOfTwo(0);

    }
}
