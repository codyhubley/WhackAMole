
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cwh5278
 */
public class TopPanel extends JPanel implements ActionListener {
    
    private MainFrame frame;
    private JLabel timeLabel;
    private JLabel scoreLabel;
    private JLabel time;
    private  JLabel score;
    private int timeDelay;
    private Timer timer;
    private JButton start;
    private int timeLeft;
    private int scoreTotal;
    
    TopPanel(){
        
        this.setLayout(null);
        this.setBackground(Color.white);
        this.setSize(600, 200);
        this.setVisible(true);
        this.setBounds(0, 0, 600, 200);
        
        timeLabel = new JLabel("Time:");
        scoreLabel = new JLabel("Score:");
        time = new JLabel();
        score = new JLabel();
        
        timeLabel.setFont(new Font("Courier New", Font.BOLD, 32));
        time.setFont(new Font("Courier New", Font.BOLD, 32));
        scoreLabel.setFont(new Font("Courier New", Font.BOLD, 32));
        score.setFont(new Font("Courier New", Font.BOLD, 32));
        
        Border border = LineBorder.createBlackLineBorder();//        border.
        score.setBorder(border);
        
        start = new JButton("Start");
        this.add(start);
        this.add(timeLabel);
        this.add(scoreLabel);
        this.add(time);
        this.add(score);
        start.setBounds(new Rectangle(0,0,600,50));
        timeLabel.setBounds(new Rectangle(100,50,100,50));
        scoreLabel.setBounds(new Rectangle(400,50,120,50));
        time.setBounds(new Rectangle(100,120,50,50));
        score.setBounds(new Rectangle(400,120,120,50));
        start.addActionListener(this);
        
    }
    
    public void actionPerformed(ActionEvent e){
        
        Object obj = e.getSource();
        if(obj == start) 
          {
              timer = new Timer(100, this);             
              start.setEnabled(false);
              timeLeft = 45;
              time.setText(""+timeLeft);
              timer.start();  
              scoreTotal = 0;
              score.setText(""+scoreTotal);
              
              //enable game buttons here
                            
              
          }
        
        if(obj == timer)
        {
            if(timeLeft > 0){
                timeLeft --;
                time.setText(""+timeLeft);
            }
            else{
                timer.stop();
                start.setEnabled(true);
            }
            if(timeLeft == 20){
                scoreTotal += 500;
                score.setText(""+scoreTotal);
            }
        }
    }
    
}
