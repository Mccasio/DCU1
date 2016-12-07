import java.util.Scanner;

/**
 * Created by mark2 on 16/11/2016.
 */
public class c2a1q4_2016_MarkNolan {

    public static void main(String[] args) {
        int numIn;

        Scanner scanner = new Scanner(System.in);                                                                       // Sets up new scanner object as input
        Utils utilsQ4 = new Utils(scanner);                                                                             // Sets up object utilsQ4 as a scanner

        do {
            System.out.println("please enter a number between 1 and 100 : ");                                           // Prints a request for a numerical input between 1 and 100
            numIn = utilsQ4.numberReader(1,100);                                                                        // Reads numIn as the input for the scanner 'numberReader' contained in utils
        } while ( numIn == -1 );                                                                                        // Repeats until a valid input is received

        System.out.print("Even numbers are : ");                                                                        // Prints an indicator of the type of numerical output type
        Utils.odd(numIn);                                                                                               // Calls the odd number generator from utils and prints all the requested odd values

        System.out.println("");
        System.out.print("Odd numbers are : ");                                                                         // Prints an indicator of the type of numerical output type
        Utils.even(numIn);                                                                                              // Calls the even number generator from utils and prints all the requested even values

        System.out.println("");                                                                                         // Prints an indicator of the type of numerical output type
        System.out.print("Prime numbers are : ");                                                                       // Calls the prime number generator from utils and prints all the requested prime values
        Utils.prime(numIn);
    }

}
