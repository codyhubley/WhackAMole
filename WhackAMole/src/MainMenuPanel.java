
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cwh5278
 */
public class MainMenuPanel extends JPanel implements ActionListener{
    
    private MainFrame frame;
    private JLabel gameDifficulty;
    private ButtonGroup difficulty;
    private JRadioButton easy;
    private JRadioButton medium;
    private JRadioButton hard;
    private String diff;
    private JLabel gameName;
    private JLabel edition;
    private JButton gameStart;
    private JButton instructions;
    private JLabel PSU;
    private JLabel OSU;
    private ImageIcon PSUIcon;
    private ImageIcon OSUIcon;
//    timePanel t = new timePanel();
//    MainFrame mjf;
    
    MainMenuPanel(MainFrame frame){
        
        this.frame = frame;
//        t.tim = new Timer(t.delay,this);
         
        this.setLayout(null);
        this.setBackground(Color.white);
        this.setSize(600, 800);
        
        gameName = new JLabel("Whack-a-Mole");
        gameName.setFont(new Font("Courier New", Font.BOLD, 32));
        edition = new JLabel("Penn State Edition");    
        PSUIcon = new ImageIcon(this.getClass().getResource("PSUIcon.png"));
        OSUIcon = new ImageIcon(this.getClass().getResource("OSUIcon.png"));
        PSU = new JLabel();
        OSU = new JLabel();
        PSU.setIcon(PSUIcon);
        OSU.setIcon(OSUIcon);
        gameDifficulty = new JLabel("Select Difficulty");
        difficulty = new ButtonGroup();
        easy = new JRadioButton("Easy");
        easy.setBackground(Color.white);
        medium = new JRadioButton("Medium");
        medium.setBackground(Color.white);
        hard = new JRadioButton("Hard");
        hard.setBackground(Color.white);
        difficulty.add(easy);
        difficulty.add(medium);
        difficulty.add(hard);
        medium.setSelected(true);
        instructions = new JButton("Instructions");
        gameStart = new JButton("Start Game");
        
        
        gameName.setBounds(new Rectangle(180,20,300,50));
        edition.setBounds(new Rectangle(238,40,130,50));
        PSU.setBounds(new Rectangle(300,100,230,230));
        OSU.setBounds(new Rectangle(50,100,230,230));
        gameDifficulty.setBounds(new Rectangle(250,350,100,50));
        easy.setBounds(new Rectangle(250,400,100,50));
        easy.setActionCommand("easy");
        medium.setBounds(new Rectangle(250,450,100,50));
        medium.setActionCommand("medium");
        hard.setBounds(new Rectangle(250,500,100,50));
        hard.setActionCommand("hard");
        instructions.setBounds(new Rectangle(125,575,350,50));
        gameStart.setBounds(new Rectangle(125,650,350,50));
        
        this.add(gameName);
        this.add(edition);
        this.add(PSU);
        this.add(OSU);
        this.add(gameDifficulty);
        this.add(easy);
        this.add(medium);
        this.add(hard);
        this.add(instructions);
        this.add(gameStart);
        
        gameStart.addActionListener(this);
        instructions.addActionListener(this);
        
        diff = difficulty.getSelection().getActionCommand();
        
    }
    
    public void actionPerformed(ActionEvent e){
        
        Object obj = e.getSource();
        //myJPanel theGamePanel = new myJPanel();
        //myJPanel2 theGamePanel = new myJPanel2();
        InstructionPanel theInstructionPanel = new InstructionPanel(frame);
        //myJPanel Gamepanel = new myJPanel();
        
        
        BottomPanel theBottomPanel = new BottomPanel(difficulty.getSelection().getActionCommand());
        TopPanel theTopPanel = new TopPanel(this, theBottomPanel);
        System.out.println(difficulty.getSelection().getActionCommand());
        if(obj == gameStart) 
          {
            frame.remove(this);
            frame.add(theTopPanel);
            frame.add(theBottomPanel);
            frame.revalidate();
            frame.repaint();
          }
        if(obj == instructions){
            frame.remove(this);
            frame.add(theInstructionPanel);
            frame.revalidate();
            frame.repaint();
        }
        
    }
    
    public String getDifficulty(){
        return difficulty.getSelection().getActionCommand();
    }
    
}
