
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
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
 
     myJButton[] a1;
     myJButton[] b1;
     int check = 0;
     int i=0;
     String difficulty;
     Timer timer;
     int speed;
    
    public BottomPanel(String difficulty){
        
        this.difficulty = difficulty;
        
        switch(difficulty){
            case "easy": speed = 2000;
                break;
            case "medium": speed = 1000;
                break;
            case "hard": speed = 500;
                break;
        }
        
        timer = new Timer(speed,this);
        //timer.addActionListener(this);
        
        this.setLayout(null);
        this.setBackground(Color.white);
        this.setSize(600, 200);
        this.setVisible(true);
        this.setBounds(0, 200, 590, 560);
        setLayout(new GridLayout(4,4));
        a1 = new myJButton[17];
         
        for(int i = 1; i<9; i++)
        {
            a1[i] = new myJButton();
            add(a1[i]);
            a1[i].addActionListener(this);
        }
        
        b1 = new myJButton[9];
        for(int j =8; j>0;j--)
        {
            b1[j] = new myJButton();
            add(b1[j]);
            b1[j].addActionListener(this);
        }
    }

     @Override
    public void actionPerformed(ActionEvent e){
        
        Object obj = e.getSource();
        
        if(obj == timer)
        {
            System.out.println("hi");
        }
    }
}
