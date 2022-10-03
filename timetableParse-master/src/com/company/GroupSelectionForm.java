package com.company;

import com.formdev.flatlaf.FlatDarkLaf;
import com.google.gson.Gson;
import java.util.List;
import java.util.Comparator;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class GroupSelectionForm extends JFrame {
    private JPanel root;
    JTextField inp_date, inp_group;
    JButton b_find, b_nextday, b_preday;
    DefaultListModel<String> lm;
    DefaultListModel<TimeTableLine> timeTableLineDefaultListModel;
    JList<TimeTableLine> timeTableLineJList;
    DateTimeFormatter dtf;
    LocalDate datenow;
    List<TimeTableLine> currentTimeTable;
    GroupSelectionForm() {
        setVisible(true);
        setContentPane(root);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(350, 300);

        dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        datenow = LocalDate.now();
        inp_date.setText(dtf.format(datenow));

        GroupSelectionForm.SetPreDay spd = new GroupSelectionForm.SetPreDay();
        b_preday.addActionListener(spd);
        GroupSelectionForm.SetNextDay snd = new GroupSelectionForm.SetNextDay();
        b_nextday.addActionListener(snd);

        inp_group.setText( "19ИТ-ПИ(б/о)ПИП-1");

        GroupSelectionForm.FindTT ftt = new GroupSelectionForm.FindTT();
        b_find.addActionListener(ftt);

        timeTableLineDefaultListModel = new DefaultListModel<TimeTableLine>();

       JsonExtractor extractor = new JsonExtractor(new Gson());
       currentTimeTable = extractor.getTimeTable("src/timetable1.json");
    }

    public  class FindTT implements ActionListener {
        public void actionPerformed(ActionEvent e) {
//            FlatDarkLaf.install();

            timeTableLineDefaultListModel.clear();
            currentTimeTable.stream()
                    .filter(timeTableLine -> timeTableLine.getGroupCode().equals(inp_group.getText()))
                    .filter(timeTableLine -> timeTableLine.getDay().equals(inp_date.getText()))
                    .sorted(new TimeComparator())
                    .forEach(timeTableLine -> timeTableLineDefaultListModel.addElement(timeTableLine));
            timeTableLineJList.setCellRenderer(new TTLineListViewRenderer());
            timeTableLineJList.setModel(timeTableLineDefaultListModel);
        }
    }

    public  class SetNextDay implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println(inp_date.getText());
            inp_date.setText(LocalDate.parse(inp_date.getText(), dtf).plusDays(1).format(dtf));
        }
    }

    public  class SetPreDay implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println(inp_date.getText());
            inp_date.setText(LocalDate.parse(inp_date.getText(), dtf).minusDays(1).format(dtf));
        }
    }

    public class TimeComparator implements Comparator<TimeTableLine> {
        public int compare(TimeTableLine a, TimeTableLine b){
            return a.getTimeStart().compareTo(b.getTimeStart());
        }
    }
}