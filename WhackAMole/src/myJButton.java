
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author szg5293
 */
public class myJButton extends JButton {

    private double num;
    private int check;

    public myJButton() {
        super();
        num = Math.random();
        
        this.setOpaque(true);
        this.setVisible();
        this.setVisible(false);
        //this.setIcon(null);
        setContentAreaFilled(false);
        setBorderPainted(false);
        
        
    }
    
       void setVisible(){
       if (num < 0.5) {
            setIcon(new ImageIcon(this.getClass().getResource("OsuLogo.Jpg")));
            check = 0;
        } 
        else {
            setIcon(new ImageIcon(this.getClass().getResource("PsuLogo.png")));
            check = 1;
        }
       }
       
       public int getCheck(){
           return check;
       }
     }
   
