package Modul_1_2;/* Принимаем кол-во купленных мониторов и кол-во программистов, раздаём
 * одинаковое кол-во всем программистам. Какой остаток?*/

public class MonitorsCounter {
    double a = 0x0bp3;

    public int drawisMonitorsCount(int monitors, int programmers) {
        return monitors % programmers;
    }

    public static void main(String[] args) {
        MonitorsCounter x = new MonitorsCounter();
        System.out.println(x.drawisMonitorsCount(9, 2));
    }
}
