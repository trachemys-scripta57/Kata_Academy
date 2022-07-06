package Bambuk.Modul_1_2;

public class Volleyball {
    public int determineGroup(int age) {
        int groupNum;
        if (age >= 7 && age <= 13) {
            groupNum = 1;
        } else if (age >= 14 && age <= 17) {
            groupNum = 2;
        } else if (age >= 18 && age <= 65) {
            groupNum = 3;
        } else {
            groupNum = -1;
        }
        System.out.println(groupNum);
        return groupNum;
    }

    public static void main(String[] args) {
        Volleyball v = new Volleyball();
        v.determineGroup(10);
    }
}
