package LilMonsMain;

import static LilMonsMain.ChooseMon.HP;

// Ensure HP is declared as a double in ChooseMon class if needed
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.math.*;
import java.util.*;


public class ScreenDisplay extends LaunchPage implements ActionListener {
   
    //JFrame ScreenDisplay = new JFrame();
   
    JFrame Home = new JFrame();
    JButton Start = new JButton();
    JButton Select = new JButton();
    JLabel title = new JLabel();
    JPanel battlescreen = new JPanel();
    JButton mon1 = new JButton();
    JButton mon2 = new JButton();
    JButton mon3 = new JButton();
    JButton mon4 = new JButton();


    
    JButton Continue;
    JButton Settings;
    JButton Exit;

    JPanel spanel;


    JButton move1;
    JButton move2;
    JButton move3;
    JButton move4;

    String moveselect1;
    String moveselect2;
    String moveselect3;
    String moveselect4;
    String Monsave;
    String movesave;
    String moveselect;


    // EnemyHP;
    JLabel enemy = new JLabel();
    JLabel enemystat = new JLabel();

    Double EnemyHp = 100.0 ;



    //Player
    JLabel player = new JLabel();
    JLabel playerstat = new JLabel();


    Double Health = 100.0;


   
    double Damage = 0.1;
   
    Double playerlevel = 0.1;

    Double damageout = Damage + playerlevel;
    Double Enemydamage = Damage + damageout % playerlevel;

    Double PlayerHp = 100.0 - Enemydamage;

