/*  Исключения https://www.youtube.com/watch?v=DElNhj71YCk */
package KataAcademy.doc;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Exception {

    public static void main(String[] args) {
        File file = new File("C://SomeDir", "someFile.txt");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException ex) {
            System.out.println("Указанный файл не найден");
        }
        System.out.println("После try-catch программа продолжает работу");
    }
}
