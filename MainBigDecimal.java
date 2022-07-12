import java.math.BigDecimal;

public class MainBigDecimal {

    public static void main(String[] args)  {

       /*Создаем два объекта BigDecimal - ноль и 0.1.
       Прибавляем 0.1 к нулю 11 раз подряд
       В классе BigDecimal сложение осуществляется с помощью метода add()*/
        BigDecimal f1 = new BigDecimal(0.0);
        BigDecimal pointOne = new BigDecimal(0.1);
        for (int i = 1; i <= 11; i++) {
            f1 = f1.add(pointOne);
        }

       /*Здесь тоже ничего не изменилось: создаем два объекта BigDecimal
       и умножаем 0.1 на 11
       В классе BigDecimal умножение осуществляется с помощью метода multiply()*/
        BigDecimal f2 = new BigDecimal(0.1);
        BigDecimal eleven = new BigDecimal(11);
        f2 = f2.multiply(eleven);

        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);

       /*Еще одна особенность BigDecimal - объекты чисел нужно сравнивать между
       собой с помощью специального метода compareTo()*/
        if (f1.compareTo(f2) == 0)
            System.out.println("f1 и f2 равны");
        else
            System.out.println("f1 и f2 не равны");
    }
}