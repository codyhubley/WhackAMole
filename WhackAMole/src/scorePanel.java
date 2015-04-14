
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
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
public class scorePanel extends JPanel 
{
  
    int score;
    int score2;
    myJPanel mjp;
    timePanel tp;
    JLabel sco;
    public scorePanel()
    {
        setBackground(Color.white);
        setLayout(new BorderLayout());
        
        
        sco = new JLabel();
        sco.setText("m");
        add(sco);
        
    }
    
}
