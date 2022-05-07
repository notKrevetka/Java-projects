package com.company;

import com.formdev.flatlaf.FlatDarkLaf;
import com.google.gson.Gson;

import java.util.Comparator;
import java.util.List;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class Main {
    JTextField inp_date, inp_group;
    JButton b_find, b_nextday, b_preday;
    DefaultListModel<String> lm;
    JList<String> l;
    DateTimeFormatter dtf;
    LocalDate datenow;

    Main() {
        // setup filters
        dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        datenow = LocalDate.now();

        // create GUI
        JFrame frame = new JFrame();

        // date input
        inp_date = new JTextField(dtf.format(datenow));
        inp_date.setBounds(50, 50, 100, 30);
        frame.add(inp_date);
        // pre day button
        b_preday = new JButton("пред.");
        b_preday.setBounds(160, 50, 70, 30);
        SetPreDay spd = new SetPreDay();
        b_preday.addActionListener(spd);
        frame.add(b_preday);
        // next day buton
        b_nextday = new JButton("след.");
        b_nextday.setBounds(240, 50, 70, 30);
        SetNextDay snd = new SetNextDay();
        b_nextday.addActionListener(snd);
        frame.add(b_nextday);

        // group input
        inp_group = new JTextField( "19ИТ-ПИ(б/о)ПИП-1");
        inp_group.setBounds(50, 100, 300, 30);
        frame.add(inp_group);
        // find button
        b_find = new JButton("Найти расписание");
        b_find.setBounds(50, 150, 300, 30);
        FindTT ftt = new FindTT();
        b_find.addActionListener(ftt);
        frame.add(b_find);

        lm = new DefaultListModel<String>();
        l = new JList<String>(lm);
        l.setBounds(50, 200, 600, 300);
        frame.add(l);

        frame.setSize(400, 600);

        frame.setLayout(null);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public class FindTT implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            JsonExtractor extractor = new JsonExtractor(new Gson());
            List<TimeTableLine> currentTimeTable = extractor.getTimeTable("src/timetable1.json");
            lm.clear();
            currentTimeTable.stream()
                    .filter(timeTableLine -> timeTableLine.getGroupCode().equals(inp_group.getText()))
                    .filter(timeTableLine -> timeTableLine.getDay().equals(inp_date.getText()))
                    .sorted(new TimeComparator())
                    .map(timeTableLine -> timeTableLine.toString())
                    .forEach(timeTableLine -> lm.addElement(timeTableLine));
        }
    }

    public class TimeComparator implements Comparator<TimeTableLine> {
        public int compare(TimeTableLine a, TimeTableLine b){
            return a.getTimeStart().compareTo(b.getTimeStart());
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

    public static void main(String[] args) {

        FlatDarkLaf.setup();
        new Main();
    }
}