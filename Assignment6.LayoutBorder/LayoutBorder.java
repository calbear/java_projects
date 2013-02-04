import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LayoutBorder implements ActionListener 
{
    private JFrame frame;
    private Container contentPane;
    private JButton button;  
    private boolean isX = true;  

    public static void main (String[] args) 
    {
        LayoutBorder guiLayout = new LayoutBorder();
        guiLayout.startBorderLayout();
    }

    public void startBorderLayout() 
    {
        frame = new JFrame("Border Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = frame.getContentPane();

        contentPane.setLayout(new BorderLayout());
            
        contentPane.add(new JButton("North Button"),
                        BorderLayout.NORTH);
        contentPane.add(new JButton("South Button"),
                        BorderLayout.SOUTH);
        contentPane.add(new JButton("East Button"),
                        BorderLayout.EAST);
        contentPane.add(new JButton("West Button"),
                        BorderLayout.WEST);
        contentPane.add(new JButton("Center Button"),
                        BorderLayout.CENTER);
                        
        frame.pack();
        frame.setVisible(true);
    }
    
    public void startBoxLayout() {
        frame = new JFrame("Border Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = frame.getContentPane();

        contentPane.setLayout(new BoxLayout(contentPane,BoxLayout.Y_AXIS));
            
        contentPane.add(new JButton("First Button"));
        contentPane.add(new JButton("Second Button - a long one"));
        contentPane.add(new JButton("Third Button"));
        contentPane.add(new JButton("Fourth Button"));
                        
        frame.pack();
        frame.setVisible(true);        
    }
    
    /**
     * Change layout to Flow Layout
     */
    public void setFlowLayout() {
        
        //frame = new JFrame("Flow Layout");
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = frame.getContentPane();
        
        contentPane.setLayout(new FlowLayout());
        
        /*
        contentPane.add(new JButton("First Button"));
        contentPane.add(new JButton("Second Button - a long one"));
        contentPane.add(new JButton("Third Button"));
        contentPane.add(new JButton("Fourth Button"));
        */
                        
        frame.pack();
        frame.setVisible(true);    
    }
    
    public void startGridLayout()  
    {  
        frame = new JFrame("Grid Layout");  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        contentPane = frame.getContentPane();  
        contentPane.setLayout(new GridLayout(3,3));  
        
        for (int i = 0; i < 9; i++)  
        {  
        button = new JButton("");  
        button.addActionListener(this);  
        contentPane.add(button);  
        }  
        
        frame.setSize(200,200);  
        frame.setVisible(true);  
    }  
     
    public void actionPerformed(ActionEvent e)  
    {  
        JButton b = (JButton)e.getSource();  
        if (b.getText()=="")  
        {  
        if (isX)  
           b.setText("X");  
        else  
           b.setText("O");  
        isX = !isX;  
        }  
    }  
}