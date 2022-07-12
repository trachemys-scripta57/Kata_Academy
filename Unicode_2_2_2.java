public class Unicode_2_2_2 {
    public static char charExpression(int a) {
        return (char) ('\\' + a);
    }

    public static void main(String[] args) {
        System.out.println(charExpression(5));
    }
}
