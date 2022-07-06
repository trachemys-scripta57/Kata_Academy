package KataAcademy.doc;

public enum Animal {
DOG("пёс"),CAT("кошак"),FROG("жаба");    // если только перечисление, то ";" не нужна
//new DOG("пёс")

private String translation;

private Animal(String translation){//конструктор перевод на русский
 this.translation = translation;   
}
public String getTranslation(){
    return translation;
}
//public String toString(){//переопределённый метод ???
//    return "Перевод на русский язык - " + translation;
//}
}
