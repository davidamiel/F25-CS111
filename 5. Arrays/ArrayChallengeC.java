public class ArrayChallengeC {

    public static void main(String[] args) {
        
        // Create an array that stores an unknown number of integers inputted by the user.
        int[] nums = new int[args.length];
        for(int i = 0; i < nums.length; i ++) {
            nums[i] = Integer.parseInt(args[i]);
        }
        // Print the number of elements in the array.
        System.out.println("Number of elements: " + nums.length);
        // Print the sum of the elements in the array.
        int sum = 0;
        for(int i = 0; i < nums.length; i ++) {
            sum += nums[i];
        }
        System.out.println("Sum: " + sum);
        // Print the elements of the array.
        System.out.println();
        for(int i = 0; i < nums.length; i ++) {
            System.out.print(nums[i] + " ");
        }
        // Print the elements of the array in reverse order.
        System.out.println();
        for(int i = nums.length - 1; i >= 0; i --) {
            System.out.print(nums[i] + " ");
        }

        System.out.println(nums[5]);

    }
}