public class Sorting {

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void selectionSort(int[] a) {
        int n = a.length;
        for(int i = 0; i < n; i++) {
            int minIndex = i;
            for(int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex])
                    minIndex = j;
            }
            swap(a, i, minIndex);
        }
    }

    public static void insertionSort(int[] a) {
        int n = a.length;
        for(int i = 1; i < n; i++) {
            for(int j = i; j > 0; j--) {
                if(a[j] < a[j-1])
                    swap(a, j-1, j);
                else break;
            }
        }
    }

}
