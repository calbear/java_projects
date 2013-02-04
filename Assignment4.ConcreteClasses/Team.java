import java.util.*;

// Team Class using MyConcreteList 
public class Team 
{
    private MyConcreteList<Player> roster; // replace ArrayList with MyList

    /**
    * Constructor for Team
    */  
    public Team()    {
        roster = new MyConcreteList<Player>(); // create array for roster
    }

    public void addPlayer(Player player)    {
        roster.add(player); // add player to roster
    }

    public String toString() {
        return roster.toString();   // inherited from MyAbstractList
    }
   
    /* will produce foreach not extendable
    public String toFile()    {
        String fileRoster = ""; // output String
        
        /*
        for (Player p : roster)        {
            fileRoster = fileRoster + p.toFile() + "\n"; // add name to roster
        }
        */
        
       /*
        for (int i; i < roster.size(); i++) {
            fileRoster = fileRoster + player.toFile() + "\n"; // add name to roster
        }
        
        return fileRoster;                    // return roster
    }
    */
    
    
    /**
     * Main method to run
     */
    public static void main(String[] args) {
        
        // code here to start program
        
    }
}