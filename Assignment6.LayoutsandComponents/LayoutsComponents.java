import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Gui components and layouts
 * 
 * @Author Ace Atienza
 * @Version 03/04/2012
 */

public class LayoutsComponents implements ActionListener
{
    private JFrame frame;
    private JPanel westpanel, eastpanel;
    private JLabel label;
    private JButton buttonwrap, buttonDoNotWrap, buttonBlank, buttonClearText, 
                    buttonScrollV, buttonScrollH, buttonScrollBothWays, buttonDoNotScroll;
    private JTextArea textArea;
    private JScrollPane scrollArea;

    public static void main (String[] args)
    {
        LayoutsComponents guiLayout = new LayoutsComponents();
        guiLayout.start();
    }

    public void start()
    {
        frame = new JFrame("Multiple Components");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new BorderLayout());

        // Label for instructions
        label = new JLabel("Use the buttons to control the layout of text");
        contentPane.add(label, BorderLayout.NORTH);

        // West panel
        westpanel = new JPanel();
        westpanel.setLayout(new BoxLayout(westpanel,BoxLayout.Y_AXIS));

        buttonwrap = new JButton("Wrap Text       ");
        buttonwrap.addActionListener(this);
        westpanel.add(buttonwrap);
        buttonDoNotWrap = new JButton("Do Not Wrap Text");
        buttonDoNotWrap.addActionListener(this);
        westpanel.add(buttonDoNotWrap);
        buttonBlank = new JButton("                ");
        buttonBlank.addActionListener(this);
        westpanel.add(buttonBlank);
        buttonClearText = new JButton("Clear Text     ");
        buttonClearText.addActionListener(this);
        westpanel.add(buttonClearText);
        contentPane.add(westpanel, BorderLayout.WEST);

        // Text area
        textArea = new JTextArea(10,25);
        scrollArea = new JScrollPane(textArea);
        contentPane.add(scrollArea, BorderLayout.CENTER);
        
        // East panel to control scroll bars
        eastpanel = new JPanel();
        eastpanel.setLayout(new BoxLayout(eastpanel,BoxLayout.Y_AXIS));

        buttonScrollV = new JButton("Scroll Vertically");
        buttonScrollV.addActionListener(this);
        eastpanel.add(buttonScrollV);
        buttonScrollH = new JButton("Scroll Horizontally");
        buttonScrollH.addActionListener(this);
        eastpanel.add(buttonScrollH);
        buttonScrollBothWays = new JButton("Scroll Both Ways");
        buttonScrollBothWays.addActionListener(this);
        eastpanel.add(buttonScrollBothWays);
        buttonDoNotScroll = new JButton("Do Not Scroll");
        buttonDoNotScroll.addActionListener(this);
        eastpanel.add(buttonDoNotScroll);
        contentPane.add(eastpanel, BorderLayout.EAST);

        frame.pack();
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == buttonwrap) {
            textArea.append("Wrap Text. \n");
            setWrapText();
        }            
        else if (e.getSource() == buttonDoNotWrap) {
            textArea.append("Do not wrap text.\n");
            setDoNotWrapText();
        }
        else if (e.getSource() == buttonBlank)
            textArea.append("Nothing to see here.\n");
        else if (e.getSource() == buttonClearText) {
            textArea.append("Clear text.\n");
            setClearText();
        }
        else if (e.getSource() == buttonScrollV) {
            textArea.append("Scrolling vertically.\n");
            setScrollVertical();
        }
        else if (e.getSource() == buttonScrollH) {
            textArea.append("Scrolling horizontally.\n");
            setScrollHorizontal();
        }
        else if (e.getSource() == buttonScrollBothWays) {
            textArea.append("Scroll both ways.\n");
            setScrollBothWays();
        }
        else if (e.getSource() == buttonDoNotScroll) {
            textArea.append("No scrolling allowed.\n");
            setDoNotScroll();
        }
        else
            textArea.append("Should not get here!\n");
    }
    
    private void setWrapText() {
        textArea.setLineWrap(true);
    }

    private void setDoNotWrapText() {
        textArea.setLineWrap(false);
    }

    private void setClearText() {
        textArea.setText("");
    }

    private void setScrollVertical() {
       scrollArea.setVerticalScrollBarPolicy(
            ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
       scrollArea.setHorizontalScrollBarPolicy(
            ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    }
    
    private void setScrollHorizontal() {
       scrollArea.setVerticalScrollBarPolicy(
            ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
       scrollArea.setHorizontalScrollBarPolicy(
            ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
    }
    
    private void setScrollBothWays() {
       scrollArea.setVerticalScrollBarPolicy(
            ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
       scrollArea.setHorizontalScrollBarPolicy(
            ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
    }
    
    private void setDoNotScroll() {
       scrollArea.setVerticalScrollBarPolicy(
            ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
       scrollArea.setHorizontalScrollBarPolicy(
            ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    }
}