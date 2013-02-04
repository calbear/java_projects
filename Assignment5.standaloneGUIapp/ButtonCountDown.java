
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * GUI program that will use a button to count down from five to zero. 
 * When it reaches zero, it should display a label indicating the end of the count. 
 * Each click should decrease the number by one. For example, when the program 
 * starts the button will say "Five" or "5." After the first click, it will say 
 * "Four" or "4," and so on. When it gets to zero, the button should be replaced 
 * by a label with a message in it. The text in the label can say anything you like. 
 * 
 * @author Ace Atienza
 * @version 03/03/2012
 */
public class ButtonCountDown implements ActionListener
{
    private JFrame frame;
    private JButton button;
    private Container contentPane;
    private JLabel label;
    int countdown;

    public static void main (String[] args) 
    {
        ButtonCountDown buttoncount = new ButtonCountDown();
        buttoncount.start();
    }

    public void start() 
    {
        countdown = 5;  // initialize countdown from 5
        label = new JLabel("Enough clicks, you're at 0");
        
        frame = new JFrame("Countdown Buttom");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = frame.getContentPane();

        button = new JButton("Click Me to countdown from 5");
        button.addActionListener(this);
        contentPane.add(button);
        
        frame.pack();
        frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        countdown--;
        
        if(countdown > 0) {
            button.setText(Integer.toString(countdown));
        }
        else {
            // button.setText("Enough clicks, you're at 0");
            button.setVisible(false);
            label = new JLabel("Enough clicks, you're at 0");
            contentPane.add(label);     // !!! this is causing a "Exception in thread "AWT-EventQueue-0" java.lang.NullPointerException"

        }
    }
}
