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
    private JTextField st_1;
    private JTextField st_2;
    private JTextField st_3;
    private JButton TriangPerim;
    private JButton TriangSquare;
    private JLabel perTriang;
    private JLabel squareTriang;

    public MyForm(){
        setVisible(true);
        setSize(900, 200);
        setContentPane(root);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        ButtonArea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField1.getText();
                try{
                    Circle c = new Circle(Integer.parseInt(text));
                    plosh.setText(String.valueOf(c.square()));
                } catch (RuntimeException ex){
                    plosh.setText(String.valueOf("отрицательный радиус у круга"));
                }


            }
        });
        ButtonLength.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField1.getText();
                try{
                    Circle c = new Circle(Integer.parseInt(text));
                    perim.setText(String.valueOf(c.square()));
                } catch (RuntimeException ex){
                    perim.setText(String.valueOf("отрицательный радиус у круга"));
                }
            }
        });
        TriangPerim.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String st_1Text = st_1.getText();
                String st_2Text = st_2.getText();
                String st_3Text = st_3.getText();
                try{
                    Triangle t = new Triangle(
                            Integer.parseInt(st_1Text),
                            Integer.parseInt(st_2Text),
                            Integer.parseInt(st_3Text));
                    perTriang.setText(String.valueOf(t.perimetr()));
                } catch (RuntimeException ex){
                    perTriang.setText(String.valueOf("что-то не то"));
                }

            }
        });
        TriangSquare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String st_1Text = st_1.getText();
                String st_2Text = st_2.getText();
                String st_3Text = st_3.getText();
                try {
                    Triangle t = new Triangle(
                            Integer.parseInt(st_1Text),
                            Integer.parseInt(st_2Text),
                            Integer.parseInt(st_3Text));
                    squareTriang.setText(String.valueOf(t.perimetr()));
                } catch (RuntimeException ex) {
                    squareTriang.setText(String.valueOf("что-то не то"));
                }
            }
        });

    }
}
