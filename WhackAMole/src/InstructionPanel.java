
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cwh5278
 */
public class InstructionPanel extends JPanel implements ActionListener{
    
    private MainFrame frame;
    private JLabel gameName;
    private JLabel edition;
    private JButton back;
    private JLabel PSU;
    private JLabel OSU;
    private ImageIcon PSUIcon;
    private ImageIcon OSUIcon;
    private JLabel instructions;
    private JLabel instructionsText;
    
    InstructionPanel(MainFrame frame){
        
        this.frame = frame;
        
        this.setLayout(null);
        this.setBackground(Color.white);
        this.setSize(600, 800);
        
        gameName = new JLabel("Whack-a-Mole");
        gameName.setFont(new Font("Courier New", Font.BOLD, 32));
        edition = new JLabel("Penn State Edition");  
        back = new JButton("Back");
        PSUIcon = new ImageIcon("src/PSUIcon.png");
        OSUIcon = new ImageIcon("src/OSUIcon.png");
        PSU = new JLabel();
        OSU = new JLabel();
        PSU.setIcon(PSUIcon);
        OSU.setIcon(OSUIcon);
        instructions = new JLabel("Instructions");
        instructions.setFont(new Font("Courier New", Font.BOLD, 20));
        instructionsText = new JLabel("<html>Welcome to Whack-a-Mole: Penn State Edition! In this game you must click the Penn State logos before they flip back over, but if you click the Ohio State ones you lose points. Click as many Penn State logos before the time runs out to score the most points. To start, select a difficulty on the main menu and then click the start button.</html>");
        instructionsText.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        
        gameName.setBounds(new Rectangle(180,20,300,50));
        edition.setBounds(new Rectangle(238,40,130,50));
        back.setBounds(new Rectangle(125,650,350,50));
        PSU.setBounds(new Rectangle(300,100,230,230));
        OSU.setBounds(new Rectangle(50,100,230,230));
        instructions.setBounds(new Rectangle(225,350,200,50));
        instructionsText.setBounds(new Rectangle(135,350,325,325));
        
        this.add(gameName);
        this.add(edition);
        this.add(back);
        this.add(PSU);
        this.add(OSU);
        this.add(instructions);
        this.add(instructionsText);
        
        back.addActionListener(this);
        
    }
    
    public void actionPerformed(ActionEvent e){
        
        Object obj = e.getSource();
        MainMenuPanel theMainMenuPanel = new MainMenuPanel(frame);
        
        if(obj == back) 
          {
            frame.remove(this);
            frame.add(theMainMenuPanel);
            frame.revalidate();            
          }
    }
    
}
