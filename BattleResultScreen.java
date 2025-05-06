package LilMonsMain;

import static LilMonsMain.ChooseMon.start;
import static LilMonsMain.UserInterface.monsave;

// Removed final modifier from monsave declaration
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
import javax.swing.JRadioButton;

public class BattleResultScreen extends BattleScreenAttack implements ActionListener {
   


    static JRadioButton mon1;
    static JRadioButton mon2;  
    static JRadioButton mon3;
    static JRadioButton mon4;
 
 //ActionListeners
    static String moveselect;
    static String Monsave;
 
 //Stats
    static double EnemyHp;
    static int playerExp;
    static int playerHp;
    static int playerlevel;
 
 
 /*\ARRAY/\
     \/Method\*/
     //Panels//
 
 
     BattleResultScreen() {
 
         
    JFrame Home = new JFrame();
 
    JButton start;
    JButton Continue;
    JButton Select = new JButton();
    JButton Settings;
    JButton Exit;
    JPanel spanel;
 
     JLabel player;
     JLabel playerstat;
     JLabel enemy;
     JLabel enemystat;
 
         
     String userinput = LaunchPage.userinput.getText();
 
         playerlevel = 1;
         Double playerHp;
         playerExp = 0;
     
 
         int monhp = 0 ;
         int level = 0;
         int HP = 0 ;
         int Damage = 0 ;
         int damageout = Damage / level * 1;
 
     //enemy stats
 
     int EnemyHP = 100;
     int Enemydamage = 20;
     String name = "Default";
     
 
    
    
    start = new JButton();
            
        
//Header 
        JPanel header = new JPanel();
        header.setBackground(Color.black);
    // header.setBounds(0,280,390,90);

//Main Panel
        spanel = new JPanel();
        spanel.setLayout(new BorderLayout());
        spanel.setBackground(Color.white);
    // spanel.setBounds(0,50,390,250);

//battle panel
       JPanel battlescreen = new JPanel();
       battlescreen.setLayout(new BorderLayout());
       battlescreen.setBackground(Color.green);
        
       
                
//buttonlayoutpanel
        JPanel bpanel = new JPanel();
        bpanel.setBackground(Color.gray);
    //bpanel.setBounds(0,295,390,120);
        
//Title
        JLabel title = new JLabel();
        title.setText("Battle");
        title.setFont(new Font(null, Font.BOLD, 40)); 
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setVerticalAlignment(JLabel.TOP);
        title.setBounds(0, 0, 390, 50);
        title.setForeground (Color.white);
        title.setBackground (Color.black);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setVerticalAlignment(JLabel.TOP);
        title.setOpaque(true);

//Player
        player = new JLabel();
        player.setText( " " + level);
        player.setFont(new Font(null, Font.BOLD, 15)); 
        player.setHorizontalAlignment(JLabel.LEFT);
        player.setVerticalAlignment(JLabel.BOTTOM);
        player.setPreferredSize(new Dimension(25, 25));
        player.setForeground (Color.white);
        player.setBackground (Color.blue);
        player.setOpaque(true);

    //Playerstats
            playerstat = new JLabel();
            playerstat.setText("HP = " + HP);
            playerstat.setFont(new Font(null, Font.PLAIN, 15)); 
            playerstat.setHorizontalAlignment(JLabel.RIGHT);
        // playerstat.setVerticalAlignment(JLabel.BOTTOM);
            playerstat.setPreferredSize(new Dimension(25, 15));
            playerstat.setForeground (Color.white);
            playerstat.setBackground (Color.blue);
        //player.setHorizontalAlignment(JLabel.CENTER);
        //player.setVerticalAlignment(JLabel.TOP);
            playerstat.setOpaque(true);

//Enemy info
    enemy = new JLabel();
    enemy.setText("");
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
         enemystat.setText("HP =" + EnemyHP + " ");
         enemystat.setFont(new Font(null, Font.BOLD, 15)); 
         enemystat.setHorizontalAlignment(JLabel.RIGHT);
         enemystat.setVerticalAlignment(JLabel.BOTTOM);
         //enemy.setBounds(0, 0, 50, 100);
         enemystat.setPreferredSize(new Dimension(50, 25));
         enemystat.setForeground (Color.white);
         enemystat.setBackground (Color.red);
         enemystat.setOpaque(true);
        
    //Start Button
        start = new JButton();
        start.setText("Continue");
        start.setFocusable(true);
        start.setBackground(Color.white);
        start.setBounds(0, 0, 100, 25);
        start.setVisible(true);
        start.addActionListener(this);
        
    //Settings
        JButton setting = new JButton();
        setting.setText("Settings");
        setting.setFocusable(true);
        setting.setBackground(Color.white);
        setting.setBounds(0, 0, 100, 25);
        setting.setVisible(true);
        
        //Start Button
        //Start Button
        start.setText("Select");
        start.setFocusable(true);
        start.setBackground(Color.white);
        start.setBounds(0, 0, 100, 25);
        start.setVisible(true);
        start.addActionListener(this);
        //Settings
        setting.setText("Settings");
        setting.setFocusable(true);
        setting.setBackground(Color.white);
        setting.setBounds(0, 0, 100, 25);
        setting.setVisible(true);
        
        //Characters
       
        mon1 = new JRadioButton("Move 1");

        mon2 = new JRadioButton("Move 2");

        mon3 = new JRadioButton("Move 3");

        mon4 = new JRadioButton("Move 4");


        //CharList
        ButtonGroup charlist = new ButtonGroup();
        charlist.add(mon1);
        charlist.add(mon2);
        charlist.add(mon3);
        charlist.add(mon4);

        mon1.setName("Move 1");
        mon2.setName("Move 2");
        mon3.setName("Move 3");
        mon4.setName("Move 4");



        mon1.addActionListener(this);
        mon2.addActionListener(this);
        mon3.addActionListener(this);
        mon4.addActionListener(this);

        
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
        //battlescreen.add(battlescreen, BorderLayout.CENTER);


        bpanel.add(mon1);
        bpanel.add(mon2);
        bpanel.add(mon3);
        bpanel.add(mon4);
        bpanel.add(start);
        bpanel.add(setting);
        
        
        //screen.pack();
        Home.setVisible(true);}
        
   
   // 

    //button actions
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == start) {
           // Drake drake = new Drake(1, 1, "Drake", 150, 0, 1, 100, 25);


           
           // Damage;
            

            EnemyHp = EnemyHp - Damage;}


            System.out.println("Loading...");
            //e.getSource(); 

            //this.dispose();
            
            moveselect = Monsave;
            //EnemyHP = HpSave(hpsave);
            EnemyHp = 100;

    
        player = new JLabel();
        player.setText(monsave + " " );
        player.setFont(new Font(null, Font.BOLD, 15)); 
        player.setHorizontalAlignment(JLabel.LEFT);
        player.setVerticalAlignment(JLabel.BOTTOM);
        player.setPreferredSize(new Dimension(25, 25));
        player.setForeground (Color.white);
        player.setBackground (Color.blue);
        player.setOpaque(true);

       
        player.setText(userinput + " selected " + " " );


            
           
            
        player.setText("[>"+moveselect1+"<]" + "damage = "+ " "  );




        System.out.println("You Chose " + moveselect1);
        System.out.println("");
        System.out.println("Damage " + Damage);
        System.out.println("Enemy HP = " + EnemyHp );
}
}


     
    
    

    

    


  
    

        


