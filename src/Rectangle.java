import java.awt.*;
import javax.swing.*;

public class Rectangle {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Rectangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a graphics context
        Graphics g = frame.getGraphics();

        // Draw a rectangle without filling
        g.drawRect(100, 100, 200, 100);

        // Draw a rectangle with filling
        g.setColor(Color.red);
        g.fillRect(300, 100, 200, 100);

        // Draw a circle without filling
        g.drawOval(100, 300, 200, 200);

        // Draw a circle with filling
        g.setColor(Color.blue);
        g.fillOval(300, 300, 200, 200);

        // Draw an arc without filling
        g.drawArc(100, 500, 200, 200, 0, 180);

        // Draw an arc with filling
        g.setColor(Color.green);
        g.fillArc(300, 500, 200, 200, 0, 180);

        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}