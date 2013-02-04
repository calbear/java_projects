    import java.awt.*;
    import javax.swing.*;

    public class ImageDisplay extends JApplet
    {
        Image img;

        public void init()
        {
            JRootPane rootPane = this.getRootPane();
            rootPane.putClientProperty("defeatSystemEventQueueCheck",
                Boolean.TRUE);
            img = getImage(getDocumentBase(), "ImageDisplay.jpg");
        }

        public void paint(Graphics g)
        {
        Color bloodRed = new Color(255, 10, 10);
        g.setColor(bloodRed);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.drawImage(img, 10, 10, this);

        Font myFont = new Font("Arial", Font.ITALIC, 48);
        g.setFont(myFont);
        g.setColor(Color.white);
        g.drawString("Hot or Not?", 10, 425);

        }
    }