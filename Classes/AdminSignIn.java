package Classes;

import javax.swing.*;
import javax.swing.text.Caret;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class AdminSignIn implements ActionListener,FocusListener{
    JFrame frame;
    JLabel email_label;
    JLabel pass_label;
    JPanel background;
    JLabel title;
    JTextField email_TextField;
    JPasswordField password;
    JButton lgnbutton;
    JButton signupbutton;
    JLabel panel;
    JToggleButton toggleButton;
    Caret emailCaret;
    Caret passCaret;

    public AdminSignIn(){

        frame = new JFrame("Admin Login");
        title = new JLabel("MovieFlox");
        email_label = new JLabel("Email");
        pass_label = new JLabel("Password");
        email_TextField = new JTextField("Please enter your email...");
        password = new JPasswordField("Please enter your password...");
        lgnbutton = new JButton("Log In");
        signupbutton = new JButton("Sign Up");
        toggleButton = new JToggleButton(new ImageIcon("Images/eye.png"));
        background = new JPanel();
        panel  = new JLabel(new ImageIcon("Images/background.jpeg"));
        emailCaret = new CustomCaret(Color.red);
        passCaret = new CustomCaret(Color.red);


        title.setBounds(430, 170, 200, 40);
        email_label.setBounds(350, 235, 120, 25);
        pass_label.setBounds(350, 330, 120,25);
        email_TextField.setBounds(350, 277, 280, 40);
        password.setBounds(350, 367, 280, 40);
        toggleButton.setBounds(630, 385, 40, 20);
        lgnbutton.setBounds(350, 480, 280, 40);
        signupbutton.setBounds(20, 20, 80, 40);
        background.setBounds(300, 120, 400, 500);
        panel.setBounds(0,0,1000,800);

        lgnbutton.addActionListener(this);
        email_TextField.addFocusListener(this);
        password.addFocusListener(this);
        toggleButton.addActionListener(this);
        signupbutton.addActionListener(this);
        password.setEchoChar((char) 0);

        lgnbutton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        email_TextField.setForeground(Color.gray);
        password.setForeground(Color.gray);
        email_label.setForeground(Color.white);
        pass_label.setForeground(Color.white);
        title.setForeground(Color.white);

        toggleButton.setBackground(new Color(0,0,0,220));
        toggleButton.setOpaque(true);

        background.setBackground(new Color(0,0,0,220));
        email_TextField.setBackground(new Color(0,0,0,220));
        password.setBackground(new Color(0,0,0,220));

        email_TextField.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, Color.red));
        password.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, Color.red));

        title.setFocusable(true);
        title.requestFocusInWindow();

        frame.add(email_label);
        frame.add(pass_label);
        frame.add(email_TextField);
        frame.add(password);
        frame.add(lgnbutton);
        frame.add(title);
        frame.add(toggleButton);
        frame.add(signupbutton);

        Font newFont = new Font("Arial", Font.PLAIN, 30);

        title.setFont(newFont);

         newFont = new Font("Arial", Font.PLAIN, 20);

         email_label.setFont(newFont);
         pass_label.setFont(newFont);
          
         newFont = new Font("Arial", Font.PLAIN, 18);

         email_TextField.setFont(newFont);
         password.setFont(newFont);

         frame.add(background);
         frame.add(panel);

        emailCaret.setBlinkRate(500);
        passCaret.setBlinkRate(500);

        email_TextField.setCaret(emailCaret);
        password.setCaret(passCaret);


        frame.setSize(1000, 700);
        frame.setLocationRelativeTo(null); //to center screen gui
        frame.setLayout(null);
        panel.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }


    public void actionPerformed(ActionEvent e) {
       
    }


    public void focusGained(FocusEvent e) {
       
    }


    public void focusLost(FocusEvent e) {
        
    }
}
