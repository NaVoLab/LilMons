package LilMonsMain;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.DisplayMode;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
public interface UserInterface {

    
    //Mon Mon1;
   
    JRadioButton = mon1;
    JRadioButton = mon2;
    JRadioButton = mon3;
    //static JRadioButton monset;


    String monsave = new String();
    String monselect = new String();
    JButton start = new JButton();
    JFrame home = new JFrame();
    String userinput = LaunchPage.userinput.getText();
    //static String monname = new String();

//Mons
    int IdSlot;
    int MonId;
    String Name;
    int basestat;
    int exp;
    int level;
    int hp;
    int damage;

    Drake drake = new Drake(1,1,"Drake", 150, 0, 1, 100, 20);
    Yeat yeat = new Yeat (2, 2, "Yeat", 150,  0, 1 , 100, 15);
    Future future = new Future(1,1,"Future", 150, 0, 1, 100, 20);


    MonSelection() {
        
        
        
        //Main Panel
        JPanel spanel = new JPanel();
        spanel.setBackground(Color.gray);
        spanel.setBounds(0,50,390,250);
        
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
        title.setText("Lil Mons Demo");
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
        
        //Characters
        //monset = new JRadioButton("");

        mon1 = new JRadioButton(drake.name());

        mon2 = new JRadioButton(yeat.name());

        mon3 = new JRadioButton(future.name());

        //CharList
        ButtonGroup charlist = new ButtonGroup();
        charlist.add(mon1);
        charlist.add(mon2);
        charlist.add(mon3);


        mon1.setName(drake.name());
        mon2.setName(yeat.name());
        mon3.setName(yeat.name());

        //monselect = mon1.getName();
        //monset.setName(monselect);

        mon1.addActionListener(this);
        mon2.addActionListener(this);
        mon3.addActionListener(this);



        //mon save
        

        
        //Screen 
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home.setSize(500, 500);
        // screen.setResizable(true);
        // screen.setBackground(Color.white);
        home.setLayout(new BorderLayout());
        home.add(title, BorderLayout.NORTH );
        home.add(spanel, BorderLayout.CENTER );
        home.add(bpanel,  BorderLayout.SOUTH);
        bpanel.add(start);
        bpanel.add(setting);
        spanel.add(mon1);
        spanel.add(mon2);
        spanel.add(mon3);

        
        //screen.pack();
        home.setVisible(true);
        
    }
        
    //button actions
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==start) {
            System.out.println("Loading...");
            monsave = monselect;

           


            System.out.println("you selected " +monsave );
            
           // this.dispose();
            BattleScreen newPage = new BattleScreen();
            JLabel player = new JLabel();
            player.setText(monsave + " " + level);
            player.setFont(new Font(null, Font.BOLD, 15)); 
            player.setHorizontalAlignment(JLabel.LEFT);
            player.setVerticalAlignment(JLabel.BOTTOM);
            player.setPreferredSize(new Dimension(25, 25));
            player.setForeground (Color.white);
            player.setBackground (Color.blue);
            player.setOpaque(true);
        
        }
        else if(e.getSource()==mon1){
            monselect = mon1.getName();
            System.out.println(userinput + " Chose " + monselect);
        }
        else if(e.getSource()==mon2){
            monselect = mon2.getName();

            //Mon = monselect;

            System.out.println(userinput + " Chose " + monselect);
        }
        else if(e.getSource()==mon3){
            monselect = mon3.getName();

            System.out.println(userinput + " Chose " + monselect);
        }    
    }   

  
}
        




    





    


}
