package Classes;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Dashboard extends Details implements ActionListener{
    private JFrame frame;
    private JButton profilebtn;
    private JButton logoutbtn;
    private String user;



    public Dashboard(String username){

        user =username;

        frame = new JFrame("DashBoard");
        profilebtn = new  JButton(findDetails(1,username));
        logoutbtn = new  JButton("Logout");

        profilebtn.setBounds(180, 20, profilebtn.getPreferredSize().width, 40);
        logoutbtn.setBounds(300, 20,80,40);

        profilebtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        logoutbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));

        frame.add(profilebtn);
        frame.add(logoutbtn);

        logoutbtn.addActionListener(this);
        profilebtn.addActionListener(this);

        frame.setSize(1000, 800);        
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }




    public void actionPerformed(ActionEvent e) {

       if(e.getSource()==logoutbtn){
            int check = JOptionPane.showOptionDialog(null, "Are you sure you want to logout?", "Logout Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, new Object[]{ "Yes","No"}, null);
            if(check == JOptionPane.YES_OPTION){
                new SignIn();
                frame.setVisible(false);
            }
            else{

            }
       }
       if(e.getSource()==profilebtn){
            new Profile(user);
            frame.setVisible(false);


       }
       
       
    }


    
}
