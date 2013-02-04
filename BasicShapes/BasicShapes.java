import java.awt.*;
import javax.swing.*;
public class BasicShapes extends JApplet
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
        g.fillRect(0, 0, getWidth(), getHeight());
        
        g.setColor(Color.yellow);                   // body
        g.fillArc(100, 100, 100, 100, 45, 275);
        g.setColor(Color.black);                    // eyes
        g.fillOval(135, 120, 12, 12);
        
        g.setColor(Color.red);                      // head
        g.fillArc(250, 100, 80, 80, 0, 180);
        
        g.fillRect(250, 140, 80, 60);               // body
        
        int [] xList = new int [3] ;
        int [] yList = new int [3] ;
        int pointCount = 3;
        xList [0] = 250;
        xList [1] = 260;
        xList [2] = 270;
        yList [0] = 200;
        yList [1] = 180;
        yList [2] = 200;
        g.setColor(Color.white);                    // draw skirt
        g.fillPolygon(xList, yList, pointCount);
        
        g.fillRect(280, 180, 20, 20);

        xList [0] = 310;
        xList [1] = 320;
        xList [2] = 330;
        yList [0] = 200;
        yList [1] = 180;
        yList [2] = 200;
        g.setColor(Color.white);                    // draw skirt
        g.fillPolygon(xList, yList, pointCount);
        
        g.setColor(Color.white);
        g.fillRect(270, 120, 15, 15);
        g.setColor(Color.white);
        g.fillRect(300, 120, 15, 15);   
        
        g.setColor(Color.white);
        g.drawArc(255, 155, 22, 16, 0, 180);
        g.setColor(Color.white);
        g.drawArc(277, 155, 22, 16, 0, 180);
        g.setColor(Color.white);
        g.drawArc(299, 155, 22, 16, 0, -180);        

        g.setColor(Color.white);
        g.drawArc(255, 156, 22, 16, 0, 180);
        g.setColor(Color.white);
        g.drawArc(277, 156, 22, 16, 0, 180);
        g.setColor(Color.white);
        g.drawArc(299, 156, 22, 16, 0, -180);    
    }
}