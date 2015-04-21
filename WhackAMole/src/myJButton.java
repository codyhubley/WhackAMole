
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

    public myJButton() {
        super();
        num = Math.random();
        
  
        this.setOpaque(false);
        this.setVisible(true);
        this.setIcon(null);
        setContentAreaFilled(false);
        setBorderPainted(true);
        
        
    }
    
       void setVisible(){
       if (num < 0.5) {
            setIcon(new ImageIcon(this.getClass().getResource("OsuLogo.Jpg")));
        } 
        else {
            setIcon(new ImageIcon(this.getClass().getResource("PsuLogo.png")));
        }
       }
     }
   
