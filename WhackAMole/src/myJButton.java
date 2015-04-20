
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
    static ImageIcon[] a2 = new ImageIcon[16];
    static ImageIcon[] b2 = new ImageIcon[16];
    public myJButton(int i){
        super();
        
        a2[0] = new ImageIcon(this.getClass().getResource("OsuLogo.png"));
        b2[0] = new ImageIcon(this.getClass().getResource("PsuLogo.png"));
        
        addActionListener(this);
     }
      public void showNum(){
          this.setText(""+num);
    }
      public void hideNum(){
          this.setText("");
      }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        }
}