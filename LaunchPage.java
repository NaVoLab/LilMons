package LilMonsMain;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LaunchPage extends PlayerInput implements ActionListener {

    String saveinput = new String();
    String newinput = new String();
    JFrame launchpage = new JFrame();
    JButton enter = new JButton();
    static JTextField userinput = new JTextField();
    
    LaunchPage() {
        super(new String[]{}); // Pass an empty String array or modify as needed
        
        Screen PlayerSelection = new Screen();


         //Title
        JLabel title = new JLabel();
        title.setText("Lil Mons Demo");
        title.setFont(new Font(null, Font.BOLD, 40)); 
        title.setBounds(0, 0, 500, 50);
        title.setForeground (Color.white);
        title.setBackground (Color.black);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setVerticalAlignment(JLabel.TOP);
        title.setOpaque(true);

        JLabel entername = new JLabel();
        entername.setText("Enter Name");
        entername.setHorizontalAlignment(JLabel.CENTER);
        entername.setVerticalAlignment(JLabel.TOP);
        


        //screen panel
        JPanel spanel = new JPanel();
        spanel.setBackground(Color.gray);
        spanel.setBounds(0,50,500,300);

        //button panel
        JPanel bpanel = new JPanel();
       // bpanel.setAlignmentY(JPanel.BOTTOM_ALIGNMENT);
        bpanel.setBackground(Color.black);
        bpanel.setBounds(0, 350, 500, 150);
       // bpanel.setOpaque(true);


        //create player name 
        userinput = new JTextField();
        String saveinput = userinput.toString();
        //nameinput.setLocation(200, 100);
        userinput.setPreferredSize(new Dimension(250,25));
       // nameinput = nameinput.nextLine(); = nameinput.setText("Default");
        //saveinput = new StringScanner.next(nameinput);
        //saveinput = userinput.toString();
        userinput.setForeground(Color.black);
        userinput.setBackground(Color.white);
        userinput.setCaretColor(Color.black);
        Scanner newinput = new Scanner(saveinput);

        //Enter Button
        enter = new JButton("Continue");
        enter.setBounds(0, 0, 150, 50);
        enter.setVisible(true);
        enter.addActionListener(this);

        //launch screen
        launchpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        launchpage.setSize(500, 500);
        launchpage.setLayout(new BorderLayout());
        launchpage.add(title, BorderLayout.NORTH);
        launchpage.add(bpanel, BorderLayout.SOUTH);
        launchpage.add(spanel, BorderLayout.CENTER);
        bpanel.add(enter);
        spanel.add(entername);
        spanel.add(userinput);



        //this.pack();
        launchpage.setVisible(true);
    
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==enter) {
            this.dispose();

           // nameinput.getText();
            saveinput = userinput.toString();
            System.out.println("welcome " + userinput.getText());

           HomeDisplay newPage = new HomeDisplay();

            this.dispose();

        //if(e.getSource()== enter){
            //System.out.println("welcome " + nameinput.getText());
            
       }
       // }
   // public Scanner getSource(Scanner nameinput) {
     //   return nameinput;
    }


}

