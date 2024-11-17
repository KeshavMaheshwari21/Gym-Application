import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Veg extends JFrame implements ActionListener {

    JButton back;

    Veg() {
        setBounds(605, 200, 900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        JLabel header = new JLabel("Vegetarian Nutrition Tips", JLabel.CENTER);
        header.setFont(new Font("Arial", Font.BOLD, 24));
        header.setBounds(250, 20, 400, 40);
        add(header);

        String[] tips = {
            "1. Getting enough calories",
            "2. Avoiding processed foods",
            "3. Varying food choices",
            "4. Consuming flaxseeds, walnuts, and flaxseed oil",
            "5. Adding peanut butter",
            "6. Considering iron supplementation",
            "7. Supplementing with branched chain amino acids"
        };

        int y = 80;
        for (String tip : tips) {
            JLabel tipLabel = new JLabel(tip);
            tipLabel.setFont(new Font("Arial", Font.PLAIN, 16));
            tipLabel.setBounds(50, y, 800, 30);
            add(tipLabel);
            y += 40;
        }

        JLabel note = new JLabel("<html><i>Note:</i> A balanced vegetarian diet can provide all necessary nutrients with proper planning.</html>");
        note.setFont(new Font("Arial", Font.ITALIC, 14));
        note.setForeground(Color.DARK_GRAY);
        note.setBounds(50, y, 800, 40);
        add(note);

        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(400, 500, 100, 30);
        back.addActionListener(this);
        add(back);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Veg();
    }
}
