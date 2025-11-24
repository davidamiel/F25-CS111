import java.util.ArrayList;
public class StudentRoster {

    /* 
     *  1. Create an ArrayList that stores student names (Strings).
     *  2. Add 5 students to the list
     *  3. Insert a new student at index 2
     *  4. Remove the first student
     *  5. Check if "Alice" is in the roster
     *  6. Find the index of "Bob" in the roster
     *  7. Replace the third student with "Transfer Student"
     *  8. Print the size of the roster
     */

    public static void main(String[] args) {

        // #1
        ArrayList<String> roster = new ArrayList<String>(3);
        System.out.println("roster = " + roster.toString());

        // #2
        roster.add("David Amiel");
        roster.add("Joe Joe");
        roster.add("Bob Amiel");
        roster.add("Rachel Ray");
        roster.add("Paula Deen");
        System.out.println("roster = " + roster.toString());

        // #3
        roster.add(2, "Taylor Swift");
        System.out.println("roster = " + roster.toString());

        // #4
        roster.remove(0);
        System.out.println("roster = " + roster.toString());

        // #5
        boolean aliceIsHere = roster.indexOf("Alice") != -1;
        System.out.println("Is Alice here? " + aliceIsHere);
        System.out.println("roster = " + roster.toString());

        // #6
        int bobsIndex = roster.indexOf("Bob Amiel");
        System.out.println("Bob's Index = " + bobsIndex);
        System.out.println("roster = " + roster.toString());

        // #7
        roster.set(2, "Transfer Student");
        // could also do: String replaced = roster.set(2, "Transfer Student");
        System.out.println("roster = " + roster.toString());

        // #8
        int size = roster.size();
        System.out.println("roster size = " + size);
        System.out.println("roster = " + roster.toString());
    }
}