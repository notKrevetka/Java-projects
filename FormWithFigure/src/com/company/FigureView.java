package com.company;

import javax.swing.*;

public class FigureView extends JFrame {
    private JPanel root;
    private Drawer drawer1;
    private CanvasPanel canvasPanel1;

    public FigureView(){
        setVisible(true);
        setSize(500, 400);
        setContentPane(root);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void createUIComponents(){
        drawer1 = new Drawer();
        canvasPanel1 = new CanvasPanel();
    }


}
