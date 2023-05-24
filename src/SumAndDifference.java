import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SumAndDifference {

    private JFrame frame;
    private JTextField firstNumberTextField;
    private JTextField secondNumberTextField;
    private JTextField outputTextField;

    public SumAndDifference() {
        frame = new JFrame("Sum and Difference");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3, 2));

        JLabel firstNumberLabel = new JLabel("First Number:");
        firstNumberTextField = new JTextField();
        mainPanel.add(firstNumberLabel);
        mainPanel.add(firstNumberTextField);

        JLabel secondNumberLabel = new JLabel("Second Number:");
        secondNumberTextField = new JTextField();
        mainPanel.add(secondNumberLabel);
        mainPanel.add(secondNumberTextField);

        outputTextField = new JTextField();
        outputTextField.setEditable(false);
        mainPanel.add(outputTextField);

        JButton sumButton = new JButton("Sum");
        sumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int firstNumber = Integer.parseInt(firstNumberTextField.getText());
                int secondNumber = Integer.parseInt(secondNumberTextField.getText());
                int sum = firstNumber + secondNumber;
                outputTextField.setText("The sum is " + sum);
            }
        });

        JButton differenceButton = new JButton("Difference");
        differenceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int firstNumber = Integer.parseInt(firstNumberTextField.getText());
                int secondNumber = Integer.parseInt(secondNumberTextField.getText());
                int difference = firstNumber - secondNumber;
                outputTextField.setText("The difference is " + difference);
            }
        });

        mainPanel.add(sumButton);
        mainPanel.add(differenceButton);

        frame.add(mainPanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new SumAndDifference();
    }
}

