
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
public class myJButton extends JButton implements ActionListener {
        
    int num;
    
    boolean clickedOnce;
    boolean clickedTwice;
    static ImageIcon[] a2 = new ImageIcon[33];
    static ImageIcon[] b2 = new ImageIcon[33];
    @SuppressWarnings("LeakingThisInConstructor")
     public myJButton(int i){
        super();
        
        a2[0] = new ImageIcon(this.getClass().getResource("/Images/osulogo.png"));
        
        b2[0] = new ImageIcon(this.getClass().getResource("/Images/psulogo.png"));
        
        addActionListener(this);
     }
      public void showNum(){
          this.setText(""+num);
    }
      public void hideNum(){
          this.setText("");
      }
      public void match(){
          this.setVisible(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if(o == this && clickedOnce == true){
            clickedTwice = true;
            
            if(clickedTwice){
               
            }
        }
}
}