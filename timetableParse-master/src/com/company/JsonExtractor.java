package com.company;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class JsonExtractor {
    private final Gson gson;

    public JsonExtractor(Gson gson) {
        this.gson = gson;
    }

    public List<TimeTableLine> getTimeTable(String file) {
        List<TimeTableLine> timetableLines = new ArrayList<>();
        try {

            timetableLines = gson.fromJson(
                    new FileReader(file, StandardCharsets.UTF_8),
                    new TypeToken<ArrayList<TimeTableLine>>() {
                    }.getType()
            );

        } catch (IOException e) {
            e.printStackTrace();
        }
        return timetableLines;
    }

    public List<Group> getGroups(String file) {
        List<Group> timetableLines = new ArrayList<>();
        try {

            timetableLines = gson.fromJson(
                    new FileReader(file, StandardCharsets.UTF_8),
                    new TypeToken<ArrayList<Group>>() {
                    }.getType()
            );

        } catch (IOException e) {
            e.printStackTrace();
        }
        return timetableLines;
    }

}
