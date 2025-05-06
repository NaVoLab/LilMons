package LilMonsMain;

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

public class PrintBattleScreen extends BattleResultScreen implements ActionListener {
    private static final int HP = 100;
    private static int EnemyHP = 100;
    JRadioButton move1;
    JRadioButton move2;
    JRadioButton move3;
    JRadioButton move4;

    JLabel enemy; // Declare enemy as a class-level variable
    JLabel enemystat; // Declare enemystat as a class-level variable

    String moveselect1;
    String moveselect2;
    String moveselect3;
    String moveselect4;

    String movesave;
    String monselect; // Declare monselect as a class-level variable



    
   

    //Mon Stats//

    //player stats
    String userinput = LaunchPage.userinput.getText();
    int playerlevel = 3;
    int playerHP = 100;
    int playerExp = 0;
    //Playerinfo playerinfo = new 
    public void Playerinfo(String userinput, int  playerlevel,int  playerHP, int playerExp) {
    //Mon stats
    // Ensure drake is declared and accessible
        Mon drake = new Mon("Drake", 3, 100, 20); // Example initialization
        String monselect = "Drake"; // Replace with the appropriate logic or value
    //int monhp = 
    //Mon moninfo = new Mon(monsave, )

    //String name = playerinfo.name;
    
    // Removed assignment to static final variable HP
    int level = 1; // Define level with an appropriate value
    int damageout = (int) (Damage / level * 1);
    //enemy stats
    int EnemyHP = 100;
    int EnemyDam = 20;
   

   // MonSelection monsave;

    //String mon = monsave.getText();
   
    JLabel player;
    JLabel playerstat;
    JLabel enemy;
    int HP; // Declare HP as a class-level variable
    JLabel enemystat;
    String monsave = "DefaultMon"; // Declare and initialize monsave as a class-level variable

    }
    
    JButton start = new JButton();
    JFrame home = new JFrame();
    public void BattleResultScreen() {
            
        

        //Main Panel
        JPanel spanel = new JPanel();
        spanel.setLayout(new BorderLayout());
        spanel.setBackground(Color.white);
       // spanel.setBounds(0,50,390,250);

       //battle panel
        JPanel battlescreen = new JPanel();
        battlescreen.setLayout(new BorderLayout());
        battlescreen.setBackground(Color.green);
        
        //Header 
        JPanel header = new JPanel();
        header.setBackground(Color.black);
       // header.setBounds(0,280,390,90);
                
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

        //Playinfo
        JLabel player = new JLabel();
        String Monsave = "DefaultMon"; // Initialize Monsave with a default value
        player.setText(Monsave + " " + playerlevel); // Use the class-level monsave and playerlevel variables
        player.setFont(new Font(null, Font.BOLD, 15)); 
        player.setHorizontalAlignment(JLabel.LEFT);
        player.setVerticalAlignment(JLabel.BOTTOM);
        player.setPreferredSize(new Dimension(25, 25));
        player.setForeground (Color.white);
        player.setBackground (Color.blue);
        player.setOpaque(true);

        //Playerstats
        JLabel playerstat = new JLabel();
         playerstat.setText("HP = " + HP);
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
        start.setText("Attack");
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
        
        //Characters
       
        mon1 = new JRadioButton("Move 1");

        mon2 = new JRadioButton("Move 2");

        mon2.setActionCommand("Move 2");

        mon3 = new JRadioButton("Move 3");

        mon4 = new JRadioButton("Move 4");


        //CharList
        ButtonGroup charlist = new ButtonGroup();
        charlist.add(mon1);
        charlist.add(mon2);
        charlist.add(mon3);
        charlist.add(mon4);

        mon1.setName(moveselect1);
        mon2.setName(moveselect2);
        mon3.setName(moveselect3);
        mon4.setName(moveselect4);



        mon1.addActionListener(this);
        mon2.addActionListener(this);
        mon3.addActionListener(this);
        mon4.addActionListener(this);

        
        //Screen 
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home.setSize(500, 500);
        // screen.setResizable(true);
        // screen.setBackground(Color.white);
        home.setLayout(new BorderLayout());
        home.add(title, BorderLayout.NORTH );
        home.add(spanel, BorderLayout.CENTER );
        home.add(bpanel,  BorderLayout.SOUTH);

        //playerinfo
        spanel.setLayout(new BorderLayout());
        spanel.add(player, BorderLayout.SOUTH);
        spanel.add(battlescreen, BorderLayout.CENTER);
        spanel.add(enemystat, BorderLayout.NORTH);

        //battle info
        battlescreen.setLayout(new BorderLayout());
        battlescreen.add(playerstat, BorderLayout.SOUTH);
        //battlescreen.add(battlescreen, BorderLayout.CENTER);
        battlescreen.add(enemy, BorderLayout.NORTH);


        bpanel.add(mon1);
        bpanel.add(mon2);
        bpanel.add(mon3);
        bpanel.add(mon4);
        bpanel.add(start);
        bpanel.add(setting);
        
        
        //screen.pack();
        home.setVisible(true);
    }
        

        
   // public String getName(LaunchPage(monsave)) {
       // return monsave;
       
