public class AMystery {

    public static void addOne(int x) {
        x = x + 1;
    }
    public static void addOne(int[] array) {
        array[0] = array[0] + 1;
    }

    public static void main(String[] args) {
        int a = 4;
        int[] arr = {4, 5, 6};
        addOne(a);
        addOne(arr);

        System.out.println(a);
        for(int x : arr)
            System.out.print(x + " ");
    }
    
}
