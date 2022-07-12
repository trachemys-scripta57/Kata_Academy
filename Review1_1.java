import java.math.BigDecimal;

public class Review1_1 {
    public static void main(String[] args) {

        byte a = 1;
        byte b = 2;
        byte c = (byte) (a + b);
        int c1 = a + b;
        System.out.println("Сумма byte: " + c);
        System.out.println("Сумма int: " + c1 + '\n');

        double d = 0.1;
        double e = 0.7;
        double f = d + e;
        System.out.println("Сумма double: " + f + '\n');


        BigDecimal d1 = new BigDecimal(d);
        BigDecimal e1 = new BigDecimal(e);

        BigDecimal f1 = d1.add(e1);

        System.out.println("Сумма BigDecimal: " + f1 + '\n');

        int j = 2147483647;
        float h = j;
        System.out.println("int j: " + j);
        System.out.println("Автоматич преобразование с возможной потерей точности: " + h);
        if (j == h) {
            System.out.println("int j = float h" + '\n');
        } else {
            System.out.println("int j != float h" + '\n');
        }
        int i = 3;
        double k = 4.6;
        double l = i + k;
        System.out.println(l);
    }
}
