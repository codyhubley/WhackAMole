
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
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
public class timePanel extends JPanel {
   
    Timer tim; 
    int i = 63;
    int j = 3;
    int delay;
    int limit;
    JLabel ti;
    public timePanel()
    {
        setBackground(Color.white);
        setLayout(new BorderLayout());
        delay = 1000;
        limit = 0;
        ti = new JLabel();
        ti.setText(j+"");
        add(ti);
    }
}
