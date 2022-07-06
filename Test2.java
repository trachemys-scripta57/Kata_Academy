package KataAcademy.doc;

public class Test2 {
    public static void main(String[] args) {
//        Season season = Season.AUTUMN;
//        Animal animal = Animal.CAT;
//        System.out.println("Название текущей Enum константы - " + animal.name());
        
////из строки получить Enum
//        Animal frog = Animal.valueOf("FROG");
//        System.out.println("доп информация объекта Enam - " + frog.getTranslation());
      
//получить индекс Enum (номер ячейки в массиве) 
  Season winter = Season.WINTER;
        System.out.println("номер в массиве (индекс) " + winter.ordinal());
    }
}
