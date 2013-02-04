import java.util.Scanner;

/**
 * Sets up a loop and keeps requesting input until the user enters an asterisk (*). Each line entered that has data should contain a floating-point number.
 * Input ends with an asterisk then displays three items: a count of the number of entries, the total of all the numbers, and the average of all the numbers.
 * 
 * @author Ace Atienza
 * @version 02/25/2012
 */
public class simpleIO
{
    // Run the program
    public static void main(String[] args) {
        int numOfEntries = 0;
        double entry = 0;
        double totalOfEntries = 0;
        double avgOfEntries = 0;
        
        Scanner input = new Scanner(System.in);
        boolean finished = false;

        while (!finished) {
            System.out.println ("Please enter a number.  Type * to exit.");
            
            if (input.hasNextDouble()) {
                entry = input.nextDouble();
                totalOfEntries += entry;
                numOfEntries++;
            }
            else if (input.next().contains("*")){
                finished = true;
            }
            else {
                System.out.println(" Please enter a number or a *");
            }            
        }
        
        System.out.println("Number of entries: " + numOfEntries);
        System.out.println("Total of entries: " + totalOfEntries);
        System.out.println("Average of entries: " + avgOfEntries);
    }
    
}
