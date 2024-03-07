import javax.swing.*;
import java.awt.event.*;

public class Scientific implements ActionListener {
    JTextField tf1,tf3;
    JButton b1;

    Scientific() {
        JFrame f = new JFrame();
        tf1 = new JTextField();
        tf1.setBounds(50, 50, 150, 20);
        tf3 = new JTextField();
        tf3.setBounds(50, 100, 150, 20);
        tf3.setEditable(false);

        b1 = new JButton("Calculate");
        b1.setBounds(50, 150, 150, 50);
        b1.addActionListener(this);
        f.add(tf1);
        f.add(tf3);
        f.add(b1);
        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s1 = tf1.getText();
        double a = Double.parseDouble(s1);
        String result ="";

        if (e.getSource() == b1) {
            if(a>18){
                result="You are Eligible for Vote";
            }
            else{
               result="You are not  Eligible for Vote"; 
            }
        } 
        else{
            result="Please Enter a valid number"; 
        }
        tf3.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        new Scientific();
    }
}

