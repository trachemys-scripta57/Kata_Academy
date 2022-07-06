//Массивы в Java (https://www.youtube.com/watch?v=li86TEAEhYM)
package KataAcademy.doc;

public class Arrays {

    public static void main(String[] args) {
        int number = 10; //примитивный тип
        int[] numbers = new int[5];
        /* переменная ссылается на массив с кол-вом эл-тов 5. 
         * Ссылочный тип данных. Создаём массив с пустыми ячейками*/
        //System.out.println(numbers[0]); 
        /* обращаемся к ячейке массива 
         *по адресу 0,1,2,3,4*/
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;//инициализировали массив
        }
        for (int i = 0; i < numbers.length; i++) {
            //System.out.println(numbers[i]);//выводим на экран
        }
        System.out.println();
        int[] numbers1 = {1, 2, 3};//создаём массив с числами
        for(int i=0; i<numbers1.length; i++){
            System.out.println(numbers1[2]);
        }
    }
}
