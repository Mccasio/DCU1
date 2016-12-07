import java.util.Scanner;

/**
 * Created by mark2 on 16/11/2016.
 */
public class c2a1q1_2016_MarkNolan {

    public static void main(String[] args) {                                                                            // Main program start
        int numIn;

        Scanner scanner = new Scanner(System.in);                                                                       // Sets up new scanner object as input
        Utils utilsQ1 = new Utils(scanner);                                                                             // Sets up object utilsQ1 as a scanner

        do {                                                                                                            // Initialises do while loop
            System.out.print("Please enter a number between 1000 and 100,000,000 : ");                                  // Asks the user for a valid input
            numIn = utilsQ1.numberReader(1000,100*1000*1000);                                                           // Calls the numberReader method from utils and sets lower and upper limits
        } while ( numIn == -1 );                                                                                        // Loops the program to loop until a valid input is given

        String strOut = String.format("%,d", numIn);                                                                    // Converts numIn to a string in decimal format (adds commas for thousands)
        System.out.println(strOut);                                                                                     // Prints the formatted string
    }

}
