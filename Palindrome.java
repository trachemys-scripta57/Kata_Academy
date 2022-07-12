
/* Проверить, является ли строка палиндромом?
 * - Учитывать только буквы и цифры (ASCII);
 * - Пробелы, знаки препинания - игнорировать;
 * - Удалить из строки все символы не ASCII.*/

import java.util.Scanner;
import java.util.regex.*;

public class Palindrome {
    static boolean Palindrome;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст палиндрома: ");
        String text = scanner.nextLine();
        String str1 = text.replaceAll("\\W", "");


        char[] array = str1.toCharArray();
        String str2 = "";
        for (int i=array.length-1; i>=0; i--){
            str2 = str2 + array[i];
        }
        if (str1.equalsIgnoreCase(str2)& str2.length() > 1){ //сравниваем содержимое строк игнорируя регистр
            System.out.println("Батюшки! Дык это ПАЛИНДРОМ!");
        }else{
            System.out.println("Нет. Это что угодно, но не палиндром.");
        }

        System.out.println(str1);
        System.out.println(str2);


    }
}
