package KataAcademy.doc;
//касс String и его методы https://www.youtube.com/watch?v=ERTDiGH3XUA

public class string {

    public static void main(String[] args) {
        //способы создания объекта
        String str1 = new String("Hot, JaVa");
        String str2 = "Java";
        String str3 = "";

        String[] strings = str1.split("a"); //делит строку по символу или сочетанию символов
        for (String element : strings) {
            System.out.println(element);
        }
        //методы String:
        System.out.println("символ строки с индексом 0 - " + str1.charAt(0));
// возвращает символ строки по его индексу - J(0)a(1)v(2)a(3)
        System.out.println("значение символав Unicod - " + str1.codePointAt(1));

        System.out.println("Сравнивает строки и выдаёт разницу (Unicod) - " + str2.compareTo(str1));
        System.out.println("Сравнивает строки без учёта регистра - " + str1.compareToIgnoreCase(str2));

        System.out.println("Складывает (склеивает) строки - " + str1.concat(str2));// тоже что и str1 + str2

        System.out.println("Сравниваем строки (boolean) - " + str1.equals(str2));
        System.out.println("Сравниваем строки (boolean)без учёта регистра - " + str1.equalsIgnoreCase(str2));

        System.out.println("Возвращаем hash код объекта - " + str2.hashCode());//hash (???)

        System.out.println("индекс символа в строке по значению Unicod - " + str1.indexOf(86));
        //86 - Unicod dec: значение "V". Результат "2", иначе "-1"

        System.out.println("True если длинна строки равна 0 - " + str3.isEmpty());

        System.out.println("Длинна строки (с учётом пробелов) - " + str1.length());

        System.out.println("");
    }

}
