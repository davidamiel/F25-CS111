public class Sums {

    public static int oneSum(int[] a) {
        int N = a.length; int count = 0;
        for (int i = 0; i < N; i++)
            if (a[i] == 0) {count ++;}
        return count;
    }

    public static int twoSum(int[] a) {
        int N = a.length; int count = 0;
        for (int i = 0; i < N; i++)
            for (int j = i + 1; j < N; j++)
                if (a[i] + a[j] == 0)
                    count ++;
        return count;
    }

    public static int threeSum(int[] a) {
        int N = a.length; int count = 0;
        for (int i = 0; i < N; i++)
            for (int j = i+1; j < N; j++)
                for (int k = j+1; k < N; k++)
                    if (a[i] + a[j] + a[k] == 0)
                        count ++;
        return count;
    }

    public static void main(String[] args) {

        // Set n. This will be the size of our input array.
        int n = 100000;
        int[] arr = new int[n];

        // Let's now fill the array with random integers between a and b (inclusive)
        int a = -100000;
        int b = 100000;
        for(int i = 0; i < arr.length; i++) {
            int randomNum = (int)(Math.random() * ((b - a) + 1)) + a;
            arr[i] = randomNum;
        }

        // Now - time the execution of each of the methods!

        long start = System.nanoTime();
        oneSum(arr);
        long duration = System.nanoTime() - start;
        double millis = duration / 1_000_000.0;
        System.out.printf("oneSum: %.3f milliseconds%n", millis);

        start = System.nanoTime();
        twoSum(arr);
        duration = System.nanoTime() - start;
        millis = duration / 1_000_000.0;
        System.out.printf("twoSum: %.3f milliseconds%n", millis);

        start = System.nanoTime();
        threeSum(arr);
        duration = System.nanoTime() - start;
        millis = duration / 1_000_000.0;
        System.out.printf("threeSum: %.3f milliseconds%n", millis);

    }

    

    
}
