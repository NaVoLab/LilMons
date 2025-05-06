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

public class ChooseMon extends MonSelection implements ActionListener{

static double HP;
static String monsave;
static JButton start;
static JRadioButton mon1;
static JRadioButton mon2;
static JRadioButton mon3;
static JRadioButton mon4;
static String moveselect;
static Mon move;
static JPanel JPanel;
static JFrame BattleScreen;
static JLabel player;
static JLabel playerstat;
static JLabel enemy;
static JLabel enemystat;
static JButton Continue;


    private String userinput;
    private Mon drake; // Declare drake as a class-level variable

    public ChooseMon() {
        super("defaultName", 1); // Replace "defaultName" and 1 with appropriate values

    
    //public class BattleScreen extends MonSelection implements ActionListener {
        JRadioButton mon1;
        JRadioButton mon2;
        JRadioButton mon3;
        JRadioButton mon4;
        String moveselect;
        String move;
        JPanel JPanel;
        JFrame BattleScreen;
        JButton Continue;

        
    
    
        
       
    
        //Mon Stats//
    
        //player stats
        userinput = LaunchPage.userinput.getText();
        int playerlevel = 3;
        int playerHP = 100;
        int playerExp = 0;
        Playerinfo playerinfo = new Playerinfo(userinput, playerlevel, playerHP, playerExp);
        //Mon stats
        String monselect = "Mon1select";
        //int monhp = 
        //Mon moninfo = new Mon(monsave, )
    
        drake = new Mon("Drake", 100, 50, 30); // Adjusted to match the required constructor
        Mon drake = new Mon("Drake", 100, 50, 30); // Adjusted to match the required constructor
        int Damage = 10; // Example initialization
        int damageout = Damage / 1;
        //enemy stats
        int EnemyHP = 100;
        int EnemyDam = 20;
       
    
       // MonSelection monsave;
    
        //String mon = monsave.getText();
       
    
        JLabel player;
        JLabel playerstat;
        JLabel enemy;
        JLabel enemystat;

        
        
        start = new JButton();
        JFrame home = new JFrame();
       //ChooseMon() {
       // ChooseMon chooseMon = new ChooseMon();{
        
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
            player = new JLabel();
            player.setText(monsave + " " + level);
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
            Continue = new JButton();
            Continue.setText("Continue");
            Continue.setFocusable(true);
            Continue.setBackground(Color.white);
            Continue.setBounds(0, 0, 100, 25);
            Continue.setVisible(true);
            ChooseMon chooseMonInstance = new ChooseMon();
            Continue.addActionListener(chooseMonInstance);
            
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
    
            mon3 = new JRadioButton("Move 3");
    
            //mon4 = new JRadioButton("Move 4");
    
    
            //CharList
            ButtonGroup charlist = new ButtonGroup();
            charlist.add(mon1);
            charlist.add(mon2);
            charlist.add(mon3);
           // charlist.add(mon4);
    
            mon1.setName("Move 1");
            mon2.setName("Move 2");
            mon3.setName("Move 3");
           // mon4.setName("Move 4");
    
    
    
            mon1.addActionListener(new ChooseMon());
            mon2.addActionListener(new ChooseMon());
            mon3.addActionListener(new ChooseMon());
           // mon4.addActionListener(new ChooseMon());
    
            
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
           // bpanel.add(mon4);
            bpanel.add(Continue);
            bpanel.add(setting);
            
            
            //screen.pack();
            home.setVisible(true);
            
        }
            
       // public String getName(LaunchPage(monsave)) {
           // return monsave;
           
       // }
    
        // Main method
       
        
        //button actions
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==Continue) {
                System.out.println("Loading Mon...");
          

               

            }
               
            else if(e.getSource()==mon1){
                
                //Object();{
                    Mon yeat = new Mon("Yeat", 100, 50, 30); // Adjusted to match the defined constructor
                    int damageout = 10; // Example damage calculation
                    HP -= damageout; // Update enemy HP
                    System.out.println("You Chose Move 1");
                    System.out.println("Damage dealt: " + damageout);
                    System.out.println("Enemy HP = " + HP);
                  
                    yeat = new Mon("Yeat", 100, 50, 30); // Adjusted to match the defined constructor
                   
                    int level ;
                    Double HP;
                    int Damage = 0;
                    damageout = Damage * 1;
                    //enemy stats
                    int EnemyHP = 100;
                    int EnemyDam = 20;
                   
                   // Damage;
                    
        
                    EnemyHP = EnemyHP - damageout;
        
                   
                    player.setText(userinput + " selected " + move);
        
        
                    System.out.println("You Chose " + moveselect);
                    System.out.println("");
                    System.out.println("Damage " + damageout);
                    System.out.println("Enemy HP = " + EnemyHP );
            }
                else if(e.getSource()==mon2){
                int level ;
                int HP ;
                int Damage ;
                //enemy stats
                int EnemyHP = 100;
                int EnemyDam = 20;
               
               // Damage;
                
    
    
               
                player.setText(userinput + " selected " + move);
    
    
                System.out.println("You Chose " + moveselect);
                System.out.println("");
                System.out.println("Enemy HP = " + EnemyHP );
                }
        
                else if(e.getSource()==mon3){
                int level;
                int HP ;
                int Damage;
                //enemy stats
                int EnemyHP = 100;
                int EnemyDam = 20;
                
     
                
                 player.setText(userinput + " selected " + move);
     
     
                 System.out.println("You Chose " + moveselect);
                 System.out.println("");
                 System.out.println("Enemy HP = " + EnemyHP );
                }
            }  
        }
        
        

    
    
       // public String getMonsave() {
           // return monsave;
       // }
    
        //public void setMonsave(String monsave) {
            //this.monsave = monsave;
