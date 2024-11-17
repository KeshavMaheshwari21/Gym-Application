import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NonVeg extends JFrame implements ActionListener {

    JButton back;

    NonVeg() {
        setBounds(605, 200, 900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel header = new JLabel("Non-Vegetarian Nutrition Tips", JLabel.CENTER);
        header.setFont(new Font("Arial", Font.BOLD, 24));
        header.setBounds(250, 20, 400, 40);
        add(header);

        String[] tips = {
                "1. Choosing lean cuts of meat to reduce saturated fats.",
                "2. Incorporating fatty fish like salmon and mackerel for Omega-3.",
                "3. Eating a variety of proteins, including eggs and poultry.",
                "4. Avoiding processed meats like sausages and salami.",
                "5. Balancing meat intake with plenty of vegetables and whole grains.",
                "6. Staying hydrated to support digestion of protein-rich foods.",
                "7. Cooking meat thoroughly to prevent foodborne illnesses."
        };

        int y = 80;
        for (String tip : tips) {
            JLabel tipLabel = new JLabel(tip);
            tipLabel.setFont(new Font("Arial", Font.PLAIN, 16));
            tipLabel.setBounds(50, y, 800, 30);
            add(tipLabel);
            y += 40;
        }

        JLabel note = new JLabel(
                "<html><i>Note:</i> A balanced non-vegetarian diet can improve nutrient intake, but moderation is key.</html>");
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
        new NonVeg();
    }
}
