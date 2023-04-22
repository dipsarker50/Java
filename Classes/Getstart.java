package Classes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Getstart implements ActionListener{

    JLabel background;
    JButton click;
    JFrame frame;
    
    public Getstart(){

        background = new JLabel(new ImageIcon("Images/Startback.jpeg"));
        click = new JButton("Get Start");
        frame = new JFrame();

        background.setBounds(0, 0, 1000, 800);
        click.setBounds(430, 360, 140 , 60);

        Font newFont = new Font("Arial", Font.PLAIN, 25);
        click.setFont(newFont);
        click.setBackground(new Color(255, 0, 0));
        // click.setOpaque(true);
        // click.setBorderPainted(false);

        click.addActionListener(this);

        frame.add(click);
        frame.add(background);



        frame.setSize(1000, 800);        
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }


    public void actionPerformed(ActionEvent e) {
       
        if(e.getSource()==click){

            new SignUp();
            frame.setVisible(false);
        }
    }
}