   // }

    //button actions
    @Override
    public void actionPerformed(ActionEvent e) {
            System.out.println("Loading...");
            //e.getSource(); 
            monselect = "Drake"; // Initialize monselect with a valid value
          
            movesave = monselect;
            moveselect = "Move";

            player.setText(monselect + "[ " + moveselect+ "]---  delt " + damageout);

          
        player.setFont(new Font(null, Font.BOLD, 15)); 
        player.setHorizontalAlignment(JLabel.LEFT);
        player.setVerticalAlignment(JLabel.BOTTOM);
        player.setPreferredSize(new Dimension(25, 25));
        player.setForeground (Color.white);
        player.setBackground (Color.blue);
        player.setOpaque(true);
        /*/
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

/ */
        JPanel bpanel = new JPanel();
        bpanel.setBackground(Color.gray);
        player.setText("("+Monsave+")" + " Delt " + damageout + " Damage");
        playerstat.setText("HP = " + HP);
        enemy.setText("(Enemy) took " + damageout + " Damage ");
        enemystat.setText("Enemy HP = " + EnemyHP);

        //bpanel.add(mon1);
        //bpanel.add(mon2);
        //bpanel.add(mon3);
        //bpanel.add(mon4);


           /*/
           new BattleScreenAttack();

            }
           
        else if(e.getSource()==mon1){
            
            //Object();{
            movesave = "Move ";

            moveselect1 = "Move ";

           // Damage;
            EnemyHP = EnemyHP - damageout.intValue();

            /*/
            player = new JLabel();
            //player.setText(monsave + " " + level);
            player.setText("[>"+moveselect1+"<]" + "delt" + damageout );

            player.setFont(new Font(null, Font.BOLD, 15)); 
            player.setHorizontalAlignment(JLabel.LEFT);
            player.setVerticalAlignment(JLabel.BOTTOM);
            player.setPreferredSize(new Dimension(25, 25));
            player.setForeground (Color.white);
            player.setBackground (Color.blue);
            player.setOpaque(true);
            
           
            
            player.setText("[>"+moveselect1+"<]" + "delt" + damageout );
            enemystat.setText("Enemy HP = " + EnemyHP );

            System.out.println("You Chose " + moveselect1);
            System.out.println("");
            System.out.println("Damage " + damageout);
            System.out.println("Enemy HP = " + EnemyHP );

            //new BattleScreenNext();
            //new BattleScreenNext();

            // Ensure this statement is properly commented or uncommented if needed
            if(e.getSource()==mon1){
            
                movesave = "Move ";
                moveselect3 = movesave;
                            
                 player.setText("[>"+moveselect3+"<]" + "delt" + damageout );
                 enemystat.setText("Enemy HP = " + EnemyHP );
               
    
                 System.out.println("You Chose " + moveselect3);
                 System.out.println("");
                 System.out.println("Damage " + damageout);
                 System.out.println("Enemy HP = " + EnemyHP );

        } else if(e.getSource()==mon2){
            movesave = "Move ";

            moveselect2 = movesave;
            
           // Damage;
           
            player.setText("[>"+moveselect2+"<]" + "delt" + damageout );
            enemystat.setText("Enemy HP = " + EnemyHP );
          
            


            System.out.println("You Chose " + moveselect2);
            System.out.println("");
            System.out.println("Damage " + damageout);
            System.out.println("Enemy HP = " + EnemyHP );

        

        } else if (e.getSource() == mon4) {

            movesave = "Move ";
            moveselect4 = movesave;

       
            player.setText("[>"+moveselect4+"<]" + "delt" + damageout  );
            enemystat.setText("Enemy HP = " + EnemyHP );



            System.out.println("\nMove| " + moveselect4);
            System.out.println("");
            System.out.println("Damage| " + damageout);
            // Ensure this statement is inside a valid method or block
            System.out.println("Enemy HP| = " + EnemyHP);

            
 // Ensure BattleScreen class is defined or imported
  // Ensure BattleScreen is defined or replace with appropriate logic
  System.out.println("BattleScreen logic not implemented yet.");

   


      new BattleScreenNext();}  
        


        }
        
    }





  
 


