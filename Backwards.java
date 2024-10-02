// Backwards.java
//
// Uses a recursive method to print a string backwards.
// ************************************************************
import java.util.Scanner;

public class Backwards {
    // -------------------------------------------------------
    // Reads a string from the user and prints it backwards.
    // -------------------------------------------------------
    public static void main(String[] args) {
        //initializations
        String msg;
        Scanner scan = new Scanner(System.in);
        //user input
        System.out.print("Enter a string: ");
        msg = scan.nextLine();
        //backwards string
        System.out.println("\nThe string backwards: ");
        printBackwards(msg);

    }

    // -------------------------------------------------------
    // Takes a string and recursively prints it backwards.
    // -------------------------------------------------------
    public static void printBackwards(String s) {
        System.out.print(s.charAt(s.length() - 1));
        if (s.length() > 0 ) { //stops recursion when string is finished
            printBackwards(s.substring(0, (s.length() - 1)));
        }
    }
}