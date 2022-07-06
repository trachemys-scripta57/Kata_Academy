package KataAcademy.doc;

public class string2 {

    public static void main(String[] args) {
        String str1 = new String(" Hot JaVa Hello! ");
        String str2 = "Java";
                
            System.out.println("делает все буквы строчными - " + str1.toLowerCase());
            System.out.println("делает все буквы ЗАГЛАВНЫМИ - " + str1.toUpperCase());
            
            System.out.println("обрезает пробелы в начале и в конце строки - " + str1.trim());
            
            System.out.println("Вырезает 8 символов после 2го - " + str1.substring(2, 8));
        
        char[] charArray = str2.toCharArray();
//        for(char element: charArray){
//            System.out.println("символы строки разбили и передали в массив: ");
//            System.out.println(element);
//        break; //если надо остановить цикл или continue

            System.out.println("Собираем массив в строку: " + String.copyValueOf(charArray));

        }
    }
    
