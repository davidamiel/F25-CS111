public class PracticeSetB {
    
    public String zipZapItr(String str) {
        int len = str.length();
        String finalString = "";
        for (int i = 0; i < len; i++) {
            finalString += str.substring(i,i+1);
            if (i > 0 && i < len-1) {
                if (str.charAt(i-1) == 'z' && str.charAt(i+1) == 'p') {
                    finalString = finalString.substring(0,finalString.length()-1);
                }
            }
        }
        return finalString;
    }
    
    public String zipZapRec(String str) {
        if (str.length() < 3)
            return str;
        if (str.charAt(0) == 'z' && str.charAt(2) == 'p')
            return "zp" + zipZapRec(str.substring(3));
        return str.charAt(0) + zipZapRec(str.substring(1));
    }

    public String pairStar(String str) {
        if (str.equals("") || str.length() == 1)
            return str;
        if (str.charAt(0) == str.charAt(1))
            return str.charAt(0) + "*" + pairStar(str.substring(1));
        else
            return str.charAt(0) + pairStar(str.substring(1));
    }

    public int countX(String str) {
        if (str.equals(""))
            return 0;
        if (str.charAt(0) == 'x')
            return 1 + countX(str.substring(1));
        else
            return countX(str.substring(1));
    }

    public int strCount(String str, String sub) {
        int strlen = str.length();
        int sublen = sub.length();
        if (strlen < sublen)
            return 0;
        if (str.substring(0,sublen).equals(sub))
            return 1 + strCount(str.substring(sublen), sub);
        else
            return strCount(str.substring(1), sub);
    }
    
}
