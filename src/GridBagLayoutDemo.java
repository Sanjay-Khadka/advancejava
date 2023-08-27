import java.awt.*;
import javax.swing.*;

public class GridBagLayoutDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Grid Bag");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel to hold the four components.
        JPanel panel = new JPanel(new GridBagLayout());

        // Add the four components to the panel.
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(new JLabel("north-side"), constraints);

        constraints.gridx = 1;
        constraints.gridy = 0;
        panel.add(new JLabel("south-side"), constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(new JLabel("ease-side"), constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        panel.add(new JLabel("west-side"), constraints);

        // Add the panel to the frame.
        frame.add(panel);

        // Display the frame.
        frame.pack();
        frame.setSize(400, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
