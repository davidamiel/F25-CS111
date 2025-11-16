public class Palindromes {

    public static boolean Palindrome1(String str) {
        String forwards = str;
        String backwards = reverseString(str);
        return forwards.equals(backwards);
    }

    public static String reverseString(String s) {
        String rev = "";
        for(int i = s.length() - 1; i >=0; i--)
            rev += s.charAt(i);
        return rev;
    }
    
    public static String reverseStringRec(String s) {
        if (s.length() == 0)
            return "";
        String smallPiece = "" + s.charAt(s.length() - 1);
        String recursiveCall = reverseStringRec(s.substring(0, s.length() - 1));
        return smallPiece + recursiveCall;
        
        /* 
         * Alternatively, you could replace the three lines above with: 
         * return s.charAt(s.length() - 1) + reverseStringRec(s.substring(0, s.length() - 1));
         */
    }

    public static boolean Palindrome2(String s) {
        int len = s.length();
        for (int i = 0; i <= len/2; i++){
            if (s.charAt(i) != s.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean Palindrome3(String s) {
        if (s.length() == 1) {
            return true;
        }
        boolean smallerProblem = s.charAt(0) ==  s.charAt(s.length() - 1);
        boolean recursiveStep = Palindrome3(s.substring(1, s.length() - 1));
        return smallerProblem && recursiveStep;

        /*
         * Alternatively, you should replace the three lines above with 
         * return (s.charAt(0) ==  s.charAt(s.length() - 1)) &&  isPalindrome3(s.substring(1, s.length() - 1));
         */
    }

    

}
