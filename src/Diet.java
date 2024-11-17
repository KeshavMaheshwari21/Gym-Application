import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Diet extends JFrame implements ActionListener {

    JButton veg, non, back;
    JTextField tfpassword, tfusername;

    Diet() {
        setSize(300, 190);
        setLocation(315, 200);
        setLayout(null);

        getContentPane().setBackground(Color.WHITE);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(50, 50, 50));
        p1.setBounds(0, 0, 300, 450);
        p1.setLayout(null);
        add(p1);

        veg = new JButton("Vegetarian");
        veg.setBounds(0, 0, 300, 50);
        veg.setBackground(new Color(50, 50, 50));
        veg.setForeground(Color.white);
        veg.setFont(new Font("Tahoma", Font.PLAIN, 20));
        veg.addActionListener(this);
        p1.add(veg);

        non = new JButton("Non-Vegetarian");
        non.setBounds(0, 50, 300, 50);
        non.setBackground(new Color(50, 50, 50));
        non.setForeground(Color.white);
        non.setFont(new Font("Tahoma", Font.PLAIN, 20));
        non.addActionListener(this);
        p1.add(non);

        back = new JButton("Back");
        back.setBounds(0, 100, 300, 50);
        back.setBackground(new Color(50, 50, 50));
        back.setForeground(Color.white);
        back.setFont(new Font("Tahoma", Font.PLAIN, 20));
        back.addActionListener(this);
        p1.add(back);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back) {
            setVisible(false);
        }
        else if (ae.getSource() == veg) {
            new Veg();
        }
        else{
            new NonVeg();
        }
    }

    public static void main(String args[]) {
        new Diet();
    }
}