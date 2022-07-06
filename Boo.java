package Bambuk.Modul_1_2;

public class Boo {

    public static void main(String[] args) throws Exception {
        System.out.println(prov(false, false));
        System.out.println(prov(true, false));
        System.out.println(prov(false, true));
        System.out.println(prov(true, true));
    }

    static boolean prov(boolean x, boolean y) {
        boolean z = x & y;  // Тут менять логический оператор.
        return z;
    }
}
