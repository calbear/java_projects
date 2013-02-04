import java.util.Scanner;

/**
 * TopSales figures out which day of the week is the best day for a business.
 *
 * @author Ace Atienza
 * @version 02/25/2012
 */
public class TopSales
{
    Scanner input;
    double[] dailySales;
    String[] dayOfWeek;
    int topsalesday;
    double topsale;

    /**
     * Constructor for TopSales
     */
    public TopSales() {
        input = new Scanner(System.in);     // Scanner object
        dailySales = new double[]{0, 0, 0, 0, 0, 0, 0}; // Array to hold each day's sales
        dayOfWeek = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        topsalesday = 0;
        topsale = 0.0;
    }

    public void getInput() {
        int index = 0;
        Double inputSales = 0.0;
        System.out.println("Enter a day of the week (Su,Mo,Tu,We,Th,Fr,Sa) or Q to quit: ");
        
        String inputString = input.next().trim().toUpperCase(); // trim user input and change all to uppercase
        
        // figure out where to put in the array
        while (!inputString.equals("Q")) {
            if (inputString.equals("SU")) {
                index = 0;
                System.out.println("Enter sales: ");
                inputSales = input.nextDouble();
                dailySales[index] = inputSales;             
            }
            else if (inputString.equals("MO")) {
                index = 1;
                System.out.println("Enter sales: ");
                inputSales = input.nextDouble();
                dailySales[index] = inputSales;
            }
            else if (inputString.equals("TU")) {
                index = 2;
                System.out.println("Enter sales: ");
                inputSales = input.nextDouble();
                dailySales[index] = inputSales;
            }
            else if (inputString.equals("WE")) {
                index = 3;
                System.out.println("Enter sales: ");
                inputSales = input.nextDouble();
                dailySales[index] = inputSales;
            }
            else if (inputString.equals("TH")) {
                index = 4;
                System.out.println("Enter sales: ");
                inputSales = input.nextDouble();
                dailySales[index] = inputSales;
            }
            else if (inputString.equals("FR")) {
                index = 5;
                System.out.println("Enter sales: ");
                inputSales = input.nextDouble();
                dailySales[index] = inputSales;
            }
            else if (inputString.equals("SA")) {
                index = 6;
                System.out.println("Enter sales: ");
                inputSales = input.nextDouble();
                dailySales[index] = inputSales;
            }
            else {
                System.out.println("Invalid day.  Try again.");
            }
            
            // Check sale to see if it's highest among sales
            for (int i = 0; i < 7; i++) {
                if (inputSales > dailySales[i]) {
                    topsale = inputSales;
                    topsalesday = index;
                }
            }
        
            // check again for next input
            System.out.println("Enter a day of the week (Su,Mo,Tu,We,Th,Fr,Sa) or Q to quit: ");
            inputString = input.next().trim().toUpperCase(); // trim user input and change all to uppercase
        }
       
    }
        
        
    public void topDayofWeek() {
        for (int i = 0; i < 7; i++) {
            System.out.println("Sales for " + dayOfWeek[i] + " were " + dailySales[i] + ".");
        }
        
        System.out.println("Top sales day was " + dayOfWeek[topsalesday] + " with a sale of: $" + topsale);
    }
            
    /**
     * Main method to run the class
     */
    public static void main(String[] args) {
        TopSales topsales = new TopSales();
        topsales.getInput();           // run the program
        topsales.topDayofWeek();    // display sales for each day and the top day of week
    }
}
