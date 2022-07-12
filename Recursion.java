public class Recursion {

    // рекурсия головы
    /*public int summ(int n) {
        if (n >= 1) {
            return summ(n-1) + n;
        }
        return n;
    }

    public static void main(String[] args) {
        Recursion r = new Recursion();
        System.out.println(r.summ(5));
    }*/
    //хвостовая рекурсия
    public int tailSum(int currentSum, int n) {
        if (n <= 1) {
            return currentSum + n;
        }
        return tailSum(currentSum + n, n - 1);
    }

    public static void main(String[] args) {
        Recursion r = new Recursion();
        System.out.println(r.tailSum(0, 5));
    }

    public static class arrayOddNumbers {
        public static void printOddNumbers(int[] arr) {
            StringBuilder a = new StringBuilder();
            boolean b = true;
            for (int c : arr) {
                if (Math.abs(c % 2) == 1)
                    if (b) {
                        a.append(c);
                        b = false;
                    } else {
                        a.append(",").append(c);
                    }
            }
            System.out.println(a);
        }

        public static void main(String[] args) {
            int[] strArr = new int[]{2, 3, 4,5,6, -7, -8, 9};
            printOddNumbers(strArr);
        }
    }
}
