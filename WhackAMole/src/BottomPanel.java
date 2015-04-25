
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author szg5293
 */
public class BottomPanel extends JPanel implements ActionListener {
 
     private myJButton[] a1;
     private myJButton[] b1;
     private int check = 0;
     private int i=0;
     private String difficulty;
     private Timer timer;
     private int speed;
     private Random random;
     private int rand;
     private TopPanel top;
     private int timeLeft;
     private JOptionPane gameOver;
     private String win;
     
    public BottomPanel(String difficulty, TopPanel top){
        
        this.difficulty = difficulty;
        this.top = top;
        
        switch(difficulty){
            case "easy": speed = 2000;
                break;
            case "medium": speed = 1000;
                break;
            case "hard": speed = 600;
                break;
        }
        
        timer = new Timer(speed,this);
        timeLeft = 45;
        
        this.setLayout(null);
        this.setBackground(Color.white);
        this.setSize(600, 200);
        this.setVisible(true);
        this.setBounds(0, 200, 590, 560);
        setLayout(new GridLayout(4,4));
        
        a1 = new myJButton[17];
            for(int i = 1; i<17; i++)
            {
                a1[i] = new myJButton();
                add(a1[i]);
                a1[i].addActionListener(this);
            } 
    }

     @Override
    public void actionPerformed(ActionEvent e){
        
        Object obj = e.getSource();
        
        if(obj == timer)
        {
            for(int i = 1; i<17; i++){
                this.remove(a1[i]);
            }
            if(top.getTime() > 0){
                timeLeft --;
            }
            else{
                timer.stop();
                if(top.getScore()>0){
                    win = "Winner!";
                }
                else{
                    win = "You Lost";
                }
                gameOver.showMessageDialog(this, "You scored "+top.getScore()+" points.", win, JOptionPane.PLAIN_MESSAGE);
            }
            
            
            for(int i = 1; i<17; i++)
            {
                a1[i] = new myJButton();
                add(a1[i]);
                a1[i].addActionListener(this);
            }
            random = new Random();
            rand = random.nextInt(16) + 1;
            a1[rand].setVisible(true);
            this.revalidate();
            this.repaint();
            
        }
        
        if(obj == a1[1]){
            //System.out.println("clicked");
            //System.out.println(a1[1].getCheck());
            if(a1[1].getCheck() == 0){
                top.changeScore(-50);
            }
            if(a1[1].getCheck() == 1){
                top.changeScore(10);
            }
            top.changeScoreLabel();
            a1[1].setEnabled(false);
        }
        if(obj == a1[2]){
            //System.out.println("clicked");
            //System.out.println(a1[1].getCheck());
            if(a1[2].getCheck() == 0){
                top.changeScore(-50);
            }
            if(a1[2].getCheck() == 1){
                top.changeScore(10);
            }
            top.changeScoreLabel();
            a1[2].setEnabled(false);
        }
        if(obj == a1[3]){
            //System.out.println("clicked");
            //System.out.println(a1[1].getCheck());
            if(a1[3].getCheck() == 0){
                top.changeScore(-50);
            }
            if(a1[3].getCheck() == 1){
                top.changeScore(10);
            }
            top.changeScoreLabel();
            a1[3].setEnabled(false);
        }
        if(obj == a1[4]){
            //System.out.println("clicked");
            //System.out.println(a1[1].getCheck());
            if(a1[4].getCheck() == 0){
                top.changeScore(-50);
            }
            if(a1[4].getCheck() == 1){
                top.changeScore(10);
            }
            top.changeScoreLabel();
            a1[4].setEnabled(false);
        }
        if(obj == a1[5]){
            //System.out.println("clicked");
            //System.out.println(a1[1].getCheck());
            if(a1[5].getCheck() == 0){
                top.changeScore(-50);
            }
            if(a1[5].getCheck() == 1){
                top.changeScore(10);
            }
            top.changeScoreLabel();
            a1[5].setEnabled(false);
        }
        if(obj == a1[6]){
            //System.out.println("clicked");
            //System.out.println(a1[1].getCheck());
            if(a1[6].getCheck() == 0){
                top.changeScore(-50);
            }
            if(a1[6].getCheck() == 1){
                top.changeScore(10);
            }
            top.changeScoreLabel();
            a1[6].setEnabled(false);
        }
        if(obj == a1[7]){
            //System.out.println("clicked");
            //System.out.println(a1[1].getCheck());
            if(a1[7].getCheck() == 0){
                top.changeScore(-50);
            }
            if(a1[7].getCheck() == 1){
                top.changeScore(10);
            }
            top.changeScoreLabel();
            a1[7].setEnabled(false);
        }
        if(obj == a1[8]){
            //System.out.println("clicked");
            //System.out.println(a1[1].getCheck());
            if(a1[8].getCheck() == 0){
                top.changeScore(-50);
            }
            if(a1[8].getCheck() == 1){
                top.changeScore(10);
            }
            top.changeScoreLabel();
            a1[8].setEnabled(false);
        }
        if(obj == a1[9]){
            //System.out.println("clicked");
            //System.out.println(a1[1].getCheck());
            if(a1[9].getCheck() == 0){
                top.changeScore(-50);
            }
            if(a1[9].getCheck() == 1){
                top.changeScore(10);
            }
            top.changeScoreLabel();
            a1[9].setEnabled(false);
        }
        if(obj == a1[10]){
            //System.out.println("clicked");
            //System.out.println(a1[1].getCheck());
            if(a1[10].getCheck() == 0){
                top.changeScore(-50);
            }
            if(a1[10].getCheck() == 1){
                top.changeScore(10);
            }
            top.changeScoreLabel();
            a1[10].setEnabled(false);
        }
        if(obj == a1[11]){
            //System.out.println("clicked");
            //System.out.println(a1[1].getCheck());
            if(a1[11].getCheck() == 0){
                top.changeScore(-50);
            }
            if(a1[11].getCheck() == 1){
                top.changeScore(10);
            }
            top.changeScoreLabel();
            a1[11].setEnabled(false);
        }
        if(obj == a1[12]){
            //System.out.println("clicked");
            //System.out.println(a1[1].getCheck());
            if(a1[12].getCheck() == 0){
                top.changeScore(-50);
            }
            if(a1[12].getCheck() == 1){
                top.changeScore(10);
            }
            top.changeScoreLabel();
            a1[12].setEnabled(false);
        }
        if(obj == a1[13]){
            //System.out.println("clicked");
            //System.out.println(a1[1].getCheck());
            if(a1[13].getCheck() == 0){
                top.changeScore(-50);
            }
            if(a1[13].getCheck() == 1){
                top.changeScore(10);
            }
            top.changeScoreLabel();
            a1[13].setEnabled(false);
        }
        if(obj == a1[14]){
            //System.out.println("clicked");
            //System.out.println(a1[1].getCheck());
            if(a1[14].getCheck() == 0){
                top.changeScore(-50);
            }
            if(a1[14].getCheck() == 1){
                top.changeScore(10);
            }
            top.changeScoreLabel();
            a1[14].setEnabled(false);
        }
        if(obj == a1[15]){
            //System.out.println("clicked");
            //System.out.println(a1[1].getCheck());
            if(a1[15].getCheck() == 0){
                top.changeScore(-50);
            }
            if(a1[15].getCheck() == 1){
                top.changeScore(10);
            }
            top.changeScoreLabel();
            a1[15].setEnabled(false);
        }
        if(obj == a1[16]){
            //System.out.println("clicked");
            //System.out.println(a1[1].getCheck());
            if(a1[16].getCheck() == 0){
                top.changeScore(-50);
            }
            if(a1[16].getCheck() == 1){
                top.changeScore(10);
            }
            top.changeScoreLabel();
            a1[16].setEnabled(false);
        }
    }
    
    public void getTop(TopPanel top){
        this.top = top;
    }
    
    public void setTimeLeft(int time){
        timeLeft = time;
    }
    
    public void startTimer(){
        timer.start();
    }
}
