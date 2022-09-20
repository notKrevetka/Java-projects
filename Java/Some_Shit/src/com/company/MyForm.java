package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyForm extends JFrame{
    private JPanel root;
    private JTextField textField1;
    private JButton ButtonArea;
    private JButton ButtonLength;
    private JLabel perim;
    private JLabel plosh;

    public MyForm(){
        setVisible(true);
        setSize(350, 300);
        setContentPane(root);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        ButtonArea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField1.getText();
                Circle c = new Circle(Integer.parseInt(text));
                plosh.setText(String.valueOf(c.square()));
            }
        });
        ButtonLength.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField1.getText();
                Circle c = new Circle(Integer.parseInt(text));
                perim.setText(String.valueOf(c.lLength()));
            }
        });

    }
}
