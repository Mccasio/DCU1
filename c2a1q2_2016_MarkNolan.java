import java.util.Scanner;

/**
 * Created by mark2 on 16/11/2016.
 */
public class c2a1q2_2016_MarkNolan {

    public static void main(String[] args) {
        int rowNum;
        int colNum;
        String row = "";                                                                                                // Initialises variables

        Scanner scanner = new Scanner(System.in);                                                                       // Sets up new scanner object as input
        Utils utilsQ2 = new Utils(scanner);                                                                             // Sets up object utilsQ2 as a scanner

        do {                                                                                                            // Initialises do while loop
            System.out.print("Please enter a number of rows between 3 and 10    :");                                    // Asks the user for a valid input
            rowNum = utilsQ2.numberReader(3,10);                                                                        // Calls the numberReader method from utils and sets lower and upper limits
        } while ( rowNum == -1);                                                                                        // Loops the program to loop until a valid input is given

        do {
            System.out.print("Please enter a number of columns between 5 and 10 :");                                    // Asks the user for a valid input
            colNum = utilsQ2.numberReader(5,10);                                                                        // Calls the numberReader method from utils and sets lower and upper limits
        }while(colNum == -1);                                                                                           // Loops the program to loop until a valid input is given

        for (int i = 0; i < rowNum; i++) {                                                                              // Initialises the for loop for rows
            for (int j = 0; j < colNum; j++) {                                                                          // Initialises the for loop for Columns
                row = (row + "   " + String.format("%3d", (i + 1) * (j + 1)));                                          // Calculates the value of each element in the array and adds to a row string
            }
            System.out.println(row);                                                                                    // Prints the row string and starts a new line
            row = "";                                                                                                   // Resets the row string to a blank
        }
    }

}
