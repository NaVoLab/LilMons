
package LilMonsMain;

import LilMonsMain.Mon; // Ensure the Mon class is imported if it exists in the same package or another package.

import java.util.ArrayList;

public class mainAntag extends MainData {
    public static void main(String[] args) {
        // Your main method logic here
        System.out.println("Welcome to Lil Mons!");
    }
    // Removed PlayerInventory class as it is now in its own file

        String p1 = "Default ";
        int level = 1;
        int hp = 100;
        int damage = 10;
       
        String string = "string";

        
    String MonStat; 
    Playerinfo player = new Playerinfo("Lil Blue", 1, 100, 10);
    Mon mon1 = new Mon("Future", 1, 150, 100); // Removed the extra String argument

    // Example usage of mon1 to avoid "never read" warning
    
    // Mon mon3 = new Mon("Kendrick",100, 160, 30, "HipHop");

        
        //inventory.addMonStat(item1);
        //inventory.addMonStat(item2);
        ArrayList<Playerinfo> players = new ArrayList<>();{
        players.add(player);

        // Initialize inventory object
       
      

        //System.out.println(p1 + "Player Stats\n");
        //System.out.println("Player Level: " + level);
        //System.out.println("Player Health: " + hp);
        //System.out.println("Player Damage: " + damage + "\n");
      

      
        
       String name = "Player"; // Define a name variable
       System.out.println("Hey " + name + " Welcome to Lil Mons pick your first Mon");
    
        }
}


