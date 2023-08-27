import java.awt.*;
import javax.swing.*;

public class BorderLayoutEx {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Border Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());

        panel.add(new JLabel("north-side"), BorderLayout.NORTH);
        panel.add(new JLabel("south-side"), BorderLayout.SOUTH);
        panel.add(new JLabel("east-side"), BorderLayout.EAST);
        panel.add(new JLabel("west-side"), BorderLayout.WEST);
        panel.add(new JLabel("center"), BorderLayout.CENTER);

        frame.add(panel);

        frame.pack();
        frame.setSize(300, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
