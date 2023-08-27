import java.awt.*;
import javax.swing.*;

public class FlowLayoutDemo {

    public static void main(String[] args) {
        JFrame flow_frame = new JFrame("FlowLayout Demo");
        flow_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a FlowLayout with left alignment and 5 unit horizontal and vertical
        // gap
        FlowLayout layout = new FlowLayout(FlowLayout.CENTER, 2, 5);
        flow_frame.setLayout(layout);

        // Add buttons to the flow_frame
        JButton button1 = new JButton("Button 1");
        flow_frame.add(button1);
        JButton button2 = new JButton("Button 2");
        flow_frame.add(button2);
        JButton button3 = new JButton("Button 3");
        flow_frame.add(button3);
        JButton button4 = new JButton("Button 4");
        flow_frame.add(button4);
        JButton button5 = new JButton("Button 5");
        flow_frame.add(button5);

        flow_frame.setSize(300, 200);
        flow_frame.setVisible(true);
    }
}
