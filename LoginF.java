
package za.ac.lg;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginF extends JFrame {
    private JPanel usernamePnl;
    private JPanel passwordPnl;
    private JPanel headingPnl;
    private JPanel userAndPassPnl;
    private JPanel btnsPnl;
    private JPanel mainPnl;
    
    //label 
    private JLabel usernameLbl;
    private JLabel passwordLbl;
    private JLabel headingLbl;
    
    //TextFields
    private JTextField userTxtFld;
    private JTextField passTextFld;
    // Button 
    private JButton submitBtn;
    
    
    public LoginF() {
        setLayout(new BorderLayout());
        setTitle("User login page");
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setForeground(Color.BLACK);
        //create panels 
        usernamePnl = new JPanel(new FlowLayout());
        passwordPnl = new JPanel(new FlowLayout());
        
        userAndPassPnl = new JPanel(new GridLayout(2, 1));
        btnsPnl = new JPanel(new FlowLayout());
        mainPnl = new JPanel(new BorderLayout());
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        //Creating labeles
        headingLbl = new JLabel("Login details");
        usernameLbl = new JLabel("Username: ");
        passwordLbl = new JLabel("Password: ");
        
        //create textField
        
        userTxtFld = new JTextField(10);
        passTextFld = new JTextField(10);
        
        //Crteate button 
        submitBtn = new JButton("Submit");
        
        //add usernameLbl and userTxtFld to username panel
        usernamePnl.add(usernameLbl);
        usernamePnl.add(userTxtFld);
        
        //add passwordLbl and passTxtFld to password panel
        passwordPnl.add(passwordLbl);
        passwordPnl.add(passTextFld);
        
        //add user panel and pass panel to userAndPass panel
        userAndPassPnl.add(usernamePnl);
        userAndPassPnl.add(passwordPnl);
        //create heading panel 
        
        
        //add button to the btnsPnl
        btnsPnl.add(submitBtn);
        //add the heading to the panel
        
        headingPnl.add(headingLbl);
        
        //add to main panel 
        mainPnl.add(headingPnl, BorderLayout.NORTH);
        mainPnl.add(userAndPassPnl , BorderLayout.CENTER);
        mainPnl.add(btnsPnl,BorderLayout.SOUTH);
        
        //add the main panel to the frame
        
        add(mainPnl);
        
        
        setVisible(true);
    }
    
}
