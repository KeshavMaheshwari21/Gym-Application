import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Dashboard extends JFrame implements ActionListener {

    String username;
    JButton workouts, joinmembership, diet, bmi, logout;

    Dashboard(String username) {
        this.username = username;
        setBounds(0, 0, 1600, 1000);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);

        JPanel p1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setPaint(new GradientPaint(0, 0, Color.BLACK, getWidth(), 0, Color.GRAY));
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        p1.setLayout(null);
        p1.setBounds(0, 0, 1700, 66);
        add(p1);
        

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/Logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5, 0, 70, 70);
        p1.add(icon);

        JLabel heading = new JLabel("GYM-Application");
        heading.setBounds(80, 10, 300, 40);
        heading.setForeground(Color.white);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        p1.add(heading);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(Color.black);
        p2.setBounds(0, 65, 320, 350);
        add(p2);

        workouts = new JButton("Workouts");
        workouts.setBounds(10, 0, 300, 50);
        workouts.setBackground(new Color(50, 50, 50));
        workouts.setForeground(Color.white);
        workouts.setFont(new Font("Tahoma", Font.PLAIN, 20));
        workouts.addActionListener(this);
        p2.add(workouts);

        joinmembership = new JButton("Join Membership");
        joinmembership.setBounds(10, 70, 300, 50);
        joinmembership.setBackground(new Color(50, 50, 50));
        joinmembership.setForeground(Color.white);
        joinmembership.setFont(new Font("Tahoma", Font.PLAIN, 20));
        joinmembership.addActionListener(this);
        p2.add(joinmembership);

        diet = new JButton("Diet Plan");
        diet.setBounds(10, 140, 300, 50);
        diet.setBackground(new Color(50, 50, 50));
        diet.setForeground(Color.white);
        diet.setFont(new Font("Tahoma", Font.PLAIN, 20));
        diet.addActionListener(this);
        p2.add(diet);

        bmi = new JButton("BMI");
        bmi.setBounds(10, 210, 300, 50);
        bmi.setBackground(new Color(50, 50, 50));
        bmi.setForeground(Color.white);
        bmi.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bmi.addActionListener(this);
        p2.add(bmi);

        logout = new JButton("Logout");
        logout.setBounds(10, 280, 300, 50);
        logout.setBackground(new Color(50, 50, 50));
        logout.setForeground(Color.white);
        logout.setFont(new Font("Tahoma", Font.PLAIN, 20));
        logout.addActionListener(this);
        p2.add(logout);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("images/Dashboard.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(5, 0, 1650, 1000);
        add(image);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == workouts) {
            new Workout();
        } else if (ae.getSource() == logout) {
            setVisible(false);
        } else if (ae.getSource() == joinmembership) {
            new Membership(username);
        } else if (ae.getSource() == diet) {
            new Diet();
        } else if (ae.getSource() == bmi) {
            new Bmi();
        }
    }

    public static void main(String args[]) {
        new Dashboard("");
    }
}
