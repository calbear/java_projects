// Animated applet that looks like one of those irritating advertisements or like a screen saver with moving text.

    import java.awt.*;
    import javax.swing.*;

    public class Sunset extends JApplet implements Runnable
    {
        Thread animator;
        int yPosition;

        public void init()
        {
            JRootPane rootPane = this.getRootPane();
            rootPane.putClientProperty("defeatSystemEventQueueCheck",
                Boolean.TRUE);
        }

        public void start()
        {
            yPosition = 50;
            animator = new Thread(this);
            animator.start();
        }

        public void paint(Graphics g)
        {
            g.setColor(Color.white);
            g.fillRect(0, 0, getWidth(), getHeight());
            g.setColor(Color.red);
            g.fillRect(100, 200, 150, 150);
            int [] xList = new int [3] ;
            int [] yList = new int [3] ;
            int pointCount = 3;
            xList [0] = 75;
            xList [1] = 175;
            xList [2] = 275;
            yList [0] = 200;
            yList [1] = 125;
            yList [2] = 200;
            g.setColor(Color.green);
            g.fillPolygon(xList, yList, pointCount);
            g.setColor(Color.black);
            g.fillRect(120, 220, 35, 35);
            g.setColor(Color.blue);
            g.fillRect(175, 275, 50, 75);
            g.setColor(Color.yellow);
            g.fillOval(275, yPosition, 75, 75);
            g.fillOval(180, 310, 5, 5);
        }

        public void run()
        {
            Boolean sunset = false;
            
            while (Thread.currentThread() == animator)
            {
                repaint();
                
                if (sunset == false)
                {
                    yPosition = yPosition + 1;
                    
                    if (yPosition == 350) {  // sun has set
                        sunset = true;
                    }
                }
                else
                {
                    yPosition = yPosition - 1;
                    if (yPosition == 50) {
                        sunset = false;
                    }
                }


                try
                {
                    Thread.sleep(10);
                }
                catch (InterruptedException e)
                {
                    break;
                }
            }
        }

        public void stop()
        {
            animator = null;
        }
    }