public class arrayOddNumbers {
    public static void printOddNumbers(int[] arr) {
        StringBuilder a = new StringBuilder();
        boolean b = true;
        for (int c : arr) {
            if (Math.abs(c % 2) == 1)
                if (b) {
                    a.append(c);
                    b = false;
                } else {
                    a.append(", ").append(c);
                }
        }
        System.out.println(a);
    }
}
