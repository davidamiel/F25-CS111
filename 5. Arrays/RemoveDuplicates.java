import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] a = {3,5,2,3,4,1,5,6,2,1,7,8,9,7};

        Arrays.sort(a);
        for (int i=0; i < a.length ; i++) {
            int j = i+1;
            while (j < a.length && a[j] == a[i]) {
                a[j] = 0;
                j++;
            }
            if (j == a.length) break;
            i = j;
        }  

        System.out.println(Arrays.toString(a));
    }
}