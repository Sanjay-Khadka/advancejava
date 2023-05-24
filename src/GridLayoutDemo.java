import java.awt.*;
import javax.swing.*;

public class GridLayoutDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Grid Layout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel to hold the four components.
        JPanel panel = new JPanel(new GridLayout(2, 2));

        // Add the four components to the panel.
        panel.add(new JLabel("North"));
        panel.add(new JLabel("South"));
        panel.add(new JLabel("East"));
        panel.add(new JLabel("West"));
        panel.add(new JLabel("Center"));

        // Add the panel to the frame.
        frame.add(panel);

        // Display the frame.
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
