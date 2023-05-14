package MovieClass;

import java.awt.BorderLayout;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JPanel;
import com.toedter.calendar.JCalendar;


public class CalendarGUI extends JFrame {
    private JCalendar calendar;
    
    public CalendarGUI() {
        setTitle("Calendar GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        
        // create a new calendar component
        calendar = new JCalendar();
        
        // set the calendar to the current date
        calendar.setCalendar(Calendar.getInstance());
        
        // add the calendar to a JPanel
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(calendar, BorderLayout.CENTER);
        
        // add the panel to the JFrame
        add(panel);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new CalendarGUI();
    }
}
