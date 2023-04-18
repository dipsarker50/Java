package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import static javax.swing.JOptionPane.showMessageDialog;

public class SignUp implements ActionListener,FocusListener {
    JLabel l_title;
    JLabel l_fullname;
    JLabel l_email;
    JLabel l_pass;
    JLabel l_phone;
    JLabel l_background;
    JLabel l_question;
    JLabel l_href;

    JTextField t_fullname;
    JTextField t_email;
    JPasswordField p_password;
    JTextField t_phone;
    JPasswordField t_answer;

    JButton b_signup;

    JComboBox question;

    JFrame frame;

        String full="Enter your fullname here...";
        String em="Enter your email here...";
        String pa="Enter your password here...";
        String ph="Enter your phone number here...";
        String an = "Enter your answer here...";

       

    public SignUp() {

        frame = new JFrame("Sign Up");
        l_title = new JLabel("Welcome To MovieFlox");
        l_fullname = new JLabel("FullName");
        l_email = new JLabel("Email Address");
        l_pass = new JLabel("Password");
        l_phone = new JLabel("Phone Number");
        l_background = new JLabel(new ImageIcon("Images/sgupBackground.png"));
        l_question = new JLabel("Answer the security Question below");
        l_href = new JLabel("<html><a href=\"#\">Do you have an account?</a></html>");

        t_fullname = new JTextField(full);
        t_email = new JTextField(em);
        p_password = new JPasswordField(pa);
        t_phone = new JTextField(ph);
        t_answer = new JPasswordField(an);

        b_signup = new JButton(new ImageIcon("Images/SignUpIcon.png"));

        String ques[] = {
            "Choose a Security Question...",
            "Favorite MovieName?",
            "Favorite ActorName?",
            "Favorite AcctressName?"
        };

        question = new JComboBox(ques);
        question.setSelectedIndex(0);

        l_title.setBounds(150, 40, 200, 40);
        l_fullname.setBounds(39, 140, 80, 10);
        l_email.setBounds(39, 205, 100, 10);
        l_pass.setBounds(39, 265, 120, 10);
        l_phone.setBounds(39, 330, 120, 10);
        l_background.setBounds(0, 0, 520, 650);
        l_question.setBounds(39, 390, 240, 20);
        l_href.setBounds(42,480,250,15);

        t_fullname.setBounds(35, 155, 440, 40);
        t_email.setBounds(35, 215, 440, 40);
        p_password.setBounds(35, 275, 440, 40);
        t_phone.setBounds(35, 340, 440, 40);
        t_answer.setBounds(35, 435, 440, 40);

        b_signup.setBounds(185, 550, 120, 60);
        question.setBounds(35, 405, 440, 40);
        frame.setSize(520, 650);

        b_signup.addActionListener(this);
        t_fullname.addFocusListener(this);
        t_email.addFocusListener(this);
        p_password.addFocusListener(this);
        t_phone.addFocusListener(this);
        t_answer.addFocusListener(this);

        p_password.setEchoChar((char)0);
        t_answer.setEchoChar((char)0);

        l_href.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                showMessageDialog(null,"Redirecting to Login...");
                new SignIn();
                frame.setVisible(false);
            }

        });


        Font font = l_title.getFont();
        int fontSize = font.getSize() + 5; // Increase font size by 5
        Font newFont = new Font(font.getName(), font.getStyle(), fontSize);
        l_title.setFont(newFont);

        l_title.setForeground(Color.white);
        l_fullname.setForeground(Color.white);
        l_email.setForeground(Color.white);
        l_email.setForeground(Color.white);
        l_email.setForeground(Color.white);
        l_pass.setForeground(Color.white);
        l_phone.setForeground(Color.white);
        l_question.setForeground(Color.white);
        l_href.setForeground(Color.white);

        t_fullname.setForeground(Color.cyan);
        t_email.setForeground(Color.cyan);
        p_password.setForeground(Color.cyan);
        t_phone.setForeground(Color.cyan);
        t_answer.setForeground(Color.cyan);


        t_fullname.setBackground(Color.decode("#85948a"));
        t_email.setBackground(Color.decode("#85948a"));
        p_password.setBackground(Color.decode("#85948a"));
        t_phone.setBackground(Color.decode("#85948a"));
        question.setBackground(Color.decode("#85948a"));
        t_answer.setBackground(Color.decode("#85948a"));
        b_signup.setBackground(Color.decode("#85948a"));

        l_background.add(l_fullname);
        l_background.add(l_email);
        l_background.add(l_pass);
        l_background.add(l_phone);
        l_background.add(t_fullname);
        l_background.add(t_email);
        l_background.add(p_password);
        l_background.add(t_phone);
        l_background.add(b_signup);
        l_background.add(l_title);
        l_background.add(question);
        l_background.add(l_question);
        l_background.add(t_answer);
        l_background.add(l_href);

        frame.add(l_background);

        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane();
    }

    public void actionPerformed(ActionEvent e) {

        String getfullname = t_fullname.getText();
        String getemail = t_email.getText();
        String getpassword = new String(p_password.getPassword());
        String getphone = t_phone.getText();
        String getquestion = String.valueOf(question.getSelectedItem());
        int questionqu = question.getSelectedIndex();
        String getanswer = new String(t_answer.getPassword());

        String fullname = "FullName:" + getfullname;
        String email = "Username:" + getemail;
        String password = "Password:" + getpassword;
        String phone = "Phone Number:" + getphone;
        String ques = "Security Question is:" + getquestion;
        String answer = "Answer is:" + getanswer;

        int k = 0;
        int emailcheck = 0;
        int phonecheck = 0;
        int passconfirm = 0;

        if (e.getSource() == b_signup) {

            if (getfullname.equals(full) || getemail.equals(em) || getpassword.equals(pa) || getphone.equals(ph) || questionqu == 0 || getanswer.equals(an)) {
                showMessageDialog(null, "Please fill the box correctly.");
            } else {

                if (email.contains("@gmail.com")) {
                    emailcheck++;
                } else {
                    showMessageDialog(null, "Please Enter vaild Email.");
                }

                if (getphone.length() == 14) {

                    if (phone.contains("+88017") || phone.contains("+88018") || phone.contains("+88019") || phone.contains("+88016") || phone.contains("+88013") || phone.contains("+88015")) {
                        phonecheck++;

                    } else {
                        showMessageDialog(null, "Only available in Bangladeshi Operator.Country code also Nessary");
                    }
                } else {
                    showMessageDialog(null, "Please Enter vaild Phone number.");
                }

                if (getpassword.length() >= 8) {
                    passconfirm++;

                } else {
                    showMessageDialog(null, "PassWord is Less than 8 digit.");
                }

                File file = new File("files/user.txt");
                String path = "files/user.txt";

                if (!file.exists()) {
                    try {
                        file.createNewFile();
                    } catch (Exception ef) {
                        ef.printStackTrace();
                    }

                }

                try {
                    FileWriter fileWriter = new FileWriter(file, true);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    PrintWriter printWriter = new PrintWriter(bufferedWriter);

                    FileReader fileReader = new FileReader(path);
                    BufferedReader bufferedReader = new BufferedReader(fileReader);

                    int check = 0;

                    while (bufferedReader.readLine() != null) {
                        check++;
                    }
                    bufferedReader.close();
                    int flag = 0;
                    if (emailcheck == 1 && phonecheck == 1 && passconfirm == 1) {
                        for (int i = 0; i < check; i++) {
                            String line1 = Files.readAllLines(Paths.get(path)).get(i);
                            if (line1.equals(email)) {
                                showMessageDialog(null, "Same Email Exist.\nLogin with That.");
                                flag++;
                            }
                        }

                    } else {
                        flag++;
                    }

                    if (flag == 0) {
                        printWriter.println("===============================================");
                        printWriter.println(fullname);
                        printWriter.println(email);
                        printWriter.println(password);
                        printWriter.println(phone);
                        printWriter.println(ques);
                        printWriter.println(answer);
                        printWriter.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy")));
                        printWriter.println("===============================================");
                        k++;
                        printWriter.close();
                    }

                } catch (Exception ex) {
                    showMessageDialog(null, ex);
                }

                if (k == 1) {
                    showMessageDialog(null, "Signup Sucessful");
                    new SignIn();
                    frame.setVisible(false);
                }

            }

        }

    }

    public void focusGained(FocusEvent e){

        if(e.getSource()==t_fullname){
           if(t_fullname.getText().equals(full)){
                t_fullname.setText("");
                t_fullname.setForeground(Color.BLACK);
            }
        }

        else if(e.getSource()==t_email){
            if(t_email.getText().equals(em)){
                 t_email.setText("");
                 t_email.setForeground(Color.BLACK);
             }
         }

         else if(e.getSource()==p_password){
            if(new String (p_password.getPassword()).equals(pa)){
                p_password.setText("");
                p_password.setForeground(Color.BLACK);
                p_password.setEchoChar('*');
             }
         }
         else if(e.getSource()==t_phone){
            if(t_phone.getText().equals(ph)){
                t_phone.setText("+880");
                t_phone.setForeground(Color.BLACK);
             }
         }

         else if(e.getSource()==t_answer){
            if(new String(t_answer.getPassword()).equals(an)){
                t_answer.setText("");
                t_answer.setForeground(Color.BLACK);
                t_answer.setEchoChar('*');
             }
         }

    }

    public void focusLost(FocusEvent e){

        if(e.getSource()==t_fullname){
            if(t_fullname.getText().equals("")){
                 t_fullname.setText(full);
                 t_fullname.setForeground(Color.CYAN);
             }
         }

         else if(e.getSource()==t_email){
            if(t_email.getText().equals("")){
                 t_email.setText(em);
                 t_email.setForeground(Color.CYAN);
             }
         }

         else if(e.getSource()==p_password){
            if(new String (p_password.getPassword()).equals("")){
                p_password.setText(pa);
                p_password.setForeground(Color.CYAN);
                p_password.setEchoChar((char)0);
             }
         }

         else if(e.getSource()==t_phone){
            if(t_phone.getText().equals("+880")){
                t_phone.setText(ph);
                t_phone.setForeground(Color.CYAN);
             }
         }

         else if(e.getSource()==t_answer){
            if(new String(t_answer.getPassword()).equals("")){
                t_answer.setText(an);
                t_answer.setForeground(Color.CYAN);
                t_answer.setEchoChar((char)0);
             }
         }



    }

     

}