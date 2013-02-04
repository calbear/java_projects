import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Zuul - simple text based game
 * 
 * @author Ace Atienza
 * @version 03/13/2012
 */
public class ZuulGUI
{
    // window frame
    private JFrame frame;   
    private JPanel contentPane;
    
    private ButtonGroup exitButtonGroup;
    private JRadioButton northButton;
    private JRadioButton southButton;
    private JRadioButton eastButton;
    private JRadioButton westButton;
    
    private JTextField notesText;
    
    public static void main (String[] args) 
    {
        ZuulGUI gui = new ZuulGUI();
        gui.start();
    }    
    
    public void start() 
    {
        frame = new JFrame("Zuul Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setPreferredSize(new Dimension(600,600));
        
        makeMenus();        
        makeContent();
        frame.pack();
        frame.setVisible(true);
    }
    
    private void makeMenus()
    {
        JMenuBar menuBar;
        
        menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);
        
        // set up menus
        menuBar.add(makeFileMenu());
        menuBar.add(makeHelpMenu());
    }
    
    private JMenu makeFileMenu()
    {
        JMenu menu;
        JMenuItem menuItem;        // set up the File menu
        menu = new JMenu("File");
        menu.setMnemonic(KeyEvent.VK_F);
        
        // add New menu item
        menuItem = new JMenuItem("New Game");
        menuItem.setMnemonic(KeyEvent.VK_N);
        menuItem.addActionListener(new NewListener());
        menuItem.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_N,
                                       Event.CTRL_MASK));
        menu.add(menuItem);
          
        // add Save menu item
        menuItem = new JMenuItem("Save Game");
        menuItem.setMnemonic(KeyEvent.VK_S);
        menuItem.addActionListener(new SaveListener());
        menuItem.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_S,
                                       Event.CTRL_MASK));
        menu.add(menuItem);        // add Exit menu item
        menu.addSeparator();
        menuItem = new JMenuItem("Exit");
        menuItem.setMnemonic(KeyEvent.VK_X);
        menuItem.addActionListener(new ExitListener());
        menuItem.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_Q,
                                       Event.CTRL_MASK));
        menu.add(menuItem);
          
        return menu;
    }    
    
    private JMenu makeHelpMenu()
    {
        JMenu menu;
        JMenuItem menuItem;        // set up the Help menu
        menu = new JMenu("Help");
        menu.setMnemonic(KeyEvent.VK_H);
        
        // add About menu item
        menuItem = new JMenuItem("About Zuul");
        menuItem.setMnemonic(KeyEvent.VK_A);
        menuItem.addActionListener(new AboutListener());
        menu.add(menuItem);
          
        return menu;
    }
    
    private void makeContent()
    {
        contentPane = (JPanel)frame.getContentPane();
        contentPane.setLayout(new BorderLayout(6,6));
        
        makeNorthRegion();
        makeWestRegion();
        makeCenterRegion();
        makeEastRegion();
        makeSouthRegion();
    }
    
    private void makeNorthRegion()
    {
        JLabel imgLabel = new JLabel(new ImageIcon("stick.gif"), JLabel.CENTER);
        contentPane.add(imgLabel, BorderLayout.NORTH);
    }
    
    private void makeWestRegion()
    {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createTitledBorder("You are in..."));
        panel.setPreferredSize(new Dimension(150,100));
        contentPane.add(panel, BorderLayout.WEST);
    }
        
    private void makeCenterRegion()
    {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createTitledBorder("Items in this area"));
        //panel.setPreferredSize(new Dimension(150,0));
        contentPane.add(panel, BorderLayout.CENTER);
    }    

    private void makeEastRegion()
    {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createTitledBorder("Exits"));
        //panel.setPreferredSize(new Dimension(150,0));
        
        exitButtonGroup = new ButtonGroup();
        
        northButton = new JRadioButton("Go North", false);
        exitButtonGroup.add(northButton);
        panel.add(northButton);

        eastButton = new JRadioButton("Go East", false);
        exitButtonGroup.add(eastButton);
        panel.add(eastButton);
        
        southButton = new JRadioButton("Go South", false);
        exitButtonGroup.add(southButton);
        panel.add(southButton);
        
        westButton = new JRadioButton("Go West", false);
        exitButtonGroup.add(westButton);
        panel.add(westButton);
        
        contentPane.add(panel, BorderLayout.EAST);
    }

    private void makeSouthRegion()
    {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.X_AXIS));
        panel.setBorder(BorderFactory.createTitledBorder("Notes"));

        notesText = new JTextField("",2);
        panel.add(notesText);

        contentPane.add(panel, BorderLayout.SOUTH);
    }
    
    private class AboutListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            JOptionPane.showMessageDialog(frame, 
                    "", "", 
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private class ExitListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }
    
    private class NewListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            JOptionPane.showMessageDialog(frame, 
                    "The  File > New  was clicked", "", 
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private class SaveListener implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            JOptionPane.showMessageDialog(frame, 
                    "The  File > Save  was clicked", "", 
                    JOptionPane.INFORMATION_MESSAGE);
                            
        }
    }    
}