package KataAcademy.doc;

public enum Season {
WINTER(-30), SPRING(20), SUMMER(35), AUTUMN(10);    //объекты (класса) enum (типа new WINTER)
private int temperature;

Season(int temperature){
this.temperature = temperature;
//конструктор для храниения доп.данных объектов, напр. ср.температура
}        
public int getTemperature(){//метод возвращающий доп параметр, температуру
    return temperature;
}
}
