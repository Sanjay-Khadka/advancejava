import java.awt.*;
import javax.swing.*;

public class Shapes extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw a rectangle
        g.drawRect(60, 43, 90, 65);

        // Draw a filled rectangle
        g.setColor(Color.RED);
        g.fillRect(295, 55, 110, 65);

        // Draw a circle
        g.setColor(Color.BLACK);
        g.drawOval(65, 125, 110, 90);

        // Draw a filled circle
        g.setColor(Color.YELLOW);
        g.fillOval(205, 160, 105, 95);

        // Draw an arc
        g.setColor(Color.BLACK);
        g.drawArc(55, 305, 105, 95, 50, 275);

        // Draw a filled arc
        g.setColor(Color.YELLOW);
        g.fillArc(200, 300, 105, 105, 130, 175);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Shapes Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);
        frame.add(new Shapes());
        frame.setVisible(true);
    }
}