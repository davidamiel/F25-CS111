import java.util.ArrayList;

public class PracticeProblems {

    // Problem 1, Solution A - with a for-each loop
    public static int numWordsOfLength(ArrayList<String> list, int len) {
        int count = 0;
        for (String word : list) {
            if (word.length() == len) {
                count++;
            }
        }
        return count;
    }

    // Problem 1, Solution B - with a for loop
    public static int numWordsOfLengthB(ArrayList<String> list, int len) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == len) {
                count++;
            }
        }
        return count;
    }

    // Problem 2, Solution - notice we loop backwards!!
    // What would happen if we loop forwards? What does remove do??
    public static void removeWordsOfLength(ArrayList<String> list, int len) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).length() == len) {
                list.remove(i);
            }
        }
    }

}
