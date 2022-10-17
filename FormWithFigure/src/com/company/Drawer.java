package com.company;

import javax.swing.*;
import java.awt.*;

public class Drawer extends JPanel {

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(ColorPaleete.LIGHT_GREEN_500);
        g.fillOval(150,100,100,200);
        g.setColor(ColorPaleete.SUNNY);
        g.fillRect(10,10,500,400);
        g.setColor(ColorPaleete.DEEP_ORANGE_800);
        g.fillPolygon(new int[] {10, 20, 30}, new int[] {100, 20, 100}, 3);
    }
}
