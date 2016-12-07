import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by mark2 on 10/10/2016.
 */

public class Utils {

    Scanner scanner;
    public Utils(Scanner scanner) {
        this.scanner = scanner;                                                                                         // Instantiate the scanner
    }

    public int numberReader(int lowLim, int upLim) {
        try {
            Integer numIn = scanner.nextInt();                                                                          // Listens for an input

            if (numIn >= lowLim && numIn <= upLim) {                                                                    // Outputs the desired value
                return numIn;                                                                                           // Returns numIn value
            } else {                                                                                                    // Otherwise
                System.out.println("Invalid input!");                                                                   // alerts the user that the input is not valid
                return -1;                                                                                              // Sets numIn to -1 (to allow the program to loop again)
            }
        } catch (InputMismatchException e) {                                                                            // Triggers ife a non integer value is entered
            System.out.println("Invalid input!");                                                                       // Alerts the user that the input is not valid
            scanner.nextLine();                                                                                         // Clears the scanner
            return -1;                                                                                                  // Sets numIn to -1 (to allow the program to loop again)
        }
    }

    public static void prime(int primNum) {

        for (int i = 2; i < primNum; i++) {                                                                             // Loops through all

            boolean isPrimeNumber = true;                                                                               // Sets prime number check flag

            for (int j = 2; j < i; j++) {                                                                               // check to see if the number is prime
                if (i % j == 0) {                                                                                       // If number is not prime (
                    isPrimeNumber = false;                                                                              // Sets the Prime number flag
                    break;                                                                                              // exit the inner for loop
                }
            }
            // print the number if prime
            if (isPrimeNumber) {                                                                                        //If primeNumber flag is not set to False the number is printed wit a comma separator
                System.out.print(i + ", ");
            }
        }
    }

    public static void even(int numIn) {
        for (int i = 1; i < numIn; i++) {                                                                               // Loops through all of the numbers from 0 to numIn
            if (i % 2 == 1) {                                                                                           // Do if the Number is even
                System.out.print(i + ", ");                                                                             // Print the number
            }
        }
    }


    public static void odd(int numIn) {
        for(int i = 1; i < numIn ; i++) {                                                                               // Loops through all of the numbers from 0 to numIn
            if (i % 2 == 0) {                                                                                           // Do if the Number is even
                System.out.print(i + ", ");                                                                             // Print the number
            }
        }
    }

}


