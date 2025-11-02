public class CallStackDemo {

    public static void main(String[] args)  {
        methodA();
    }

    public static void methodA()  { 
        System.out.println("in Method A");
        methodB(); 
        System.out.println("leaving Method A");
    }

    public static void methodB()  {
        System.out.println("in Method B");
        methodC(); 
        System.out.println("leaving Method B");
    }

    public static void methodC() { 
        System.out.println("in Method C");
        System.out.println("leaving Method C");
    }
}
 
