public class PracticeSetA {

    public String minCat(String a, String b) {
        if (a.length() == b.length())
            return a+b;
        if (a.length() > b.length()) {
            int diff = a.length() - b.length();
            return a.substring(diff, a.length()) + b;
        } else {
            int diff = b.length() - a.length();
            return a + b.substring(diff, b.length());
        }
    }
    
    public String withoutX(String str) {
        if (str.length() == 0)
            return str;
        if (str.length() == 1) {
            if (str.charAt(0) == 'x')
                return "";
            else
                return str;
        }
        
        if (str.charAt(0) == 'x')
            str = str.substring(1,str.length());

        if (str.charAt(str.length()-1) == 'x')
            str = str.substring(0,str.length()-1);
        
        return str;
    }
    
    public String doubleChar(String str) {
        int len = str.length();
        String new_str = "";
        for (int i = 0; i < len; i++) {
            new_str += str.substring(i,i+1) + str.substring(i, i+1);
        }
        return new_str;
    }

    public String repeatEnd(String str, int n) {
        int len = str.length();
        String pieceToRepeat = str.substring(len - n, len);

        String result = "";
        for(int i = 1; i <= n; i++) {
            result += pieceToRepeat;
        }
        
        return result;
    }



    
}
