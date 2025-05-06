package LilMonsMain;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PlayerScreen extends ScreenDisplay implements ActionListener {
    JRadioButton mon1;
    JRadioButton mon2;
    JRadioButton mon3;
    JRadioButton mon4;
    String moveselect;
    String Monsaved;
    String userinput = LaunchPage.userinput.getText();
    String monsave = "saved";

    
    int hpsave;
    int playerlevel = 3;
    int playerHP = 100;
    int playerExp = 0;
    int level = 0;
    int HP = 0;
    int Damage = 0;
    int damageout = Damage / level + 1;
    //enemy stats
    int EnemyHP = 100;
    int EnemyDam = 20;
    

   // MonSelection monsave;

    String mon = monsave;
   

    JLabel player;
    JLabel playerstat;
    JLabel enemy;
    JLabel enemystat;
    
    JButton start = new JButton();
    JFrame home;
    JPanel spanel;

    PlayerScreen(){
            
        
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
        JLabel title = new JLabel();
        title.setText("PlayerScreen");
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
        Continue.setText("Settings");
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
        Settings.setText("A");
        Settings.setFocusable(true);
        Settings.setBackground(Color.white);
        Settings.setBounds(0, 0, 100, 25);
        Settings.setVisible(true);
        Select.addActionListener(this);

          //Exit
        Exit = new JButton();
        Exit.setText("B");
        Exit.setFocusable(true);
        Exit.setBackground(Color.white);
        Exit.setBounds(0, 0, 100, 25);
        Exit.setVisible(true);
        Select.addActionListener(this);
        
        //
        
        //Screen 
        Home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Home.setSize(500, 500);
        // screen.setResizable(true);
        // screen.setBackground(Color.white);
        Home.setLayout(new BorderLayout());
        Home.add(title, BorderLayout.NORTH );
        spanel.add(battlescreen, BorderLayout.CENTER);
        Home.add(spanel, BorderLayout.CENTER );
        Home.add(bpanel,  BorderLayout.SOUTH);

        battlescreen.setLayout(new BorderLayout());
        battlescreen.add(playerstat, BorderLayout.SOUTH);
        battlescreen.add(enemy, BorderLayout.NORTH);


        bpanel.add(Start);
        bpanel.add(Continue);
        bpanel.add(Select);
        bpanel.add(Settings);
        bpanel.add(Exit);
        
        //screen.pack();
        Home.setVisible(true);}
        
    //button actions
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Start) {
            this.dispose();


            System.out.println("Loading...Display ");


                    EnemyHp = EnemyHp - damageout;
                    PlayerHp = PlayerHp - Enemydamage;
    
    
                
                spanel.add(battlescreen, BorderLayout.CENTER);
                battlescreen.add(playerstat, BorderLayout.SOUTH);
    
    
                
                playerstat.setText("HP = " + (PlayerHp - Enemydamage));
                enemystat.setText("HP =" + Health + " ");
    
    
                player.setText((Monsave) + " |Enemeny Delt ---" + Enemydamage + "Damage" );
                player.setText((Monsave) + " |Damage Delt ---" + damageout + "" );
                    

                new BattleResultScreen();


        if(e.getSource()==Continue) {
            this.dispose();


            System.out.println("Loading... NewPage ");



            new BattleResultScreen();


        if(e.getSource()==Select) {
            this.dispose();


            spanel.setBackground(Color.green);
            spanel.setBounds(0,50,390,250);
                        

            System.out.println("Selecting...");

            new BattleResultScreen();

        if(e.getSource()==Exit) {
   
            this.dispose();


            System.out.println("Exiting .. PlayerScreen");}

            new BattleScreenNext();

                        
       // LaunchPage NewPage = new LaunchPage();
            
        }
        
}
        }
    }
}

