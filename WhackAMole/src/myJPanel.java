
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class myJPanel extends JPanel implements ActionListener {
    myJButton[] a1;
    myJButton[] b1;
    int check = 0;
    int i=0;
    scorePanel s = new scorePanel();
    public myJPanel()
    {
        setBackground(Color.white);
        this.setPreferredSize(new Dimension (600,800));
        this.setMinimumSize(new Dimension (600,800));
        setLayout(new GridLayout(8,8));
        a1 = new myJButton[16];
         
        for(int i = 1; i<16; i++)
        {
            a1[i] = new myJButton(i);
            add(a1[i]);
            a1[i].addActionListener(this);
        }
        b1 = new myJButton[16];
        for(int j =15; j>0;j--)
        {
            b1[j] = new myJButton(j);
            add(b1[j]);
            b1[j].addActionListener(this);
        }     
    }

//    myJPanel(MainFrame frame) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public void actionPerformed(ActionEvent ae) {
        Object o = ae.getSource();
        if(check==2) 
        {
            for(int y =1; y<16; y++ )
            {
            a1[y].clickedOnce = false;
            b1[y].clickedOnce= false;
            check = 0;
            a1[y].setIcon(null);
            b1[y].setIcon(null);
            }
        }
        
        for(int z = 1; z<16 ; z++)
        {
            if(o == a1[z])
            {
                check++;
                a1[z].clickedOnce = true;
                a1[z].setIcon(myJButton.a2[z]);   
                System.out.println(""+a1[z].clickedOnce+ a1[z].clickedTwice + check);
                if((a1[z].num/b1[z].num==1) && a1[z].clickedOnce == true && b1[z].clickedOnce == true )
                {
                    a1[z].match();
                    b1[z].match();
                    i++;
                    s.sco.setText(i+"");
                }
            }
        }
        
        for(int z = 1; z<16 ; z++)
        {
            if(o == b1[z])
            {
                check++;
                b1[z].clickedOnce=true;
                b1[z].setIcon(myJButton.b2[z]);
                if((a1[z].num/b1[z].num==1)&& a1[z].clickedOnce == true && b1[z].clickedOnce == true)
                {
                  a1[z].match();
                  b1[z].match();
                  i++;
                  s.sco.setText(i+"");
                }
            }
        }
    }
    
}
