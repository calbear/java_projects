import java.util.Scanner;

/**
 * Areaoftriangle calculates area of a triangle.
 * 
 * @author Ace Atienza
 * @version 2.0
 */
public class Areaoftriangle
{
    // area of triangle
    private double l;
    private double h;
    private double b;  //area

       
    /**
     * main method asks for length & width, calculates area and presents to user
     * 
     *    b = (l + h) / 2
     *   
     */
    public static void main(String[] args)
    {
        double inputL;
        double inputH;

        Scanner keyInput = new Scanner(System.in);
        
        System.out.print("What is the Length? ");
        inputL = keyInput.nextDouble();
        
        
            
        System.out.print("What is the Height? ");
        inputH = keyInput.nextDouble();
        Areaoftriangle a = new Areaoftriangle(inputL, inputH);
        
        double b = (inputL + inputH) / 2;
        
        System.out.println("The area of the triangle is " + b);
        
        if (b > 10)
        {
            System.out.println("That's a huge triangle!");
        }
        else if (b <= 10)
        {
            System.out.println("That's a tiny triangle!");
        }
        
    }

    /**
     * Constructor for objects of class Areaoftriangle
     */
    public Areaoftriangle(double inputL, double inputH)
    {
        // initialise area
        l = inputL;
        h = inputH;
    }
}

