public class RecursionPracticeProblems {

	public int count7(int n) {
	    if (n < 1) {
            return 0;
        }
        if (n % 10 == 7) {
            return 1 + count7(n/10);
        } else {
            return count7(n/10);
        }
    }

	public int count8(int n) {
        if (n < 1) {
            return 0;
        }
        if (n % 10 == 8 && (n / 10) % 10 == 8) {
            return 2 + count8(n/10);
        } else if (n % 10 == 8) {
            return 1 + count8(n/10);
        } else {
            return count8(n/10);
        }
	}

	public boolean array220(int[] nums, int index) {
        if (index >= nums.length-1)
            return false;
        if (nums[index+1] == nums[index] * 10)
            return true;
        return array220(nums, index+1);
	}

    public static double presentValue(double principal, double rate, int term) {
        if(term == 0) {
            return principal;
        }
        double interestEarned = principal * rate;
        double newValue = principal + interestEarned;
        int remainingTerm = term - 1;
        return presentValue(newValue, rate, remainingTerm); 
    }

    public static long popCount(int rounds, long currentPopulation) {
        if (rounds == 0) {
            return currentPopulation;
        }
        long newPop = currentPopulation * 2;
        return popCount(rounds - 1, newPop);
    }

    public static int combo(int amount, int value) {
        if (amount < 0 || value == 0)
            return(0);
        else if (amount == 0)
            return 1;
        else
            return (combo (amount, value - 1) + combo (amount - value, value));
    }

    public static int fooTwo(int x, int y) {
        if(y == 1) {
            return x;
        } else {
            int value = x + fooTwo(x, y-1);
            return value;
        }
    }

    public static int kiki(int a, int b) {
        if (a < b) {
            return 0;
        } else {
            return 1 + kiki(a - b, b);
        }
    }

    public static int bobo(int n) {
        if (n==1) {
            return 1;
        } else {
            int value = n * bobo(n-1);
            return value;
        }
    }

    public static void main(String[] args) {
        System.out.println(kiki(5, 3));
    }





}
