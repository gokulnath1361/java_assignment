import javax.swing.*;
import java.awt.event.*;

public class Vote implements ActionListener {
    JLabel l1;
    JTextArea area;
    JButton b;

    Vote() {
        JFrame f = new JFrame();
        l1 = new JLabel();
        l1.setBounds(50, 25, 100, 30);
        area = new JTextArea();
        area.setBounds(100, 75, 100, 30);
        b = new JButton("Calculate");
        b.setBounds(100, 130, 120, 30);
        b.addActionListener(this);

        f.add(l1);
        f.add(area);
        f.add(b);

        f.setSize(450, 450);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String result="";
        String text = area.getText();
        double a=Integer.parseInt(text);
        if(a>18){
            result="Eligible";
        }
        else{
            result="Not Eligible";
        }

        l1.setText(result);
    }

    public static void main(String[] args) {
        new Vote();
    }
}

