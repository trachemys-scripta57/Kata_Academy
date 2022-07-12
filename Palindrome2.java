
/*Проверить, является ли строка палиндромом?
 * - Учитывать только буквы и цифры (ASCII);
 * - Пробелы, знаки препинания - игнорировать;
 * - !!! сигнатура метода public static boolean isPalindrome (String text)*/

public class Palindrome2 {

    public static boolean isPalindrome(String text) {
        String str1 = text.replaceAll("[^a-zA-Z\\d]", "");

        String str2 = new StringBuilder(str1).reverse().toString();

        return str1.equalsIgnoreCase(str2);

    }

    public static void main(String[] args) {

        System.out.println(isPalindrome("Was it a cat I saw?"));
    }
}
