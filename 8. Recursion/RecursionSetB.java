public class RecursionSetB {

    public static void convert(int n) {
        int quotient = n / 2;
        int remainder = n % 2;
        if (quotient > 0) {
            convert(quotient);
        }
        System.out.print(remainder);
    }

    public static int GCD(int num1, int num2) {
        if(num2 == 0)
            return num1;

        int nextNum1 = num2;
        int nextNum2 = num1 % num2;
        return GCD(nextNum1, nextNum2);
        //A more condensed alternative:
        //return GCD(num2, num1 % num2);
    }

    // Searching for a 3 in the array a, starting at firstIndex
    // Return true if there is 3 in array a between firstIndex and index a.length - 1
    public static boolean findThree(int[] a, int firstIndex) {
        // Base case #1 - I have an "empty" array and/or
        // I've already looked everywhere else
        if(firstIndex == a.length) {
            return false;
        }

        // General case: findThree(a, i) = a[i] == 3 || findThree(a, i+1)
        // The 'first' element in the array is a 3 - we found it! Wooo! 
        if(a[firstIndex] == 3) {
            return true;
        }
        return findThree(a, firstIndex + 1);
        /* 
         * Another option (same thing just a different implementation!)
         * return a[i] == 3 || findThree(a, firstIndex + 1);
         */

    }

    public static int sum(int[] a, int index) {
        // Base Case (end of the array)
        if(index == a.length) {
            return 0;
        }

        // Base Case OPTION 2
        /* 
         * if(index == a.length - 1) {
         *  return a[a.length -1];
         * }
         */

        // General Case
        int sum = a[index] + sum(a, index + 1);
        return sum;
    }

    public static int max(int[] a, int start) {
        // Base Case: the maximum of a single element is that element:
        // max(a, a.length - 1) = a[a.length -1]

        if(start == a.length - 1) {
            return a[a.length - 1];
        }

        // General Case: max(a, start) = the larger of a[start] and max(a, start + 1)
        int maxOfTheRest = max(a, start + 1);
        if(a[start] > maxOfTheRest) {
            return a[start];
        } else {
            return maxOfTheRest;
        }
    }

    public static void main(String[] args) {
        System.out.println(GCD(17, 13));
    }
    
}
