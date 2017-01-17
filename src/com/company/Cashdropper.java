package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Emiel on 17-1-2017.
 */
public class Cashdropper extends JPanel implements ActionListener {
    private JFrame frame;
    private JButton button;
    private JLabel label;
    private int cash = 0;
    private JTextField text;

    public Cashdropper(){

        frame = new JFrame("FrameDemo");
        frame.setSize(500,200);
        button = new JButton("DROP DE 20K");
        text = new JTextField("Cash:" + "$" + cash);
        frame.getContentPane().add(text, BorderLayout.NORTH);
        frame.getContentPane().add(button, BorderLayout.SOUTH);
        button.addActionListener (this);



        frame.pack();
        frame.setVisible(true);
        JPanel panel = new JPanel();
        frame.add(panel);
        frame.getContentPane().add(label);



    }

    public void actionPerformed(ActionEvent e) {
        cash = cash + 20000;
        text.setText("Cash:" + "$" + cash);
    }

    public void dropCash(){

    }
}