    ScreenDisplay() {
            
        
        //Main Panel
        spanel = new JPanel();
        spanel.setBackground(Color.green);
        spanel.setBounds(0,50,390,250);

         //battle panel
        battlescreen = new JPanel();
        battlescreen.setLayout(new BorderLayout());
        battlescreen.setBackground(Color.yellow);
        
        //Header 
        JPanel header = new JPanel();
        header.setBackground(Color.black);
        header.setBounds(0,280,390,90);
                
        //buttonlayoutpanel
        JPanel bpanel = new JPanel();
        bpanel.setBackground(Color.black);
        bpanel.setBounds(0,295,390,120);
        
        //Title
        title = new JLabel();
        title.setText("Demo Screen");
        title.setFont(new Font(null, Font.BOLD, 40)); 
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setVerticalAlignment(JLabel.TOP);
        title.setBounds(0, 0, 390, 50);
        title.setForeground (Color.white);
        title.setBackground (Color.black);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setVerticalAlignment(JLabel.TOP);
        title.setOpaque(true);
        
        //Start Button
        Start = new JButton();
        Start.setText("Continue");
        Start.setFocusable(true);
        Start.setBackground(Color.white);
        Start.setBounds(0, 0, 100, 25);
        Start.setVisible(true);
        Start.addActionListener(this);

        // Continue 
        Continue = new JButton();
        Continue.setText("List");
        Continue.setFocusable(true);
        Continue.setBackground(Color.white);
        Continue.setBounds(0, 0, 100, 25);
        Continue.setVisible(true);

          //Select Button
        Select = new JButton();
        Select.setText("Select");
        Select.setFocusable(true);
        Select.setBackground(Color.white);
        Select.setBounds(0, 0, 100, 25);
        Select.setVisible(true);
        Select.addActionListener(this);
        
        //Settings
        Settings = new JButton();
        Settings.setText("Settings");
        Settings.setFocusable(true);
        Settings.setBackground(Color.white);
        Settings.setBounds(0, 0, 100, 25);
        Settings.setVisible(true);
        Select.addActionListener(this);

          //Exit
        Exit = new JButton();
        Exit.setText("Exit");
        Exit.setFocusable(true);
        Exit.setBackground(Color.white);
        Exit.setBounds(0, 0, 100, 25);
        Exit.setVisible(true);
        Exit.addActionListener(this);
        
        // Screen Info

        player = new JLabel();
        player.setText((Monsave) + " |Select Move ");
        player.setFont(new Font(null, Font.BOLD, 15)); 
        player.setHorizontalAlignment(JLabel.LEFT);
        player.setVerticalAlignment(JLabel.BOTTOM);
        player.setPreferredSize(new Dimension(25, 25));
        player.setForeground (Color.white);
        player.setBackground (Color.blue);
        player.setOpaque(true);

         //Playerstats
         playerstat = new JLabel();
         playerstat.setText("Player HP = " + (PlayerHp - Damage));
         playerstat.setFont(new Font(null, Font.PLAIN, 15)); 
         playerstat.setHorizontalAlignment(JLabel.RIGHT);
        // playerstat.setVerticalAlignment(JLabel.BOTTOM);
        playerstat.setPreferredSize(new Dimension(25, 15));
        playerstat.setForeground (Color.white);
        playerstat.setBackground (Color.blue);
        // player.setHorizontalAlignment(JLabel.CENTER);
         //player.setVerticalAlignment(JLabel.TOP);
         playerstat.setOpaque(true);

         //Enemy info



         enemy = new JLabel();
         enemy.setText("Enemy");
         enemy.setFont(new Font(null, Font.BOLD, 15)); 
         enemy.setHorizontalAlignment(JLabel.RIGHT);
         enemy.setVerticalAlignment(JLabel.BOTTOM);
         //enemy.setBounds(0, 0, 50, 100);
         enemy.setPreferredSize(new Dimension(50, 25));
         enemy.setForeground (Color.white);
         enemy.setBackground (Color.red);
         enemy.setOpaque(true);

         //Enemy Stats
         enemystat = new JLabel();
         enemystat.setText("HP =" + EnemyHp + " ");
         enemystat.setFont(new Font(null, Font.BOLD, 15)); 
         enemystat.setHorizontalAlignment(JLabel.RIGHT);
         enemystat.setVerticalAlignment(JLabel.BOTTOM);
         //enemy.setBounds(0, 0, 50, 100);
         enemystat.setPreferredSize(new Dimension(50, 25));
         enemystat.setForeground (Color.white);
         enemystat.setBackground (Color.red);
         enemystat.setOpaque(true);
        
        //Characters
       
        move1 = new JButton();
        move1.setText("move1");
        move1.setFocusable(true);
        move1.setBackground(Color.white);
        move1.setBounds(0, 0, 100, 25);
        move1.setVisible(true);


        move2 = new JButton();
        move2.setText("move2");
        move2.setFocusable(true);
        move2.setBackground(Color.white);
        move2.setBounds(0, 0, 100, 25);
        move2.setVisible(true);

        move3 = new JButton();
        move3.setText("move3");
        move3.setFocusable(true);
        move3.setBackground(Color.white);
        move3.setBounds(0, 0, 100, 25);
        move3.setVisible(true);

        move4 = new JButton();
        move4.setText("move4");
        move4.setFocusable(true);
        move4.setBackground(Color.white);
        move4.setBounds(0, 0, 100, 25);
        move4.setVisible(true);


        //CharList
        ButtonGroup charlist = new ButtonGroup();
        charlist.add(move1);
        charlist.add(move2);
        charlist.add(move3);
        charlist.add(move4);

        move1.setName("Move 1");
        move2.setName("Move 2");
        move3.setName("Move 3");
        move4.setName("Move 4");



        move1.addActionListener(this);
        move2.addActionListener(this);
        move3.addActionListener(this);
        move4.addActionListener(this);

        
        //Screen 
        Home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Home.setSize(500, 500);
        // screen.setResizable(true);
        // screen.setBackground(Color.white);
        Home.setLayout(new BorderLayout());
        Home.add(title, BorderLayout.NORTH );
        
        Home.add(spanel, BorderLayout.CENTER );
        Home.add(bpanel,  BorderLayout.SOUTH);

          //playerinfo
          spanel.setLayout(new BorderLayout());
          spanel.add(player, BorderLayout.SOUTH);
          spanel.add(battlescreen, BorderLayout.CENTER);
          spanel.add(enemystat, BorderLayout.NORTH);
  
          //battle info
          battlescreen.setLayout(new BorderLayout());
          battlescreen.add(playerstat, BorderLayout.SOUTH);
          battlescreen.add(enemy, BorderLayout.NORTH);

        bpanel.add(move1);
        bpanel.add(move2);
        bpanel.add(move3);
        bpanel.add(move4);


        bpanel.add(Start);
        bpanel.add(Select);
        bpanel.add(Exit);
        bpanel.add(Continue);

        
        //screen.pack();
        Home.setVisible(true);
        
    }
        
