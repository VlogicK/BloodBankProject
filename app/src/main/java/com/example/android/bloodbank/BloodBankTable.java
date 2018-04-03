package com.example.android.bloodbank;

/**
 * Created by vaasudevkala on 22/03/18.
 */

public class BloodBankTable {
    public static final String TABLE_NAME= "blood_bank";
    public static final String ID="id";
    public static final String BLOOD_BANK_NAME="name";
    public static final String ADDRESS="address";
    public static final String LONGITUDE="longitude";
    public static final String LATITUDE="latiude";
    public static final String PHONE="phone";


    private int id;
    private String name;
    private String address;
    private Float longitude;
    private Float latitude;
    private String phone;




    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + BLOOD_BANK_NAME + " TEXT,"
                    + ADDRESS + "TEXT," +
                    LONGITUDE + "FLOAT," +
                    LATITUDE + "FLOAT," +
                    PHONE + "TEXT" +")";

    public BloodBankTable(int id, String name, String address, Float longitude, Float latitude, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.longitude = longitude;
        this.latitude = latitude;
        this.phone = phone;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
