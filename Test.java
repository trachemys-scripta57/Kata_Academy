package KataAcademy.doc;

public class Test {

    public static void main(String[] args) {
//        Animal animal = Animal.CAT; //статич переменная из списка Enam.Animal
//        System.out.println(animal + " переводится как " + animal.getTranslation());
        /* если без переопределённого метода Animal.toString (коментим)*/
        //System.out.println(animal); //вывод через переопределённый метод Animal.toString
//    }
//  }

////        
////        switch (animal){
////            case CAT:
////                System.out.println("Это кошак!");
////                break;
////            case DOG:
////                System.out.println("Это пёс!");
////                break;
////            case FROG:
////                System.out.println("Это жаба!");
////                break;
////        }
//
        Season season = Season.AUTUMN;
        System.out.println(season + " средняя температура " + season.getTemperature()+ " градусов по Цельсию");
    }
}
//Object -> Enum -> Season
//        System.out.println(season instanceof Season);//проверка принадлежности к Enum
//        System.out.println(season instanceof Enum);
//        System.out.println(season instanceof Object);
//        /* объект AUTUMN принадлежит как enum (классу)Season, так и родителям
//* Enum и прородителю Object */
//        System.out.println(season.getClass()); //проверка принадлежности к классу
//    }

//}
