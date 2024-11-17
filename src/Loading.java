import java.awt.*;
import javax.swing.*;

public class Loading extends JFrame implements Runnable {

    Thread t;
    JProgressBar bar;
    String username;

    public void run() {
        try {
            for (int i = 1; i <= 101; i++) {
                int max = bar.getMaximum();
                int value = bar.getValue();

                if (value < max) {
                    bar.setValue(bar.getValue() + 1);
                } else {
                    setVisible(false);
                    new Dashboard(username);
                }
                Thread.sleep(30);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    Loading(String username) {

        this.username = username;

        t = new Thread(this);

        setBounds(500, 200, 650, 400);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel text = new JLabel("Welcome to the world of");
        text.setBounds(50, 40, 600, 40);
        text.setForeground(Color.black);
        text.setFont(new Font("Raleway", Font.BOLD, 35));
        add(text);

        JLabel pain = new JLabel("PAIN");
        pain.setBounds(470, 40, 600, 40);
        pain.setForeground(Color.red);
        pain.setFont(new Font("Raleway", Font.BOLD, 35));
        add(pain);

        JLabel exa = new JLabel("!");
        exa.setBounds(560, 40, 600, 40);
        exa.setForeground(Color.black);
        exa.setFont(new Font("Raleway", Font.BOLD, 35));
        add(exa);

        JLabel loading = new JLabel("Loading and Please Wait...");
        loading.setBounds(215, 150, 200, 30);
        loading.setForeground(Color.red);
        loading.setFont(new Font("Raleway", Font.BOLD, 14));
        add(loading);

        bar = new JProgressBar();
        bar.setBounds(150, 120, 300, 35);
        bar.setStringPainted(true);
        bar.setForeground(new Color(178, 34, 34));        
        add(bar);
        t.start();

        setVisible(true);
    }

    public static void main(String args[]) {
        new Loading("");
    }
}
