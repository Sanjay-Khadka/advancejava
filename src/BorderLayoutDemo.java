import java.awt.*;
import javax.swing.*;

public class BorderLayoutDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Border Layout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel to hold the four components.
        JPanel panel = new JPanel(new BorderLayout());

        // Add the four components to the panel.
        panel.add(new JLabel("North"), BorderLayout.NORTH);
        panel.add(new JLabel("South"), BorderLayout.SOUTH);
        panel.add(new JLabel("East"), BorderLayout.EAST);
        panel.add(new JLabel("West"), BorderLayout.WEST);
        panel.add(new JLabel("Center"), BorderLayout.CENTER);

        // Add the panel to the frame.
        frame.add(panel);

        // Display the frame.
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
