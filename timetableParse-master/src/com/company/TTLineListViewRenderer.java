package com.company;

import javax.swing.*;
import java.awt.*;

public class TTLineListViewRenderer extends JLabel implements ListCellRenderer<TimeTableLine> {
    public TTLineListViewRenderer() {
        setOpaque(true);
        Font oldFont = getFont();

        setFont(oldFont.deriveFont(Font.PLAIN, 24));
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends TimeTableLine> list, TimeTableLine currentTimeTableLine, int index, boolean isSelected, boolean cellHasFocus) {
        System.out.print(1);
        if(isSelected){
            setBackground(MaterialColors.ORANGE_500);
            setForeground(MaterialColors.BLUE_GRAY_600);
        }else{
            setBackground(MaterialColors.BLACK);
            setForeground(MaterialColors.GREEN_A400);
        }
        setText(currentTimeTableLine.toString());
        return this;
    }
}
