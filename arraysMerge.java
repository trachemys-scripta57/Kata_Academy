import java.util.Arrays;

public class arraysMerge {
    public static int[] mergeArrays(int[] a1, int[] a2) {
        Arrays.sort(a1);
        Arrays.sort(a2);

        int[] result = new int[a1.length + a2.length];
        int b = a1.length;
        int c = a2.length;

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < b && j < c) {
            if (a1[i] <= a2[j]) {
                result[k] = a1[i];
                i++;
            } else {
                result[k] = a2[j];
                j++;
            }
            k++;
        }
        while (i < b) {
            result[k] = a1[i];
            i++;
            k++;
        }
        while (j < c) {
            result[k] = a2[j];
            j++;
            k++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a1 = new int[]{156, 25};
        int[] a2 = new int[]{-1, 0, 15, 1557};
        int[] result = mergeArrays(a1, a2);
        System.out.println(Arrays.toString(result));
    }
}

