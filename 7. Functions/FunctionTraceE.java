public class FunctionTraceE {

    public static double change(double value) {
        return value - 2;
    }

    public static void printArray(double[] arr) {
        System.out.println();
        for(double x : arr)
            System.out.print(x + "\t");
        System.out.println();
    }

    public static double[] alpha(double[] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = change(arr[i]);
        }
        return arr;
    }

    public static double[] beta(double[] vals) {
        double[] arr = new double[vals.length];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = change(vals[i]);
        }
        return arr;
    }

    public static void main(String[] args){
        double[] arr = {14.2, 6.5, 2.4, 7, 12.3};
        double[] arrAlpha = alpha(arr);
        double[] arrBeta = beta(arr);

        printArray(arr);
        printArray(arrAlpha);
        printArray(arrBeta);
    }
    
}
