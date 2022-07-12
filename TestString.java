/*выбрать выражения дающие строку А12*/
public class TestString {
    public static void main(String[] args) {
        System.out.println("A" + ('\t' + '\u0003'));
        System.out.println('A' + '1' + "2"); //1142
        System.out.println("A" + 12);
        System.out.println('A' + "12");
    }
}
/*все кроме второго варианта:
 * 'A' + '1' = 114, так как при сложении Char происходит сложение
 * целочисленных значений. Операции читаются слва на право.*/