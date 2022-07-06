/*Методы в Java https://www.youtube.com/watch?v=ayUbY2sB-IU 
* https://www.youtube.com/watch?v=wEewTdZEWPY */
package KataAcademy.doc;

public class Method {

    String name;
    int age;

    void speak() {
//        for(int i=0; i<3; i++){//цикл повторяет метод трижды
        System.out.println("Меня зовут " + name + ", мне " + age + " лет");
    }
//}

    void sayHello() {
        System.out.println("Hello!");
    }

    int calculateYearsToRerirement() {
        int years = 65 - age;
//        System.out.println("Кол-во лет до пенсии: " + years);
        return years;
    }
}

class MethodTest {

    public static void main(String[] args) {
        Method me = new Method();
        me.age = 47;
        me.name = "Павел";
        me.speak();
        me.sayHello();
//        me.calculateYearsToRerirement();
        int yearsП = me.calculateYearsToRerirement();

        Method he = new Method();
        he.name = "Таня";
        he.age = 34;
        he.speak();
        he.sayHello();
//        he.calculateYearsToRerirement();
        int yearsТ = he.calculateYearsToRerirement();
        
        System.out.println("Павлу до пенсии: " + yearsП);
        System.out.println("Тане до пенсии: " + yearsТ);
    }
}
