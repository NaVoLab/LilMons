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


//import ScreenDisplay;

public class HomeDisplay extends ScreenDisplay implements ActionListener {
   
    //JFrame ScreenDisplay = new JFrame();
   
    JFrame Home = new JFrame();

    JButton Start = new JButton();
    JButton Continue;
    JButton Select = new JButton();
    JButton Settings;
    JButton Exit;


    HomeDisplay() {
            
        
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
        Start = new JButton();
        Start.setText("Start Game");
        Start.setFocusable(true);
        Start.setBackground(Color.white);
        Start.setBounds(0, 0, 100, 25);
        Start.setVisible(true);
        Start.addActionListener(this);

        // Continue 
        Continue = new JButton();
        Continue.setText("X");
        Continue.setFocusable(true);
        Continue.setBackground(Color.white);
        Continue.setBounds(0, 0, 100, 25);
        Continue.setVisible(true);

          //Select Button
        Select = new JButton();
        Select.setText("Continue");
        Select.setFocusable(true);
        Select.setBackground(Color.white);
        Select.setBounds(0, 0, 100, 25);
        Select.setVisible(true);
        Select.addActionListener(this);
        
        //Settings
        Settings = new JButton();
        Settings.setText("Y");
        Settings.setFocusable(true);
        Settings.setBackground(Color.white);
        Settings.setBounds(0, 0, 100, 25);
        Settings.setVisible(true);

          //Exit
        Exit = new JButton();
        Exit.setText("Settings");
        Exit.setFocusable(true);
        Exit.setBackground(Color.white);
        Exit.setBounds(0, 0, 100, 25);
        Exit.setVisible(true);
        
        //
        
        //Screen 
        Home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Home.setSize(500, 500);
        // screen.setResizable(true);
        // screen.setBackground(Color.white);
        Home.setLayout(new BorderLayout());
        Home.add(title, BorderLayout.NORTH );
        Home.add(spanel, BorderLayout.CENTER );
        Home.add(bpanel,  BorderLayout.SOUTH);
        bpanel.add(Start);
        bpanel.add(Continue);
        bpanel.add(Select);
        bpanel.add(Settings);
        bpanel.add(Exit);
        
        //screen.pack();
        Home.setVisible(true);
        
    }
        
    //button actions
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Start) {

            this.dispose();

            System.out.println("Loading...Display ");

                     Start.setText("Start");
                    
           new ScreenDisplay(); }


        if(e.getSource()==Continue) {

            this.dispose();

            Continue.setText("Continue");

            System.out.println("Loading... NewPage ");}



        if(e.getSource()==Select) {
            this.dispose();

            Select.setText("Select");

            System.out.println("Loading...New Page");}
           

        if(e.getSource()==Exit) {
            this.dispose();

            Exit.setText("Exit");


            System.out.println("Exiting ... Home Display");}
    }
}
        


        //Screen PlayerSelection = new Screen();
            

            




        
        


        




    



