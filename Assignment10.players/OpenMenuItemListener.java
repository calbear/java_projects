public class OpenMenuItemListener implements ActionListener
{
    public void actionPerformed(ActionEvent ae)
    {
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(frame);
        File playerFile = fc.getSelectedFile();
        if (playerFile == null)
            return;
        list = new ArrayList<Player>();
        try
        {
            Scanner scan = new Scanner(playerFile);
            while (scan.hasNext())
            {
                String name = scan.next() + " " + scan.next();
                int nbr = scan.nextInt();
                char position = scan.next().charAt(0);
                double avgPoints = scan.nextDouble();
                double avgRebounds = scan.nextDouble();
                double avgAssists = scan.nextDouble();
                list.add(new Player(name, nbr, position, avgPoints, avgRebounds, avgAssists));
            }
                
            scan.close();
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(frame, 
                    "I/O error in file\n\n     " +
                            playerFile.getName() +
                            "\n\nThis program will close", 
                    "I/O Error", 
                    JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
            
        Collections.sort(list);
            
        lit = list.listIterator();
        isForward = true;
        if (lit.hasNext())
        {
            Player p = lit.next();
            getPlayer(p);
        }

        for (Player p : list)
        {
            textArea.setText(textArea.getText() + p.toString() + "\n\n");
        }
    }
}