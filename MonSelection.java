package LilMonsMain;


import LilMonsMain.Mon; // Ensure the Mon class is imported

import static LilMonsMain.ChooseMon.mon1;
import static LilMonsMain.ChooseMon.mon2;
import static LilMonsMain.ChooseMon.mon3;
import static LilMonsMain.ChooseMon.monsave;
import static LilMonsMain.ChooseMon.start;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

































public abstract class MonSelection extends MonData implements ActionListener {

    
    private int Id; // Declare Id as a field
    protected String name; // Declare name as a field
    protected boolean isActive; // Declare isActive as a field
    protected int experience; // Declare experience as a field
    protected int health; // Declare health as a field
    protected int level; // Declare level as a field
    protected int damage; // Declare damage as a field

//NEWPAGE//


    MonSelection(String Name, int ID) {

    super(ID, ID, Name, ID, ID, ID, ID, ID); // Ensure MonData has a constructor with these parameters

    String name = "Default";
    this.Id = ID;
    this.Name = Name;

    //ActionListeners


        String Monsave;
        String moveselect;

    //Stats
       int EnemyHp;
       int playerlevel;
        int playerExp;
        int playerHp;
        JFrame Home = new JFrame();
        JPanel Screenpanel = new JPanel(); 
        JLabel player = new JLabel();



         String save = new String();
        String userinput;
                
        String MonData;
        String Save;


        String Select;
        int IdSlot;
        int MonId;
        int basestat;
        int exp;
        int hp;
    
    
    // Replace with valid constructor arguments
   

    Mon yeat = new Mon("Yeat", 1, 1, 100); // Updated to match the constructor

   // System.out.println("Created Mon: " + + ", ID: " +  + ", Level: " +  + ", Health: " + );
// Updated to match the constructor

   // System.out.println("Created Mon: " + + ", ID: " +  + ", Level: " +  + ", Health: " + );
   
   
    Mon drake = new Mon("Drake", 2, 1, 100);
        // Example usage to avoid "variable drake is never read" error
        // Updated to match the constructor
}

// Constructor
public void setMonAttributes(int id, String name, boolean isActive, int experience, int level, int health, int damage) {
    this.name = name;
    this.isActive = isActive;
    this.level = 1; // Initialize level with a default value or pass it as a parameter
    this.level = level;
    this.health = health;
    this.damage = damage;
}

   
    
            
    //button actions
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton start = new JButton("Start"); // Declare and initialize the start button
        if (e.getSource() == start) {
            System.out.println("Loading...");
        
            //BattleScreen
            JFrame BattleScreen = new JFrame();

            //Player
            JLabel playerslelect = new JLabel();
            playerslelect.setText(monsave + " " + level);
            playerslelect.setFont(new Font(null, Font.BOLD, 15)); 
            playerslelect.setHorizontalAlignment(JLabel.LEFT);
            playerslelect.setVerticalAlignment(JLabel.BOTTOM);
            playerslelect.setPreferredSize(new Dimension(25, 25));
            playerslelect.setForeground (Color.white);
            playerslelect.setBackground (Color.blue);
            playerslelect.setOpaque(true);

            //SelectOutput
            JPanel output  = new JPanel();
            playerslelect.setVisible(true);
            output.setVisible(true);

            //BattleScreen
            BattleScreen.add(output);
            output.add(playerslelect);
            output.repaint();

             // Replace with appropriate logic or class instantiation
             // Example: Assuming BattleScreen is a JFrame, you can define and use it
            BattleScreen.setVisible(true);

        } else if (e.getSource() == mon1) {
            System.out.println("You chose Yeat!");
            System.out.println("Details: " + " " + ", Level: " +  " "  + ", HP: " +  " " );

        } else if (e.getSource() == mon3) { // Corrected to mon3 for Future
            System.out.println("You chose Future!");

        } else {
            System.out.println("Invalid choice.");
        }
    
}
}
    

  






        




    




