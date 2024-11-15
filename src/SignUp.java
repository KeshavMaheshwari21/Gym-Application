import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignUp extends JFrame implements ActionListener {

    JButton create, back;
    JTextField tfname, tfusername, tfpassword;

    SignUp() {
        setBounds(350, 200, 900, 360);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(169, 169, 191));        
        p1.setBounds(0, 0, 500, 400);
        p1.setLayout(null);
        add(p1);

        JLabel lblusername = new JLabel("Username :");
        lblusername.setBounds(50, 50, 125, 30);
        lblusername.setFont(new Font("Tahoma", Font.BOLD, 14));
        p1.add(lblusername);

        tfusername = new JTextField();
        tfusername.setBounds(190, 50, 180, 30);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);

        JLabel lblname = new JLabel("Name :");
        lblname.setBounds(50, 110, 125, 30);
        lblname.setFont(new Font("Tahoma", Font.BOLD, 14));
        p1.add(lblname);

        tfname = new JTextField();
        tfname.setBounds(190, 110, 180, 30);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);

        JLabel lblpassword = new JLabel("Password :");
        lblpassword.setBounds(50, 170, 125, 30);
        lblpassword.setFont(new Font("Tahoma", Font.BOLD, 14));
        p1.add(lblpassword);

        tfpassword = new JTextField();
        tfpassword.setBounds(190, 170, 180, 30);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpassword);

        create = new JButton("Create");
        create.setBounds(80, 250, 100, 30);
        create.setBackground(Color.WHITE);
        create.setForeground(Color.black);
        create.setFont(new Font("Tahoma", Font.BOLD, 14));
        create.addActionListener(this);
        p1.add(create);

        back = new JButton("Back");
        back.setBounds(250, 250, 100, 30);
        back.setBackground(Color.WHITE);
        back.setForeground(Color.black);
        back.setFont(new Font("Tahoma", Font.BOLD, 14));
        back.addActionListener(this);
        p1.add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/signup.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(540, 40, 300, 300);
        add(image);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == create) {
            String username = tfusername.getText();
            String name = tfname.getText();
            String password = tfpassword.getText();

            try {
                String query = "INSERT INTO account VALUES('" + username + "', '" + name + "', '" + password + "')";

                Conn c = new Conn();

                c.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Account Created Successfully!");

                setVisible(false);
                new Login();

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == back) {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String args[]) {
        new SignUp();
    }
}
