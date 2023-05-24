import java.awt.*;
import javax.swing.*;

public class FlowLayoutDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Flow Layout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel to hold the four components.
        JPanel panel = new JPanel(new FlowLayout());

        // Add the four components to the panel.
        panel.add(new JLabel("North"));
        panel.add(new JLabel("East"));

    }

}