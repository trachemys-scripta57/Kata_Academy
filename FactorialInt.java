//https://javarush.ru/groups/posts/1895-rekursija-v-java

public class FactorialInt {

    public static int factorial(int value) {
        if (value < 0) { //проверка на отрицательные значения
            System.out.println("Введи положительное число.");
        }
        int result = 1;
        if (value == 0) { //проверка для нуля
            return result;
        }

        for (int i = 1; i <= value; i++) {
            result = result * i;
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        factorial(3);
    }
}
