
/*Проверить, является ли строка палиндромом?
 * - Учитывать только буквы и цифры (ASCII);
 * - Пробелы, знаки препинания - игнорировать;
 * - !!! сигнатура метода public static boolean isPalindrome (String text)*/
package Modul_1_2;

public class Palindrome2 {

    public static boolean isPalindrome(String text) {
        String str1 = text.replaceAll("[^a-zA-Z\\d]", "");

        String str2 = new StringBuilder(str1).reverse().toString();

        boolean b = str1.equalsIgnoreCase(str2);
        System.out.println(b);
        return b;

    }

    public static void main(String[] args) {
        isPalindrome("We");
    }
}
