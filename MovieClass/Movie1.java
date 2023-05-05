package MovieClass;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Classes.Dashboard;


public class Movie1 implements ActionListener {
    
    private JFrame frame;
    private JButton title;
    JPanel panel1,panel2;
    JLabel background;
    String user;

    public Movie1(String moviename,String user){
       
       this.user = user;

       frame = new JFrame(moviename);
       title = new JButton("CINEHUB");
       background = new JLabel(new ImageIcon("Images/userbg.jpg"));
       panel1 = new JPanel();
       panel2 = new JPanel();
       


       title.setBounds(20, 20, 200, 50);
       panel1.setBounds(0, 2, 1000, 80);
       panel2.setBounds(150, 100, 700, 540);
       background.setBounds(0, 0, 1000, 700);

       panel1.setBackground(new Color(0,0,0,140));
       panel2.setBackground(new Color(0,0,0,140));

       Font font = title.getFont();
       int fontSize = font.getSize() + 15; // Increase font size by 5
       Font newFont = new Font("serif", font.getStyle(), fontSize);
        
        title.setFont(newFont);

        title.setCursor(new Cursor(Cursor.HAND_CURSOR));
        title.setForeground(Color.RED);
        title.setBorder(BorderFactory.createEmptyBorder());
        title.setContentAreaFilled(false);
		title.setFocusPainted(false);


        title.addActionListener(this);


        background.add(title);
        background.add(panel1);
        background.add(panel2);

        frame.add(background);

        frame.setSize(1000, 700);        
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==title){
            new Dashboard(user);
        }
    }


}
