
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
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
    
    public BottomPanel(){
        
        this.setLayout(null);
        this.setBackground(Color.white);
        this.setSize(600, 200);
        this.setVisible(true);
        this.setBounds(0, 200, 600, 600);
        setLayout(new GridLayout(8,8));
        a1 = new myJButton[17];
         
       /* for(int i = 1; i<17; i++)
        {
            a1[i] = new myJButton(i);
            add(a1[i]);
            a1[i].addActionListener(this);
        }
        
        b1 = new myJButton[17];
        for(int j =16; j>0;j--)
        {
            b1[j] = new myJButton(j);
            add(b1[j]);
            b1[j].addActionListener(this);
        }
     
   */
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
