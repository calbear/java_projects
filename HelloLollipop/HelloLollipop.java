
import java.awt.*;
import javax.swing.*;

/**
 * Class HelloLollipop - write a description of the class here
 * 
 * @author Ace Atienza 
 * @version 1.0
 */

public class HelloLollipop extends JApplet
{
    public void init()
    {
        JRootPane rootPane = this.getRootPane();
        rootPane.putClientProperty("defeatSystemEventQueueCheck", 
            Boolean.TRUE);
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.white);
        g.fillRect(0,0,getWidth(),getHeight());
        g.setColor(Color.blue);
        g.drawString("Hello, Lollipop!", 120, 50);  // It's a lollipop
        g.setColor(Color.black);                    // Draw stick
        g.fillRect(90, 20, 10, 50);
        g.setColor(Color.red);                      // Draw candy
        g.fillOval(80, 10, 30, 30);
        
    }
}
