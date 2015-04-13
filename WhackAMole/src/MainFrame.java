
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cwh5278
 */
public class MainFrame extends JFrame{
    
    private MainMenuPanel theMainMenuPanel;
    
    MainFrame(){
        
        theMainMenuPanel = new MainMenuPanel(this);
        this.setSize(600, 800);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.add(theMainMenuPanel);
        
    }
    
}
