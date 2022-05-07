package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class GroupSelectionForm extends JFrame {
    private JPanel root;
    private JComboBox<Group> comboBox1;
    private JLabel groupLabel;

    public GroupSelectionForm(List<Group> groupList) {
        setContentPane(root);
        for (Group group : groupList) {
            comboBox1.addItem(group);
        }
        comboBox1.addActionListener(e -> groupLabel.setText(
                ((Group)comboBox1.getSelectedItem()).getId()
        ));
        setVisible(true);
        pack();
    }
}
