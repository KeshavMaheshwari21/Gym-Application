import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Workout extends JFrame implements ActionListener {

    JButton bicep, tricep, chest, shoulder, abs, back, legs, calfs, backtohome;
    JTextField tfpassword, tfusername;

    Workout() {
        setSize(300, 488);
        setLocation(315, 70);
        setLayout(null);

        getContentPane().setBackground(Color.WHITE);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(50, 50, 50));
        p1.setBounds(0, 0, 300, 450);
        p1.setLayout(null);
        add(p1);

        bicep = new JButton("Biceps Exercise");
        bicep.setBounds(0, 0, 300, 50);
        bicep.setBackground(new Color(50, 50, 50));
        bicep.setForeground(Color.white);
        bicep.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bicep.addActionListener(this);
        p1.add(bicep);

        tricep = new JButton("Triceps Exercise");
        tricep.setBounds(0, 50, 300, 50);
        tricep.setBackground(new Color(50, 50, 50));
        tricep.setForeground(Color.white);
        tricep.setFont(new Font("Tahoma", Font.PLAIN, 20));
        tricep.addActionListener(this);
        p1.add(tricep);

        shoulder = new JButton("Shoulders Exercise");
        shoulder.setBounds(0, 100, 300, 50);
        shoulder.setBackground(new Color(50, 50, 50));
        shoulder.setForeground(Color.white);
        shoulder.setFont(new Font("Tahoma", Font.PLAIN, 20));
        shoulder.addActionListener(this);
        p1.add(shoulder);

        chest = new JButton("Chest Exercise");
        chest.setBounds(0, 150, 300, 50);
        chest.setBackground(new Color(50, 50, 50));
        chest.setForeground(Color.white);
        chest.setFont(new Font("Tahoma", Font.PLAIN, 20));
        chest.addActionListener(this);
        p1.add(chest);

        abs = new JButton("Abs Exercise");
        abs.setBounds(0, 200, 300, 50);
        abs.setBackground(new Color(50, 50, 50));
        abs.setForeground(Color.white);
        abs.setFont(new Font("Tahoma", Font.PLAIN, 20));
        abs.addActionListener(this);
        p1.add(abs);

        back = new JButton("Back Exercise");
        back.setBounds(0, 250, 300, 50);
        back.setBackground(new Color(50, 50, 50));
        back.setForeground(Color.white);
        back.setFont(new Font("Tahoma", Font.PLAIN, 20));
        back.addActionListener(this);
        p1.add(back);

        legs = new JButton("Legs Exercise");
        legs.setBounds(0, 300, 300, 50);
        legs.setBackground(new Color(50, 50, 50));
        legs.setForeground(Color.white);
        legs.setFont(new Font("Tahoma", Font.PLAIN, 20));
        legs.addActionListener(this);
        p1.add(legs);

        calfs = new JButton("Calfs Exercise");
        calfs.setBounds(0, 350, 300, 50);
        calfs.setBackground(new Color(50, 50, 50));
        calfs.setForeground(Color.white);
        calfs.setFont(new Font("Tahoma", Font.PLAIN, 20));
        calfs.addActionListener(this);
        p1.add(calfs);

        backtohome = new JButton("Back");
        backtohome.setBounds(0, 400, 300, 50);
        backtohome.setBackground(new Color(50, 50, 50));
        backtohome.setForeground(Color.white);
        backtohome.setFont(new Font("Tahoma", Font.PLAIN, 20));
        backtohome.addActionListener(this);
        p1.add(backtohome);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == backtohome) {
            setVisible(false);
        }
        else if (ae.getSource() == bicep) {
            new Bicep();
        }
    }

    public static void main(String args[]) {
        new Workout();
    }
}