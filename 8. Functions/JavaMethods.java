public class JavaMethods {

    public static void main(String[] arguments) {

        int result = multiplyTwoNumbers(5, 6);
        System.out.println(result);


        multiplyAndPrint(5, 6);
 
    }

    
    public static int multiplyTwoNumbers(int cat, int dog) {
        int c = cat * dog;
        return c;
    }

    public static void multiplyAndPrint(int apple, int banana) {
        double pear = apple * banana;
        System.out.println(pear);
    }





    
}
