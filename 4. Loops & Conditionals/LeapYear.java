public class LeapYear {
     public static void main(String args[]) {

        /* Our class code to read an input from the command line and determine if it is a leap year.
        * See slides for instructions and info on leap years!!!
        * This was attempt #1 - using if statements
        * We talked about the order of if statements
        * and making sure we use else to prevent multiple conditions from being activated.
        * 
        * We also saw "if else" - which is not new to us, but an easier way to do multiple layers
        * of nested if statements (with many potential conditions) because java ignores whitespaces!
        *  ---- it does what we expect, but we don't need tons of layers of indentation/{}'s
        */

        int year = Integer.parseInt(args[0]);

        if (year % 400 == 0) {
            System.out.println("Leap Year!");
        } else if (year % 4 == 0 && !(year % 100 == 0)) {
            System.out.println("Leap Year!");
        } else {
            System.out.println("No Leap :(");
        }

        // This code came right from the slides/book (it's not mine)!
        // We also rewrote our leapyear code to not use if statements. 
        // Interesting how when we can print boolean values directly, we can circumvent needing IF in some cases!

        // Look at HeadsOrTails1 and HeadsOrTails2 first -- there, we also wrote code first with if statements, then again without them
        // --- in both cases, printing booleans was our "trick" to avoid needing ifs!
        boolean isLeapYear;
        // divisible by 4 but not 100
        isLeapYear = (year % 4 == 0) && (year % 100 != 0);
        // or divisible by 400
        isLeapYear = isLeapYear || (year % 400 == 0);
        System.out.println(isLeapYear);

     }
}
