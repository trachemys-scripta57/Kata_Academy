public class simplePriceCalc {
    public double priceCalculator(double price, int count){
        return price*count;
    }

    public static void main(String[] args) {
        simplePriceCalc v = new simplePriceCalc();
        double price = 1450.9;
        int count = 3;
        double cena = v.priceCalculator(price, count);
        System.out.println("Стоимость товара: "+cena);
    }
}
