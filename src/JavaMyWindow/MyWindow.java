package JavaMyWindow;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MyWindow extends JFrame {

    public MyWindow() {

        JTextField out = new JTextField();
        JButton[] jbs = new JButton[10];
        JButton backspace = new JButton("<");
        JButton plus = new JButton("+");
        JButton equally = new JButton("=");
        setLayout(null);

        setBounds(500, 500, 300, 350);
        setTitle("Калькулятор");
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                jbs[k * 3 + i + 1] = new JButton(String.valueOf(k * 3 + i + 1));
                jbs[k * 3 + i + 1].setBounds(i * (50 + 10) + 10, k * (50 + 10) + 60, 50, 50);
                add(jbs[k * 3 + i + 1]);
            }
        }

        jbs[0]=new JButton("0");
        jbs[0].setBounds(70,240,50,50);
        add(jbs[0]);

        backspace.setBounds(10,240,50,50);
        add(backspace);

        plus.setBounds(130,240,50,50);
        add(plus);

        equally.setBounds(190,240,50,50);
        add(equally);


        out.setEditable(false);
        out.setBounds(10, 5, 275, 50);
        add(out);

        ActionListener l = (ActionEvent e) -> {
            JButton b = (JButton) e.getSource();
            out.setText(out.getText() + b.getText());
        };

        for (JButton b : jbs) {
            b.addActionListener(l);
        }



        setVisible(true);

    }
}
