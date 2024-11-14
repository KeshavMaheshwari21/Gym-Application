import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable {
    Thread thread;

    Splash() { // Constructor
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/Splash.gif"));
        Image i2 = i1.getImage().getScaledInstance(1100, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);

        add(image);
        
        setSize(1100, 500);
        setLocationRelativeTo(null);
        setVisible(true);

        thread = new Thread(this);
        thread.start();
    }

    public void run() {
        try {
            Thread.sleep(4500);
            narrowEffect();
            verticalEffect();
            setVisible(false);
            new Login();
        } catch (Exception e) { }
    }

    private void narrowEffect() {
        int width = getWidth();
        int height = getHeight();
        
        for (int i = width; i >= 0; i -= 20) {
            setSize(i, height);
            setLocationRelativeTo(null);
            try {
                Thread.sleep(5);
            } catch (Exception e) { }
        }
    }

    private void verticalEffect() {
        int width = getWidth();
        int height = getHeight();
        
        for (int i = height; i >= 0; i -= 20) {
            setSize(width, i);
            setLocationRelativeTo(null);
            try {
                Thread.sleep(10);
            } catch (Exception e) { }
        }
    }

    public static void main(String[] args) {
        new Splash();
    }
}
