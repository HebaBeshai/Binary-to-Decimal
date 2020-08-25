/***********************************************************************************************************************
 * @file   Binary2Decimal.java
 * @brief  Have the user enter any binary number and use the operator remainder to convert it to decimal.
 * @author Heba Beshai
 * @date   January 29, 2016
 **********************************************************************************************************************/
package Binary2Decimal;
import java.util.Scanner;
public class Binary2Decimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define Variables to be Used in this program
            int n1, n2, n3, n4, n5, n6;
            int binNum, decNum;

        // Ask the user to enter the data needed by the program
            System.out.print("Please enter a 6 digit binary number: ");
            binNum = input.nextInt();

        // Do the needed calculations, use 1 or more variables to store your results
            n1 = binNum%10;
            binNum = binNum/10;
            n2 = binNum%10;
            binNum = binNum/10;
            n3 = binNum%10;
            binNum = binNum/10;
            n4 = binNum%10;
            binNum = binNum/10;
            n5 = binNum%10;
            binNum = binNum/10;
            n6 = binNum%10;
            binNum = binNum/10;

            decNum = ((1*n1) + (2*n2) + (4*n3) + (8*n4) + (16*n5) + (32*n6));
            System.out.println();

        // Print the results to the screen
            System.out.println("Your binary number is " +decNum+ " in decimal.");
    }


}
