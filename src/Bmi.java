import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Bmi extends JFrame implements ActionListener {

    JButton back, check;
    JTextField tfWeight, tfHeight;
    JLabel resultLabel;

    Bmi() {
        setBounds(315, 290, 600, 380);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(new Color(240, 240, 240));

        JLabel header = new JLabel("BMI (Body Mass Index)", JLabel.CENTER);
        header.setFont(new Font("Arial", Font.BOLD, 28));
        header.setBounds(50, 20, 500, 40);
        add(header);

        JLabel lblWeight = new JLabel("Weight (kg):");
        lblWeight.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblWeight.setBounds(50, 100, 150, 25);
        add(lblWeight);

        tfWeight = new JTextField();
        tfWeight.setFont(new Font("Tahoma", Font.PLAIN, 14));
        tfWeight.setBounds(200, 100, 300, 30);
        add(tfWeight);

        JLabel lblHeight = new JLabel("Height (m):");
        lblHeight.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblHeight.setBounds(50, 150, 150, 25);
        add(lblHeight);

        tfHeight = new JTextField();
        tfHeight.setFont(new Font("Tahoma", Font.PLAIN, 14));
        tfHeight.setBounds(200, 150, 300, 30);
        add(tfHeight);

        check = new JButton("Check BMI");
        check.setFont(new Font("Tahoma", Font.BOLD, 16));
        check.setBackground(Color.black);
        check.setForeground(Color.WHITE);
        check.setBounds(50, 210, 200, 40);
        check.addActionListener(this);
        add(check);

        back = new JButton("Back");
        back.setFont(new Font("Tahoma", Font.BOLD, 16));
        back.setBackground(Color.black);
        back.setForeground(Color.WHITE);
        back.setBounds(300, 210, 200, 40);
        back.addActionListener(this);
        add(back);

        resultLabel = new JLabel("", JLabel.CENTER);
        resultLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        resultLabel.setBounds(50, 280, 500, 30);
        resultLabel.setForeground(new Color(102, 102, 102));
        add(resultLabel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back) {
            setVisible(false);
        } else if (ae.getSource() == check) {
            try {
                double weight = Double.parseDouble(tfWeight.getText());
                double height = Double.parseDouble(tfHeight.getText());

                double bmi = weight / (height * height);
                String category = "";

                if (bmi < 16.5) {
                    category = "Severely underweight";
                } else if (bmi < 18.5) {
                    category = "Underweight";
                } else if (bmi < 25) {
                    category = "Normal weight";
                } else if (bmi < 30) {
                    category = "Overweight";
                } else if (bmi < 35) {
                    category = "Obesity class I";
                } else {
                    category = "Obesity class II or higher";
                }

                JOptionPane.showMessageDialog(this, 
                    String.format("Your BMI is %.2f (%s)", bmi, category),
                    "BMI Result", JOptionPane.INFORMATION_MESSAGE);

                resultLabel.setText(String.format("BMI: %.2f - %s", bmi, category));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, 
                    "Please enter valid numbers for weight and height.",
                    "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        new Bmi();
    }
}
