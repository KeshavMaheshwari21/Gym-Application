import javax.swing.*;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;

public class Membership extends JFrame implements ActionListener {

    JTextField tfno, tfemail;
    JLabel labelusername;
    JButton book, back;
    int cost;

    Membership(String username) {

        setBounds(315, 150, 900, 500);
        setLayout(null);
        getContentPane().setBackground(Color.white);

        JLabel text = new JLabel("BOOK MEMBERSHIP");
        text.setBounds(160, 10, 300, 30);
        text.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(text);

        JLabel lblusername = new JLabel("Username :");
        lblusername.setBounds(40, 100, 100, 20);
        lblusername.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblusername);

        labelusername = new JLabel();
        labelusername.setFont(new Font("Tahoma", Font.PLAIN, 16));
        labelusername.setBounds(250, 100, 100, 20);
        add(labelusername);

        JLabel lblnumber = new JLabel("Phone No. :");
        lblnumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblnumber.setBounds(40, 150, 150, 25);
        add(lblnumber);

        tfno = new JTextField();
        tfno.setBounds(250, 150, 200, 25);
        add(tfno);

        JLabel lblemail = new JLabel("E-mail :");
        lblemail.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblemail.setBounds(40, 200, 150, 25);
        add(lblemail);

        tfemail = new JTextField();
        tfemail.setBounds(250, 200, 200, 25);
        add(tfemail);

        JLabel lblprice = new JLabel("Price :");
        lblprice.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblprice.setBounds(40, 250, 150, 25);
        add(lblprice);

        JLabel price = new JLabel("Rs. 15000/year");
        price.setFont(new Font("Tahoma", Font.PLAIN, 16));
        price.setBounds(250, 250, 150, 25);
        add(price);

        try {
            Conn c = new Conn();
            String query = "Select * from account where username = '" + username + "'";
            ResultSet rs = c.s.executeQuery(query);

            while (rs.next()) {
                labelusername.setText(rs.getString("username"));
            }

        } catch (Exception e) {
            e.getStackTrace();
        }

        book = new JButton("Book");
        book.setBackground(Color.black);
        book.setForeground(Color.white);
        book.setBounds(120, 350, 120, 25);
        book.addActionListener(this);
        add(book);

        back = new JButton("Back");
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setBounds(280, 350, 120, 25);
        back.addActionListener(this);
        add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/membership.jpg"));
        Image i2 = i1.getImage().getScaledInstance(390, 390, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(475, 30, 390, 390);
        add(image);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == book) {
            try {
                Conn c = new Conn();

                String query = "insert into membership values ('" + labelusername.getText() + "', '"
                        + tfno.getText() + "', '" + tfemail.getText() + "');";

                c.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Membership Booked Successfully!");
                setVisible(false);

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Membership("");
    }
}
