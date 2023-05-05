package MovieClass;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Classes.Dashboard;



public class MovieUpdate extends MovieDetails implements ActionListener {
    
    private JFrame frame;
    private JButton title;
    private JButton movie1upload,movie2upload,movie3upload,movie4upload;
    private JTextField movie1name,movie2name,movie3name,movie4name;
    private JLabel movie1,movie2,movie3,movie4;
    private JLabel slide1,slide2,slide3,slide4;
    private JLabel movie1nametext,movie2nametext,movie3nametext,movie4nametext;
    private JButton slide1upload,slide2upload,slide3upload,slide4upload;
    JPanel panel1,panel2;
    JLabel background;
    String user;

    public MovieUpdate(){
       
       
       frame = new JFrame();
       title = new JButton("CINEHUB");
       background = new JLabel(new ImageIcon("Images/userbg.jpg"));
       movie1upload = new JButton("Upload");
       movie2upload = new JButton("Upload");
       movie3upload = new JButton("Upload");
       movie4upload = new JButton("Upload");
       movie1 = new JLabel("Movie1 >");
       movie2 = new JLabel("Movie2 >");
       movie3 = new JLabel("Movie3 >");
       movie4 = new JLabel("Movie4 >");
       slide1upload = new JButton("Upload");
       slide2upload = new JButton("Upload");
       slide3upload = new JButton("Upload");
       slide4upload = new JButton("Upload");
       slide1 = new JLabel("slide1 >");
       slide2 = new JLabel("slide2 >");
       slide3 = new JLabel("slide3 >");
       slide4 = new JLabel("slide4 >");
       movie1name = new JTextField();
       movie2name = new JTextField();
       movie3name = new JTextField();
       movie4name = new JTextField();
       movie1nametext = new JLabel("Movie1 Name");
       movie2nametext = new JLabel("Movie2 Name");
       movie3nametext = new JLabel("Movie3 Name");
       movie4nametext = new JLabel("Movie4 Name");
       panel1 = new JPanel();
       panel2 = new JPanel();
       


       title.setBounds(20, 20, 200, 50);
       movie1upload.setBounds(370,120,80,40);
       movie2upload.setBounds(370,180,80,40);
       movie3upload.setBounds(370,240,80,40);
       movie4upload.setBounds(370,300,80,40);
       movie1.setBounds(250,120,100,40);
       movie2.setBounds(250,180,100,40);
       movie3.setBounds(250,240,100,40);
       movie4.setBounds(250,300,100,40);
       slide1upload.setBounds(700,120,80,40);
       slide2upload.setBounds(700,180,80,40);
       slide3upload.setBounds(700,240,80,40);
       slide4upload.setBounds(700,300,80,40);
       slide1.setBounds(580,120,100,40);
       slide2.setBounds(580,180,100,40);
       slide3.setBounds(580,240,100,40);
       slide4.setBounds(580,300,100,40);
       movie1name.setBounds(420,350,280,40);
       movie2name.setBounds(420,420,280,40);
       movie3name.setBounds(420,490,280,40);
       movie4name.setBounds(420,560,280,40);
       movie1nametext.setBounds(280,350,140,40);
       movie2nametext.setBounds(280,420,140,40);
       movie3nametext.setBounds(280,490,140,40);
       movie4nametext.setBounds(280,560,140,40);
       panel1.setBounds(0, 2, 1000, 80);
       panel2.setBounds(150, 100, 700, 540);
       background.setBounds(0, 0, 1000, 700);

       panel1.setBackground(new Color(0,0,0,140));
       panel2.setBackground(new Color(0,0,0,140));

       movie1.setForeground(Color.white);
       movie2.setForeground(Color.white);
       movie3.setForeground(Color.white);
       movie4.setForeground(Color.white);
       slide1.setForeground(Color.white);
       slide2.setForeground(Color.white);
       slide3.setForeground(Color.white);
       slide4.setForeground(Color.white);
       movie1nametext.setForeground(Color.white);
       movie2nametext.setForeground(Color.white);
       movie3nametext.setForeground(Color.white);
       movie4nametext.setForeground(Color.white);

       movie1.setFont(new Font("serif",Font.PLAIN,20));
       movie2.setFont(new Font("serif",Font.PLAIN,20));
       movie3.setFont(new Font("serif",Font.PLAIN,20));
       movie4.setFont(new Font("serif",Font.PLAIN,20));
       slide1.setFont(new Font("serif",Font.PLAIN,20));
       slide2.setFont(new Font("serif",Font.PLAIN,20));
       slide3.setFont(new Font("serif",Font.PLAIN,20));
       slide4.setFont(new Font("serif",Font.PLAIN,20));
       movie1nametext.setFont(new Font("serif",Font.PLAIN,20));
       movie2nametext.setFont(new Font("serif",Font.PLAIN,20));
       movie3nametext.setFont(new Font("serif",Font.PLAIN,20));
       movie4nametext.setFont(new Font("serif",Font.PLAIN,20));

       Font font = title.getFont();
       int fontSize = font.getSize() + 15; // Increase font size by 5
       Font newFont = new Font("serif", font.getStyle(), fontSize);
        
        title.setFont(newFont);

        title.setCursor(new Cursor(Cursor.HAND_CURSOR));
        title.setForeground(Color.RED);
        title.setBorder(BorderFactory.createEmptyBorder());
        title.setContentAreaFilled(false);
		title.setFocusPainted(false);

        movie1upload.setCursor(new Cursor(Cursor.HAND_CURSOR));
        movie2upload.setCursor(new Cursor(Cursor.HAND_CURSOR));
        movie3upload.setCursor(new Cursor(Cursor.HAND_CURSOR));
        movie4upload.setCursor(new Cursor(Cursor.HAND_CURSOR));
        slide1upload.setCursor(new Cursor(Cursor.HAND_CURSOR));
        slide2upload.setCursor(new Cursor(Cursor.HAND_CURSOR));
        slide3upload.setCursor(new Cursor(Cursor.HAND_CURSOR));
        slide4upload.setCursor(new Cursor(Cursor.HAND_CURSOR));



        title.addActionListener(this);
        movie1upload.addActionListener(this);
        movie2upload.addActionListener(this);
        movie3upload.addActionListener(this);
        movie4upload.addActionListener(this);
        slide1upload.addActionListener(this);
        slide2upload.addActionListener(this);
        slide3upload.addActionListener(this);
        slide4upload.addActionListener(this);


        background.add(title);
        background.add(movie1upload);
        background.add(movie2upload);
        background.add(movie3upload);
        background.add(movie4upload);
        background.add(movie1);
        background.add(movie2);
        background.add(movie3);
        background.add(movie4);
        background.add(slide1upload);
        background.add(slide2upload);
        background.add(slide3upload);
        background.add(slide4upload);
        background.add(slide1);
        background.add(slide2);
        background.add(slide3);
        background.add(slide4);
        background.add(movie1name);
        background.add(movie2name);
        background.add(movie3name);
        background.add(movie4name);
        background.add(movie1nametext);
        background.add(movie2nametext);
        background.add(movie3nametext);
        background.add(movie4nametext);
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

