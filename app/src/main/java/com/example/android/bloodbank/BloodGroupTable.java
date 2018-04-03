package com.example.android.bloodbank;

/**
 * Created by vaasudevkala on 22/03/18.
 */

public class BloodGroupTable {

    public static final String TABLE_NAME= "blood_groups";
    public static final String ID="id";
    public static final String BLOOD_GROUP_NAME="name";

    private int id;
    private String name;

    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + BLOOD_GROUP_NAME + "TEXT" + ")";

    public BloodGroupTable(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
