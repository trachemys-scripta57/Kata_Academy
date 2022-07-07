
/*https://www.youtube.com/watch?v=bD9YEH3z3c4
 * Разбиваем массив на части, сортируем, собираем.*/


public class arraysMerge3 {
    public static void main(String[] args) {
        int[] arr = {2, 9, 5, 4, 8, 1, 6, -5, 123, 55, 3, 1000};
        mergeSort(arr);

        for (int i : arr) System.out.println(i + " ");
    }

    private static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n == 1) return;

        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        System.arraycopy(arr, 0, l, 0, mid);
        if (n - mid >= 0) System.arraycopy(arr, mid, r, 0, n - mid);

        mergeSort(l);
        mergeSort(r);
        merge(arr, l, r);
    }

    private static void merge(int[] arr, int[] l, int[] r) {
        int left = l.length;
        int right = r.length;
        int i = 0;
        int j = 0;
        int idx = 0;

        while (i < left && j < right) {
            if (l[i] < r[j]) {
                arr[idx] = l[i];
                i++;
            } else {
                arr[idx] = r[j];
                j++;
            }
            idx++;
        }

        for (int ll = i; ll < left; ll++)
            arr[idx++] = l[ll];

        for (int rr = j; rr < right; rr++)
            arr[idx++] = r[rr];
    }
}
