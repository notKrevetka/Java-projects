package com.company;
import javax.swing.*;
import java.awt.*;


public class CanvasPanel extends JPanel {
    private int height=100,width=100;

    public void setHeight(int h) {
        height = h;
        repaint();
    }

    public void setWidth(int w) {
        width = w;
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.orange);
        g.drawLine(100, 300, 100, 300 - height);
        if (height > 50) {
            g.setColor(Color.orange.darker().darker());
            g.drawLine(100, 300, 100, 450);
        }
        g.setColor(Color.green.darker());
        int f1 = 1, f2 = 1, ft, top = 300 - height;
        while (true) {
            top += f1;
            ft = f1;
            f1 += f2;
            f2 = ft;
            if (top > 650) {
                break;
            }
        }
        float tgg = width / 2;
        tgg /= (height - 300 + top);
        if (tgg > 0 && tgg < 1) {
            System.out.println(tgg);
            f1 = 1;
            f2 = 1;
            top = 300-height;
            while (true) {
                top += f1;
                ft = f1;
                f1 += f2;
                f2 = ft;
                System.out.println(top);
                if (top < 350) {
                    g.drawLine(100, top, (int) (100 + (-300 + height + top) * tgg), 300 + height);
                    g.drawLine(100, top, (int) (100 - (-300 + height + top) * tgg), 300 + height);
                } else {
                    break;
                }
            }
        }
    }
}
