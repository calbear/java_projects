import java.io.*;
import java.util.Scanner;

/**
 *  Read the input file, find all the lines with comments, and write the comments to an output file. 
 *  The net result will be a file containing just the comment lines from the input file.
 * 
 * @author Ace Atienza 
 * @version 02/25/2012
 */
public class IO
{
    Scanner scan;
    String scannedText;
    PrintStream outputFile;
    
    public static void main(String[] args) throws IOException
    {
        Scanner scan = null;
        PrintStream outputFile = null;
        String scannedText = null;

        try {
            scan = new Scanner(new File("C:\\BlueJ\\AssignmentSolution.txt"));
            outputFile = new PrintStream("C:\\BlueJ\\AssignmentSolution_comments.txt");
            
            while (scan.hasNextLine())
            {
                String line = scan.nextLine();
                if (line.contains("//")) {
                    outputFile.println(line);
                }
            }
            
            scan.close();
            outputFile.close();
        } finally {
            if (scan != null) {
                scan.close();
                outputFile.close();
            }
        }
    }
}
