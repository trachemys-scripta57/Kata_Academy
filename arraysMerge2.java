import java.util.Arrays;

import static java.lang.System.arraycopy;

public class arraysMerge2 {
    public static int[] mergeArrays(int[] a1, int[] a2) {
        Arrays.sort(a1);
        Arrays.sort(a2);

        int[] a3 = new int[a1.length + a2.length];
        int i = 0, j = 0, k = 0;
        while (i < a1.length && j < a2.length) {
            a3[k++] = a1[i] < a2[j] ? a1[i++] : a2[j++];
        }
        if (i < a1.length) {
            arraycopy(a1, i, a3, k, a1.length - i);
        } else if (j < a2.length) {
            arraycopy(a2, j, a3, k, a2.length - j);
        }
        return a3;
    }

    public static void main(String[] args) {
        int[] a1 = new int[]{156, 25, 0, -1, 8};
        int[] a2 = new int[]{-146, 2577, -0};
        int[] a3 = mergeArrays(a1, a2);
        System.out.println(Arrays.toString(a3));
    }
}
