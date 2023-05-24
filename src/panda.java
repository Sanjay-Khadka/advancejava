import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * Write a description of class panda here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class panda implements ActionListener
{
    private JFrame frame;
    private JPanel obj;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JLabel labelling1;
    private JLabel labelling6;
    private JLabel labelling3;
    private JTextField field1;
    private JTextField field2;
    private JTextField field3;
    public void actionPerformed(ActionEvent e)
    {   
        if(e.getSource() == button1)
        {
            String str = field1.getText();
            String str1 = field2.getText();
            int a = Integer.parseInt(str);
            int b = Integer.parseInt(str1);
            int c = a+b;
            
            String d = String.valueOf(c);
            field3.setText(d);
        }
        else if(e.getSource() == button2)
        {
            String str = field1.getText();
            String str1 = field2.getText();
            int a = Integer.parseInt(str);
            int b = Integer.parseInt(str1);
            int c = a-b;
            
            String d = String.valueOf(c);
            field3.setText(d);            
        }
        else if(e.getSource() == button3)
        {   
           field1.setText("");  
           field2.setText("");  
           field3.setText("");  
            
        }
    }
    public void m1()
        {    
          
            frame = new JFrame();
            frame.setTitle("MyFirstApplication");
            frame.setBounds(500, 0, 500, 300);
            frame.setResizable(true);
            frame.setLayout(null);
            
            obj = new JPanel();
            obj.setBounds(0,0,850,790);
            obj.setLayout(null);
            
            labelling1 = new JLabel();
            labelling1.setText("Number 1:");
            labelling1.setBounds(100,50, 80, 50);
            labelling1.setLayout(null);
            Font hi = new Font("Times New Roman", Font.BOLD, 14);
            labelling1.setFont(hi);
            obj.add(labelling1);
            
            field1 = new JTextField();
            field1.setBounds(200,60, 120, 30);
            field1.setLayout(null);
            obj.add(field1);
            
            JLabel labelling6 = new JLabel();
            labelling6.setText("Number 2:");
            labelling6.setBounds(100,100, 100, 50);
            labelling6.setLayout(null);
            Font hiiiiii = new Font("Times New Roman", Font.BOLD, 14);
            labelling6.setFont(hiiiiii);
            obj.add(labelling6);
            
            field2 = new JTextField();
            field2.setBounds(200,110, 120, 30);
            field2.setLayout(null);
            obj.add(field2);
            
            JLabel labelling3 = new JLabel();
            labelling3.setText("Result:");
            labelling3.setBounds(100,150, 100, 50);
            labelling3.setLayout(null);
            Font hiii = new Font("Times New Roman", Font.BOLD, 14);
            labelling3.setFont(hiii);
            obj.add(labelling3);
            
            field3 = new JTextField();
            field3.setBounds(200,160, 120, 30);
            field3.setLayout(null);
            obj.add(field3);
            
            button1 = new JButton();
            button1.setText("+");
            button1.setBounds(100,210, 50, 30);
            button1.setBackground(Color.GRAY);
            button1.addActionListener(this);
            obj.add(button1);
            
            button2 = new JButton();
            button2.setText("-");
            button2.setBounds(200,210, 50, 30);
            button2.setBackground(Color.GRAY);
            button2.addActionListener(this);
            obj.add(button2);
            
            button3 = new JButton();
            button3.setText("C");
            button3.setBounds(300,210, 50, 30);
            button3.setBackground(Color.GRAY);
            button3.addActionListener(this);
            obj.add(button3);
            //Syntax to add ActionListener
            //void addActionListener(ActionListener a)
            frame.add(obj);
            frame.setVisible(true);
            
        }
}
