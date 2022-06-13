import java.util.*; //scanner
import java.util.regex.*;//regex (Pattern, Matcher)

public class Calc {
    public static void main(String[] args) {
        /*получаем выражение из консоли*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение из двух чисел от 1 до 10 или от I до X, оператор +, -, :, *: ");
        String string = scanner.nextLine();
        /*сравниваем полученную строку с шаблонами для арабских и римских чисел*/
        String regexA = "\\b([1-9]|10)([-+*:])([1-9]|10)\\b";
        Pattern patternA = Pattern.compile(regexA);

        String regexR = "\\b(I|II|III|IV|V|VI|VII|VIII|IX|X)([-+*:])(I|II|III|IV|V|VI|VII|VIII|IX|X)\\b";
        Pattern patternR = Pattern.compile(regexR);
        /*перебираем последовательно символы строки (выражения)
         *пока не встретим совпадения с шаблоном*/
        Matcher mA = patternA.matcher(string);
        Matcher mR = patternR.matcher(string);

        boolean foundA = mA.find();
        boolean foundR = mR.find();
        /*определяемся с нотацией символов в выражении - арабские
         *или римские*/
        Matcher m = foundA ? mA : foundR ? mR : null;

        if (foundA || foundR) {
            /*указываем область поиска в шаблоне*/
            Integer first = getOperand(m.group(1));
            String opeR = m.group(2);
            Integer second = getOperand(m.group(3));
            Integer result = null;
            /*определяем арифметический оператор, прописываем действие*/
            switch (opeR) {
                case "+" -> result = first + second;
                case "-" -> result = first - second;
                case "*" -> result = first * second;
                case ":" -> result = first / second;
                default -> {
                }
            }
            // System.out.println("Введено выражение: " + first + opeR + second);

            if (result != null) {
                //null - значение по умолчанию всех ссылочных объектов
                if (foundA) {
                    System.out.println("Результат: " + result);
                } else {
                    System.out.println("Результат: " + convert(result));
                }
            }
        } else {
            System.out.println("Повторите ввод (напр. 10+9 или IX:III)");
        }
    }

    static Integer getOperand(String opStr) {
        int result;
        /*проверяем корректность введённых в строку символов*/
        try {
            result = Integer.parseInt(opStr);
        } catch (NumberFormatException e) {
            result = switch (opStr) {
                case "I" -> 1;
                case "II" -> 2;
                case "III" -> 3;
                case "IV" -> 4;
                case "V" -> 5;
                case "VI" -> 6;
                case "VII" -> 7;
                case "VIII" -> 8;
                case "IX" -> 9;
                case "X" -> 10;
                default -> throw e;
            };
        }
        return result;
    }

    /* преобразуем результат в римское число если оно не отрицательное
     * и меньше 100 - максимальное значение для наших условий*/
    static String convert(int number) {
        if (number < 0 || number > 100) {
            return "Это число не может быть преобразовано";
        }
        String romanOnes = romanDigit(number % 10, "I", "V", "X");
        number /= 10; // оператор деления /= делит левый операнд на правый

        String romanTens = romanDigit(number % 10, "X", "L", "C");
        number /= 10;

        String romanHundreds = romanDigit(number % 10, "C", "", "");

        return romanHundreds + romanTens + romanOnes;
    }
    /*формирование отображения написания римских цифр*/
    static String romanDigit(int n, String one, String five, String ten) {
        if (n >= 1) {
            switch (n) {
                case 1:
                    return one;
                case 2:
                    return one + one;
                case 3:
                    return one + one + one;
                case 4:
                    return one + five;
                case 5:
                    return five;
                case 6:
                    return five + one;
                case 7:
                    return five + one + one;
                case 8:
                    return five + one + one + one;
                case 9:
                    return one + ten;
                default:
                    break;
            }
        }
        return "0";
    }
}
