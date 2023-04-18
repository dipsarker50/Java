package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import static javax.swing.JOptionPane.showMessageDialog;

public class SignIn extends JFrame implements ActionListener,FocusListener {

    JFrame frame;
    JLabel email_label;
    JLabel pass_label;
    JLabel background;
    JLabel title;
    JLabel href;
    JTextField email_TextField;
    JPasswordField password;
    JButton lgnbutton;
    JPanel panel;
    FocusListener focusListener;

    public SignIn() {

        frame = new JFrame("Login");
        title = new JLabel("MovieFlox");
        email_label = new JLabel("Email");
        pass_label = new JLabel("Password");
        email_TextField = new JTextField("Please enter your email...");
        password = new JPasswordField("Please enter your password...");
        lgnbutton = new JButton("Log In");
        background = new JLabel(new ImageIcon("Images/sgupBackground.png"));
        href = new JLabel("<html><a href=\"#\">Are you a new user?</a></html>");

        href.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                showMessageDialog(null,"Redirecting to SignUp...");
                new SignUp();
                frame.setVisible(false);
            }

        });

        title.setBounds(150, 40, 200, 40);
        email_label.setBounds(34, 100, 120, 10);
        pass_label.setBounds(34, 175, 120, 10);
        email_TextField.setBounds(30, 112, 330, 40);
        password.setBounds(30, 187, 330, 40);
        lgnbutton.setBounds(150, 280, 80, 40);
        background.setBounds(0, 0, 400, 400);
        href.setBounds(34, 222, 130, 40);
        

        lgnbutton.addActionListener(this);
        email_TextField.addFocusListener(this);
        password.addFocusListener(this);
        password.setEchoChar((char) 0);

        email_TextField.setForeground(Color.cyan);
        password.setForeground(Color.cyan);
        email_label.setForeground(Color.white);
        pass_label.setForeground(Color.white);
        title.setForeground(Color.white);

        email_TextField.setBackground(Color.decode("#85948a"));
        password.setBackground(Color.decode("#85948a"));



        background.add(email_label);
        background.add(pass_label);
        background.add(email_TextField);
        background.add(password);
        background.add(lgnbutton);
        background.add(title);
        background.add(href);

        Font font = title.getFont();
        int fontSize = font.getSize() + 5; // Increase font size by 5
        Font newFont = new Font(font.getName(), font.getStyle(), fontSize);
        title.setFont(newFont);

        frame.add(background);


        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null); //to center screen gui
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
      


    public void actionPerformed(ActionEvent e) {

        String uname = "Username:"+email_TextField.getText();
        String upass = "Password:"+new String(password.getPassword());
        String path = "files/user.txt";

        if (e.getSource() == lgnbutton) {

            try {
                FileReader fileReader = new FileReader(path);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
               

                int check = 0;
                while (bufferedReader.readLine() != null) {
                    check++;
                }


                int flag=0;
                for (int i = 0; i < check; i++) {
                    String line1 = Files.readAllLines(Paths.get(path)).get(i);
                    if (line1.equals(uname)) {
                        String line2 = Files.readAllLines(Paths.get(path)).get(i+1);
                        if(line2 .equals(upass)){
                            flag++;
                            
                        }

                    }

                }
                bufferedReader.close();

                if(flag==1){
                     showMessageDialog(null,"Login SuccessFul.");
                     new Dashboard(uname);
                }
                else{
                    showMessageDialog(null,"Invaild Credtial.");

                }

            } catch (Exception ex) {
                showMessageDialog(null,ex);

            }
        }

     }



    public void focusGained(FocusEvent e) {
        if (e.getSource() == email_TextField) {
            if(email_TextField.getText().equals("Please enter your email...")){
                email_TextField.setText("");
                email_TextField.setForeground(Color.BLACK);
            }
        }
        else if (e.getSource() == password) {
            if(new String(password.getPassword()).equals("Please enter your password...")){
                password.setText("");
                password.setForeground(Color.BLACK);
                password.setEchoChar('*');
                
            }
        }
        
        
    }



    public void focusLost(FocusEvent e) {
        if (e.getSource() == email_TextField) {
            if(email_TextField.getText().equals("")){
                email_TextField.setText("Please enter your email...");
                email_TextField.setForeground(Color.cyan);
            }
        }

        else if (e.getSource() == password) {
            if(new String(password.getPassword()).equals("")){
                password.setText("Please enter your password...");
                password.setForeground(Color.cyan);
                password.setEchoChar((char) 0);
            }
        }
        
    }

}