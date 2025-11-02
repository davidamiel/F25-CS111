public class ExtraFunctionPractice {

    // takes one int parameter and returns its square
    public static int square(int x) {
        return x * x;
    }

    // takes a person’s age and returns "child", "teen", or "adult" based on the value
    // child: < 13, teen: 13–17, adult: >= 18
    public static String classifyAge(int age) {
        if (age < 13) {
            return "child";
        } else if (age < 18) {
            return "teen";
        }
        return "adult";
    }

    // takes three integers and returns the largest value
    public static int maxOfThree(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    // prints a multiplication table up to a given number n
    public static void printMultiplicationTable(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                StdOut.print(i * j + "\t");
            }
            StdOut.println();
        }
    }

    // takes two integers and returns an int[] containing all integers between them (inclusive)
    public static int[] rangeInclusive(int start, int end) {
        int[] out = new int[end - start + 1];
        for (int i = 0; i < out.length; i++) {
            out[i] = start + i;
        }
        return out;
    }

    // takes an int[] and returns true if any element is negative, otherwise false
    public static boolean hasNegative(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                return true;
            }
        }
        return false;
    }

    // takes an int[] ids and returns the sum of all positive IDs
    public static int sumPositiveIds(int[] ids) {
        int sum = 0;
        for (int i = 0; i < ids.length; i++) {
            if (ids[i] > 0) {
                sum += ids[i];
            }
        }
        return sum;
    }

    // adds 10 to each element in an int[] directly
    public static void addTenInPlace(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] += 10;
        }
    }

    // reverses a boolean[] in place
    public static void reverseInPlace(boolean[] a) {
        // see ArrayFunctions.java for two potential solutions!
    }

    // takes a boolean[] and returns an int[] containing the indices of all true elements
    public static int[] indicesOfTrue(boolean[] a) {
        
        // Find how many true values there are
        // (we need this to be the length of the resulting array)
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]) count++;
        }

        // Then make that array...
        int[] out = new int[count];
        int nextOpenIndex = 0;

        // And fill it with the negative indices
        for (int i = 0; i < a.length; i++) {
            if (a[i]) {
                out[nextOpenIndex] = i;
                nextOpenIndex++;
            }
        }
        return out;
    }

    // reverses the rows of a 2D int[][] array in place
    public static void reverseRowsInPlace(int[][] m) {
        for(int i = 0; i < m.length/2; i ++) {
            // swap row i with row length-i-1
            int[] temp = m[i];
            m[i] = m[m.length - 1 - i];
            m[m.length - 1 - i] = temp;
        }

    }

    // overloaded average: two ints
    public static double average(int a, int b) {
        return (a + b) / 2.0;
    }

    // overloaded average: int[] array
    public static double average(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return (double) sum / a.length;
    }
}