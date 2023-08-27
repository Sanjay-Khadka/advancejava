import java.awt.*;
import javax.swing.*;

public class GridLayoutDemo {

    public static void main(String[] args) {
        JFrame grid_frame = new JFrame("Grid");
        grid_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel to hold the four components.
        JPanel panel = new JPanel(new GridLayout(4, 4));

        // Add the four components to the panel.
        panel.add(new JLabel("north"));
        panel.add(new JLabel("south"));
        panel.add(new JLabel("east"));
        panel.add(new JLabel("west"));
        // panel.add(new JLabel("Center"));

        // Add the panel to the grid_frame.
        grid_frame.add(panel);

        // Display the grid_frame.
        grid_frame.pack();
        grid_frame.setSize(300, 400);
        grid_frame.setLocationRelativeTo(null);
        grid_frame.setVisible(true);
    }
}
