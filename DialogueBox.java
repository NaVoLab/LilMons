package LilMonsMain;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DialogueBox extends JFrame implements ActionListener {

   static JFrame home;
   static JPanel dialogue; 
   static JLabel DialogueText;
   static JPanel spanel;
   static JPanel header;
   static ButtonGroup buttonpanel;
   static JButton start;
   static JButton select;
   static JCheckBox ContinueText;



    //continue JButton;
    DialogueBox() {
            
        
        ContinueText = new JCheckBox();
        ContinueText.setText("Continue");
        ContinueText.setName("{[Continue]}");



        //Main Panel
        spanel = new JPanel();
        spanel.setBackground(Color.gray);
        spanel.setBounds(0,50,390,250);
        
        //Header 
        header = new JPanel();
        header.setBackground(Color.black);
        header.setBounds(0,280,390,90);

        //Dialoguebox
        dialogue = new JPanel();
        dialogue.setBackground(Color.white);
        dialogue.setPreferredSize(new Dimension(200,200));
        

        //Dialogue
        DialogueText = new JLabel();
        DialogueText.setText("Welcome to LiL Mons we are going to start by choosing a player");
        DialogueText.setVisible(true);

                
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
        select = new JButton();
        select.setText("select");
        select.setFocusable(true);
        select.setBackground(Color.white);
        select.setBounds(0, 0, 100, 25);
        select.setVisible(true);
        select.addActionListener(this);

        //select button 
        start = new JButton();
        start.setText("start");
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
        
        //
        
        //Screen 
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Screen Properties
        home.setSize(500, 500);
        home.setLayout(new BorderLayout());
        home.add(title, BorderLayout.NORTH );
        home.add(spanel, BorderLayout.CENTER );
        home.add(bpanel,  BorderLayout.SOUTH);

        //button group
        buttonpanel = new ButtonGroup();
        bpanel.add(start);
        bpanel.add(select);
        bpanel.add(setting);
        //bpanel.add(DialogueBox);

        start.addActionListener(this);
        select.addActionListener(this);
        //DialogueBox.addActionListener(this);

        this.add(start);
        this.add(select);
        this.add(setting);
        this.add(ContinueText);
        this.pack();
        this.setVisible(true);

        //Screen Displaying
        spanel.setLayout(new BorderLayout());
        spanel.add(dialogue, BorderLayout.SOUTH);
        spanel.add(DialogueText);
        spanel.add(bpanel);
       

        
        //screen.pack();
        home.setVisible(true);
        
        


    }
        
    //button actions
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==start) {
            System.out.println("Loading...Player Selection");


            //Player Select page

            DialogueText.setVisible(true);

            this.dispose();


            /*
            DialogueText.setVisible(true);


            start = new JButton();
            start.setName("Continue");
        start.setText("Continue");
        start.setFocusable(true);
        start.setBackground(Color.white);
        start.setBounds(0, 0, 100, 25);
        start.setVisible(true);
        start.addActionListener(this);
            */
        //pageflip
        }
        /*  
        String Continue = start.getText();

        if(Continue == Continue) {
            System.out.println("Loading...");

            LaunchPage newPage = new LaunchPage();
        }
        */

    }
}

        




    



