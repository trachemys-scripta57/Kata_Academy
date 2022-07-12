public class Review1_2 {
    public static void main(String... sss) {
        print("Как", "же", "прекрасно", "изучать", "Java");
    }

    static void print(String... words) {
        for (String word : words) {
            System.out.println(word);
        }
    }
}
