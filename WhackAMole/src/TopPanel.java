
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
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
public class TopPanel extends JPanel implements ActionListener {
    
    private MainFrame frame;
    private JLabel timeLabel;
    private JLabel scoreLabel;
    private JLabel time;
    private  JLabel score;
    private int timeDelay;
    private Timer timer;
    private JButton start;
    
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
        
        start = new JButton("Start");
        this.add(start);
        this.add(timeLabel);
        this.add(scoreLabel);
        this.add(time);
        this.add(score);
        start.setBounds(new Rectangle(50,50,50,50));
        timeLabel.setBounds(new Rectangle(100,50,50,50));
        scoreLabel.setBounds(new Rectangle(50,100,50,50));
        time.setBounds(new Rectangle(50,50,50,50));
        score.setBounds(new Rectangle(50,50,50,50));
        start.addActionListener(this);
        
    }
    
    public void actionPerformed(ActionEvent e){
        
        Object obj = e.getSource();
        if(obj == start) 
          {
            
          }
    }
    
}
