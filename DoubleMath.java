package Modul_1_2;/* Вернуть ответ на вопрос a+b=c ? Допустимая погрешность - 0.0001 (1Е-4)
 * метод должен иметь сигнатуру doubleExpression(double a, double b, double c)*/

public class DoubleMath {
    public static boolean doubleExpression(double a, double b, double c) {

        return Math.abs(a + b - c) < 0.0001;
    }
}
