import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Assignment 7
 * add at least two more menus to the window we have been working on. 
 * For example, you could add an Edit menu with Copy, Cut, Paste, Find, Replace 
 * or whatever other items you think are appropriate, and a Help menu with an About 
 * Experiment with menus, items, inner class listeners, mnemonics, and accelerators 
 * until you are comfortable designing and using them.
 * 
 * @author Ace Atienza
 * @version 03/11/2012
 */

public class GUIMenu2
{
    private JFrame frame;    
    
    public static void main (String[] args) 
    {
        GUIMenu2 gui = new GUIMenu2();
        gui.start();
    }    
    
    public void start() 
    {
        frame = new JFrame("GUI Menus");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane();
        
        makeMenus();        
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
    
    private void makeMenus()
    {
        JMenuBar menuBar;
        JMenu menu, editMenu, helpMenu;
        JMenuItem menuItem;
        
        menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);
        
        // set up the File menu
        menu = new JMenu("File");
        menu.setMnemonic(KeyEvent.VK_F);
        menuBar.add(menu);
        
        // add File menu items
        menuItem = new JMenuItem("New");
        menuItem.setMnemonic(KeyEvent.VK_N);
        menuItem.addActionListener(new newListener());
            menuItem.setAccelerator(
            KeyStroke.getKeyStroke(KeyEvent.VK_N,
               Event.CTRL_MASK));
        menu.add(menuItem);
        menuItem = new JMenuItem("Open...");
        menuItem.setMnemonic(KeyEvent.VK_O);
        menuItem.addActionListener(new openListener());
            menuItem.setAccelerator(
            KeyStroke.getKeyStroke(KeyEvent.VK_O,
               Event.CTRL_MASK));
        menu.add(menuItem);
        menuItem = new JMenuItem("Save");
        menuItem.setMnemonic(KeyEvent.VK_S);
        menuItem.addActionListener(new saveListener());
            menuItem.setAccelerator(
            KeyStroke.getKeyStroke(KeyEvent.VK_S,
               Event.CTRL_MASK));
            menu.add(menuItem);
        menuItem = new JMenuItem("Save As...");
        menuItem.setMnemonic(KeyEvent.VK_A);
        menuItem.setDisplayedMnemonicIndex(5);
        menuItem.addActionListener(new saveAsListener());
        menu.add(menuItem);
        menu.addSeparator();
        menuItem = new JMenuItem("Exit");
        menuItem.setMnemonic(KeyEvent.VK_X);
        menuItem.addActionListener(new exitListener());
            menuItem.setAccelerator(
            KeyStroke.getKeyStroke(KeyEvent.VK_Q,
               Event.CTRL_MASK));
        menu.add(menuItem);
        
        // set up Edit menu
        editMenu = new JMenu("Edit");
        editMenu.setMnemonic(KeyEvent.VK_F);
        menuBar.add(editMenu);
        
        // add Edit menu items
        menuItem = new JMenuItem("Cut");
        menuItem.setMnemonic(KeyEvent.VK_X);
        menuItem.addActionListener(new cutListener());  // create new cut Listener object
            menuItem.setAccelerator(
            KeyStroke.getKeyStroke(KeyEvent.VK_X,
               Event.CTRL_MASK));
        editMenu.add(menuItem);

        menuItem = new JMenuItem("Copy");
        menuItem.setMnemonic(KeyEvent.VK_C);
        menuItem.addActionListener(new copyListener());  // create new cut Listener object
            menuItem.setAccelerator(
            KeyStroke.getKeyStroke(KeyEvent.VK_C,
               Event.CTRL_MASK));
        editMenu.add(menuItem);
        
        menuItem = new JMenuItem("Paste");
        menuItem.setMnemonic(KeyEvent.VK_P);
        menuItem.addActionListener(new pasteListener());  // create new cut Listener object
            menuItem.setAccelerator(
            KeyStroke.getKeyStroke(KeyEvent.VK_P,
               Event.CTRL_MASK));
        editMenu.add(menuItem);
        
        // set up Help menu
        helpMenu = new JMenu("Help");
        helpMenu.setMnemonic(KeyEvent.VK_H);
        menuBar.add(helpMenu);
        
        // add Help menu items
        menuItem = new JMenuItem("Faq");
        menuItem.setMnemonic(KeyEvent.VK_H);
        menuItem.addActionListener(new faqListener());  // create new cut Listener object
            menuItem.setAccelerator(
            KeyStroke.getKeyStroke(KeyEvent.VK_H,
               Event.CTRL_MASK));
        helpMenu.add(menuItem);        
        
    }
    
    private class newListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
        JOptionPane.showMessageDialog(frame, 
        "The  File > New  menu option was clicked", 
        "Menu Item Click", 
        JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private class openListener implements ActionListener
    {
    public void actionPerformed(ActionEvent e)
    {
    JOptionPane.showMessageDialog(frame, 
    "The  File > Open...  menu option was clicked", 
    "Menu Item Click", 
    JOptionPane.INFORMATION_MESSAGE);
    }
    }
    
    private class saveListener implements ActionListener
    {
    public void actionPerformed(ActionEvent e)
    {
    JOptionPane.showMessageDialog(frame, 
    "The  File > Save  menu option was clicked", 
    "Menu Item Click", 
    JOptionPane.INFORMATION_MESSAGE);
    }
    }
    
    private class saveAsListener implements ActionListener
    {
    public void actionPerformed(ActionEvent e)
    {
    JOptionPane.showMessageDialog(frame, 
    "The  File > Save As...  menu option was clicked", 
    "Menu Item Click", 
    JOptionPane.INFORMATION_MESSAGE);
    }
    }
    
    private class exitListener implements ActionListener
    {
    public void actionPerformed(ActionEvent e)
    {
    System.exit(0);
    }
    }
    
    private class cutListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
        JOptionPane.showMessageDialog(frame, 
        "The  Edit > Cut  menu option was clicked", 
        "Menu Item Click", 
        JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private class copyListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
        JOptionPane.showMessageDialog(frame, 
        "The  Edit > Copy  menu option was clicked", 
        "Menu Item Click", 
        JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private class pasteListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
        JOptionPane.showMessageDialog(frame, 
        "The  Edit > Paste  menu option was clicked", 
        "Menu Item Click", 
        JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private class faqListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
        JOptionPane.showMessageDialog(frame, 
        "The  Help > Faq  menu option was clicked", 
        "Menu Item Click", 
        JOptionPane.INFORMATION_MESSAGE);
        }
    }
}