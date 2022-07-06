public class arrayOddNumbers {
    public static void printOddNumbers(int[] arr) {
        StringBuilder a = new StringBuilder();
        boolean b = true;
        for (int c : arr) {
            if (Math.abs(c % 2) == 1) {
                if (b) {
                    a.append(c);
                    b = false;
                } else {
                    a.append(",").append(c);
                }
            }
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        int[] strArray = new int[]{1, 3, 15, 27, 19, -2, 0, 12, -3};
        printOddNumbers(strArray);
    }
}
