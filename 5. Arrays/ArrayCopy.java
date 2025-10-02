public class ArrayCopy {

    public static void main(String[] args) {

        double[] a = {1.1, 2.2, 3.3, 4.4, 5.5};
         
        // Proper way to create a copy of array a and call it array b
        double[] b = new double[a.length];
        for (int i = 0; i < a.length; i++) 
            b[i] = a[i]; 

        // Improper way to create a copy of array a and call it array c
        double[] c = new double[a.length];
        c = a; 

    }
}
