import java.util.Scanner;

public class PriceCalc {

    public double priceCalculator(double price, int count) {
        double cena = price * count;
        return cena;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стоимость товара, $:");
        double price = scanner.nextDouble();
        System.out.println("Введите количество, шт:");
        int count = scanner.nextInt();

        PriceCalc z = new PriceCalc();
        double cena = z.priceCalculator(price, count);
        System.out.println("Стоимость товара, $ : "+cena);
    }
}
