import java.util.Arrays;

public class WarmUp {
    public static void main(String[] args) {

        char[] ans = {'c', 'o', 'd', 'e', 'r'};

        char[] guess = {'a', 'd', 'i', 'e', 'u'};

        String[] display = new String[5];

        // This line was missing in class!!
        Arrays.fill(display, "⬛");

        for (int i = 0; i < ans.length; i++) {
            if (guess[i] == ans[i]) {
                display[i] = "🟩";
                continue;
            }

            for (int j = 0; j < ans.length; j++) {
                if (guess[i] == ans[j]) {
                    display[i] = "🟨";
                    break;
                }
            }            
        }

        for (String box : display) {
            System.out.print(box);
        }
    }
}