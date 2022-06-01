package com.company;

import com.google.gson.annotations.SerializedName;

public class TimeTableLine {
    @SerializedName("Discipline")
    String discipline;
    @SerializedName("DepartmentName")
    String departmentName;
    @SerializedName("DepartmentCode")
    String departmentCode;
    @SerializedName("GroupCode")
    String groupCode;
    @SerializedName("SemesterName")
    String semester;
    @SerializedName("Floor")
    String floor;
    @SerializedName("Building")
    String building;
    @SerializedName("Number")
    String number;
    @SerializedName("Type")
    String type;
    @SerializedName("TeacherFIO")
    String teacherFIO;
    @SerializedName("Room")
    String room;
    @SerializedName("dayDate")
    String day;
    @SerializedName("dayOfWeekName")
    String weekName;
    @SerializedName("TypeShort")
    String typeShort;
    @SerializedName("TimeStart")
    String timeStart;
    @SerializedName("TimeEnd")
    String timeEnd;

    public TimeTableLine(String discipline, String departmentCode, String departmentName, String groupCode, String floor, String building, String number, String type, String teacherFIO, String room, String day, String weekName, String typeShort, String timeStart, String timeEnd) {
        this.discipline = discipline;
        this.departmentCode = departmentCode;
        this.departmentName = departmentName;
        this.groupCode = groupCode;
        this.floor = floor;
        this.building = building;
        this.number = number;
        this.type = type;
        this.teacherFIO = teacherFIO;
        this.room = room;
        this.day = day;
        this.weekName = weekName;
        this.typeShort = typeShort;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
    }

    public String toString() {
        return this.timeStart + " " + this.getDiscipline() + " " + this.getRoom();
    }

    public String getDiscipline() {
        return discipline;
    }

    public TimeTableLine setDiscipline(String discipline) {
        this.discipline = discipline;
        return this;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public TimeTableLine setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
        return this;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public TimeTableLine setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
        return this;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public TimeTableLine setGroupCode(String groupCode) {
        this.groupCode = groupCode;
        return this;
    }

    public String getFloor() {
        return floor;
    }

    public TimeTableLine setFloor(String floor) {
        this.floor = floor;
        return this;
    }

    public String getBuilding() {
        return building;
    }

    public TimeTableLine setBuilding(String building) {
        this.building = building;
        return this;
    }

    public String getNumber() {
        return number;
    }

    public TimeTableLine setNumber(String number) {
        this.number = number;
        return this;
    }

    public String getType() {
        return type;
    }

    public TimeTableLine setType(String type) {
        this.type = type;
        return this;
    }

    public String getTeacherFIO() {
        return teacherFIO;
    }

    public TimeTableLine setTeacherFIO(String teacherFIO) {
        this.teacherFIO = teacherFIO;
        return this;
    }

    public String getRoom() {
        return room;
    }

    public TimeTableLine setRoom(String room) {
        this.room = room;
        return this;
    }

    public String getDay() {
        return day;
    }

    public TimeTableLine setDay(String day) {
        this.day = day;
        return this;
    }

    public String getWeekName() {
        return weekName;
    }

    public TimeTableLine setWeekName(String weekName) {
        this.weekName = weekName;
        return this;
    }

    public String getTypeShort() {
        return typeShort;
    }

    public TimeTableLine setTypeShort(String typeShort) {
        this.typeShort = typeShort;
        return this;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public TimeTableLine setTimeStart(String timeStart) {
        this.timeStart = timeStart;
        return this;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public TimeTableLine setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
        return this;
    }
}
