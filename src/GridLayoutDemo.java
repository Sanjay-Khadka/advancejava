import java.awt.*;
import javax.swing.*;

public class GridLayoutDemo {

    public static void main(String[] args) {
        JFrame grid_frame = new JFrame("Grid Layout Demo");
        grid_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel to hold the four components.
        JPanel panel = new JPanel(new GridLayout(4, 4));

        // Add the four components to the panel.
        panel.add(new JLabel("North"));
        panel.add(new JLabel("South"));
        panel.add(new JLabel("East"));
        panel.add(new JLabel("West"));
        // panel.add(new JLabel("Center"));

        // Add the panel to the grid_frame.
        grid_frame.add(panel);

        // Display the grid_frame.
        grid_frame.pack();
        grid_frame.setLocationRelativeTo(null);
        grid_frame.setVisible(true);
    }
}
