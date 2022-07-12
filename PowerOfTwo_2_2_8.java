public class PowerOfTwo_2_2_8 {
    public static boolean isPowerOfTwo(int value) {
        return ((double) (Math.log((Math.abs(value))) / Math.log(2)) == (int) ((Math.log(Math.abs(value))) / Math.log(2)));
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(8388608));
    }
}
