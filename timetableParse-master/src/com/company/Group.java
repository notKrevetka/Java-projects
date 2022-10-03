package com.company;

import com.google.gson.annotations.SerializedName;

public class Group {
    @SerializedName("id")
    String id;
    @SerializedName("name")
    String name;

    public Group(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }
}
