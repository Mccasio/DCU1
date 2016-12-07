import java.util.Scanner;

/**
 * Created by mark2 on 16/11/2016.
 */
public class c2a1q3_2016_MarkNolan {

    public static final int[] moneyVals = {5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

    public static void main(String[] args) {
        int moneyDue;
        int moneyIn;
        int changeOut = 0;
        String strOut;
        int[] moneyValsOut = new int[12];                                                                               //initializing  variables

        Scanner scanner = new Scanner(System.in);                                                                       // Sets up new scanner object as input
        Utils utilsQ3 = new Utils(scanner);                                                                             // Sets up object utilsQ3 as a scanner

        do {                                                                                                            // Initialises do while loop
            System.out.print("Please enter an amount of money due (in cents between 1 and 99,999,999) : ");             // Asks the user for a valid input
            moneyDue = utilsQ3.numberReader(1, 100 * 1000 * 1000 - 1);                                                  // Calls the numberReader method from utils and sets lower and upper limits
        } while (moneyDue == -1);

        do {                                                                                                            // Initialises do while loop
            System.out.print("Please enter an amount of money paid (in cents between 1 and 100,000,000) : ");           // Asks the user for a valid input
            moneyIn = utilsQ3.numberReader(1,  100 * 1000 * 1000);                                                      // Calls the numberReader method from utils and sets lower and upper limits
            if (moneyIn < moneyDue) {                                                                                   // Checks if money paid is less than the money due
                System.out.println("You have paid too little!");                                                        // If the money paid is less than the money due display error message
            } else {
                changeOut = moneyIn - moneyDue;                                                                         // If the money paid is greater than than the money due calculate total change
                System.out.println("total change = €" + String.format("%6.2f", changeOut/100.0));                       // Print the change due in euros
            }
        } while (moneyDue == -1 || moneyIn < moneyDue);                                                                 // Loops the program to loop until a valid input is given

        for (int i = 0; i < moneyVals.length; i++) {                                                                    // For each element of the money values array
            moneyValsOut[i] = changeOut / moneyVals[i];                                                                 // Outputs the number of notes for that denomination
            changeOut = changeOut % moneyVals[i];                                                                       // Adjusts the change out to prepare for the next itteration of the loop
            String moneyVal = String.format("%6.2f", moneyVals[i]/100.0);                                               // Builds the moneyVal string and formats the string
            strOut = ("No. of €" + moneyVal + " = " + moneyValsOut[i]);                                                 // Builds the full line into a nicely formatted string "No. of € 50.00 = 0"
            System.out.println(strOut);                                                                                 // Outputs the string to a new line
        }
    }
}