    //button actions
    @Override
    public void actionPerformed(ActionEvent e) {

    for(int i = 1; i <= 3; i++){
        for(int j = 1; j <= 9; j++)

    if(e.getSource()==Start) {
        this.dispose();



        System.out.println("Loading...Display ");
         //battle panel

        EnemyHp = EnemyHp - damageout;
        PlayerHp = PlayerHp - Enemydamage;

        Start.setText("Atck.");
        playerstat.setText("HP = " + (PlayerHp - Enemydamage));

        if(e.getSource()==Start) 
                        
            this.dispose();

                System.out.println("Saving...Display ");

                title.setText("Attack Screen");
                spanel.add(battlescreen, BorderLayout.CENTER);

                battlescreen.add(playerstat, BorderLayout.SOUTH);

                spanel.add(player, BorderLayout.SOUTH);
               
                spanel.add(enemystat, BorderLayout.NORTH);

    
                    EnemyHp = EnemyHp - damageout;
                    PlayerHp = PlayerHp - Enemydamage;
                    
                    enemystat.setText("HP =" + EnemyHp + " ");
                player.setText((Monsave) + " |Damage Delt ---" + damageout + "" );

                spanel.add(battlescreen, BorderLayout.CENTER);

                battlescreen.add(playerstat, BorderLayout.SOUTH);

                playerstat.setText("HP = " + (PlayerHp - Enemydamage));

                 }


                if (e.getSource()==Start)

                EnemyHp = EnemyHp - damageout;
                PlayerHp = PlayerHp - Enemydamage;


                
          
            
            spanel.add(battlescreen, BorderLayout.CENTER);
            battlescreen.add(playerstat, BorderLayout.SOUTH);



            playerstat.setText("HP = " + (PlayerHp - Enemydamage));
            enemystat.setText("HP =" + Health + " ");


            player.setText((Monsave) + " |Enemeny Delt ---" + Enemydamage + "Damage" );
            player.setText((Monsave) + " |Damage Delt ---" + damageout + "" );




                move1.setBackground(Color.white);
                move2.setBackground(Color.white);
                move3.setBackground(Color.white);
                move4.setBackground(Color.white);
    

        if(e.getSource()==Select) {
        this.dispose();
        
        Start.setText("Select");

            Select.setText("Continue");
        
            System.out.println("Exiting...New Page");
        
            title.setText("Exit");
        
            spanel.add(player, BorderLayout.SOUTH);
            spanel.add(battlescreen, BorderLayout.CENTER);
            spanel.add(enemystat, BorderLayout.NORTH);
                
            player.setText((Monsave) + " |You Selected } ");
        
            move1.setBackground(Color.white);
            move2.setBackground(Color.white);
                    
            move3.setBackground(Color.white);
            move4.setBackground(Color.white);

            battlescreen.setBackground(Color.green);}
             



        if(e.getSource()==Settings) {
            this.dispose();

            


            System.out.println("Loading...New Page");

            new PlayerScreen();}

            battlescreen.setBackground(Color.pink);

            title.setText("Move List");

                spanel.add(player, BorderLayout.SOUTH);
                spanel.add(battlescreen, BorderLayout.CENTER);
                spanel.add(enemystat, BorderLayout.NORTH);

                player.setText((Monsave) + " |You Selected } ");

                move1.setBackground(Color.white);
                move2.setBackground(Color.white);

                move3.setBackground(Color.white);
                move4.setBackground(Color.white); 
        
                Enemydamage = Damage + damageout % playerlevel;
                Health = Health - Enemydamage;

                spanel.add(player, BorderLayout.SOUTH);
                spanel.add(battlescreen, BorderLayout.CENTER);
                    spanel.add(enemystat, BorderLayout.NORTH);
        
                    player.setText((Monsave) + " |You Selected } "  + move1.getName());
  




if(e.getSource()==move1) {    
    Enemydamage = Damage + damageout % playerlevel;
    Health = Health - Enemydamage;

    System.out.println("Loading...Move");

    title.setText("Move 1");

        spanel.add(player, BorderLayout.SOUTH);
        spanel.add(battlescreen, BorderLayout.CENTER);
            spanel.add(enemystat, BorderLayout.NORTH);



            player.setText((Monsave) + " |You Selected } "  + move1.getName());
               
               
            move1.setBackground(Color.magenta);}

            move2.setBackground(Color.white);
            move3.setBackground(Color.white);
            move4.setBackground(Color.white);



            System.out.println("Loading...Move");

    title.setText("Move 1");

        spanel.add(player, BorderLayout.SOUTH);
        spanel.add(battlescreen, BorderLayout.CENTER);
            spanel.add(enemystat, BorderLayout.NORTH);

           int level = 1;


            Health = Health - Enemydamage;
            Health = Health - Enemydamage;
            EnemyHp = EnemyHp - damageout;
            PlayerHp = PlayerHp - Enemydamage;



            enemy.setText(" |Enemy Selected } "  + move4.getName());

              
            battlescreen.add(playerstat, BorderLayout.SOUTH);


            playerstat.setText("HP = " + PlayerHp );

               
            player.setText((Monsave) + " |Enemeny Delt ---" + Enemydamage + level *level +  "Damage" );

if(e.getSource()==move2) {

this.dispose();
                
                
System.out.println("Loading...Move");
                
title.setText("Move 2");
                
spanel.add(player, BorderLayout.SOUTH);
spanel.add(battlescreen, BorderLayout.CENTER);
spanel.add(enemystat, BorderLayout.NORTH);
                
                
player.setText((Monsave) + " |You Selected } "  + move2.getName());
                               
                               
                
move1.setBackground(Color.white);
move2.setBackground(Color.magenta);}


move3.setBackground(Color.white);
move4.setBackground(Color.white);
            

playerstat.setText("HP = " + (PlayerHp - Enemydamage));

enemystat.setText("HP =" + Health + " ");
player.setText((Monsave) + " |Enemeny Delt ---" + Enemydamage + level *level +  "Damage" );


if(e.getSource()==move3){ 
        
this.dispose();
                        
                        
System.out.println("Loading...Move");
                        
title.setText("Move 3");
                        
spanel.add(player, BorderLayout.SOUTH);
spanel.add(battlescreen, BorderLayout.CENTER);
spanel.add(enemystat, BorderLayout.NORTH);
spanel.add(playerstat, BorderLayout.CENTER);

player.setText((Monsave) + " |You Selected } "  + move3.getName());

move1.setBackground(Color.white);
move2.setBackground(Color.white);

move3.setBackground(Color.magenta);}          
move4.setBackground(Color.white);
                        


playerstat.setText("HP = " + PlayerHp);  

enemystat.setText("HP =" + Health + " ");
player.setText((Monsave) + " |Enemeny used move it Delt ---" + Enemydamage + level *level + "Damage" );



if(e.getSource()==move4){
        
this.dispose();
                                    
                                    
title.setText("Move 4");
                                    
spanel.add(player, BorderLayout.SOUTH);
spanel.add(battlescreen, BorderLayout.CENTER);
spanel.add(enemystat, BorderLayout.NORTH);
spanel.add(playerstat, BorderLayout.CENTER);
                                    
                                    
                                    
player.setText((Monsave) + " |You Selected } "  + move4.getName());
                                    
move1.setBackground(Color.white);
move2.setBackground(Color.white);
move3.setBackground(Color.white);
                                    
move4.setBackground(Color.magenta);}
                                    
System.out.println("Exiting ... Screen Display");

playerstat.setText("HP = " + PlayerHp);  

enemystat.setText("HP =" + Health + " ");
player.setText((Monsave) + " |Enemeny Used move fragg it Delt ---" + Enemydamage + level *level +  "Damage" );



this.dispose();


if(e.getSource()==move2){ 
        
this.dispose();
                        
                        
System.out.println("Loading...Move");
                        
title.setText("Move 2");
                        
spanel.add(player, BorderLayout.SOUTH);
spanel.add(battlescreen, BorderLayout.CENTER);
spanel.add(playerstat, BorderLayout.CENTER);

spanel.add(enemystat, BorderLayout.NORTH);
                        
                        
                        
player.setText((Monsave) + " |You Selected } "  + move2.getName());

move2.setBackground(Color.magenta);}
                        
move1.setBackground(Color.white);
move4.setBackground(Color.white);

playerstat.setText("HP = " + PlayerHp);  


enemystat.setText("HP =" + Health + " ");
player.setText((Monsave) + " |Enemeny Delt ---"+ Enemydamage + level *level +  "Damage" );
                        
                        
System.out.println("Exiting ... Screen Display");

if(e.getSource()==move4){ 
        
    this.dispose();
                            
                            
    System.out.println("Loading...Move4");
                            
    title.setText("Move 4");
                            
    spanel.add(player, BorderLayout.SOUTH);
    spanel.add(battlescreen, BorderLayout.CENTER);
    spanel.add(enemystat, BorderLayout.NORTH);
                            
                            
                            
    player.setText((Monsave) + " |You Selected } "  + move4.getName());
    move4.setBackground(Color.magenta);}
                            
    move1.setBackground(Color.white);
    move3.setBackground(Color.white);
                            
                            
    System.out.println("Exiting ... Screen Display");
                                 
    
playerstat.setText("HP = " + PlayerHp);  

enemystat.setText("HP =" + Health + " ");
player.setText((Monsave) + " |Enemeny Delt ---"+ Enemydamage + level *level +  "Damage" );


    


/*         new PlayerScreen();}



        if(e.getSource()==Continue) {
            this.dispose();

            System.out.println("Loading...New Page");

            spanel.setBackground(Color.yellow);

            System.out.println("New Screen... Display");



        if(e.getSource()==Settings) {
            this.dispose();

            System.out.println("Loading...New Page");

            spanel.setBackground(Color.blue);

            System.out.println("Exiting ... Screen Display");



        if(e.getSource()==Exit) {
   
            this.dispose();

            spanel.setBackground(Color.green);}

            System.out.println("Exiting ... Screen Display");
*/   

// Battle Buttons 

          }
        }
    }       













        
        


        




    



