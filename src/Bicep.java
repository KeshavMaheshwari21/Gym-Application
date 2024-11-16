
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Bicep extends JFrame implements ActionListener{

    JButton back;

    Bicep()
    {
        setBounds(605, 55, 900, 600);

        String[] package1 = {"bicep1.gif"};
        String[] package2 = {"bicep2.gif"};
        String[] package3 = {"bicep3.gif"};
        String[] package4 = {"bicep4.gif"};

        JTabbedPane tab = new JTabbedPane();

        back = new JButton("Back");
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setBounds(390, 480, 100, 30);
        back.addActionListener(this);
        add(back);

        JPanel p1 = createPackage(package1);
        tab.addTab("Exercise 1", null, p1);

        JPanel p2 = createPackage(package2);
        tab.addTab("Exercise 2", null, p2);

        JPanel p3 = createPackage(package3);
        tab.addTab("Exercise 3", null, p3);
        
        JPanel p4 = createPackage(package4);
        tab.addTab("Exercise 4", null, p4);

        add(tab);

        setVisible(true);

    }

    public JPanel createPackage(String[] pack)
    {
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.white);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/"+pack[0]));
        Image i2 = i1.getImage().getScaledInstance(430, 430, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(230, 20, 430, 430);
        p1.add(image);

        return p1;
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == back)
        {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Bicep();
    }    
}
