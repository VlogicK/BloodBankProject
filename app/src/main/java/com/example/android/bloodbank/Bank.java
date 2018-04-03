package com.example.android.bloodbank;

/**
 * Created by vaasudevkala on 13/02/18.
 */

public class Bank {

    public String Address,ID,Lat,Long,Name,Phone1,Phone2;

    public Bank(){

    }

    public Bank(String address, String ID, String lat, String aLong, String name, String phone1, String phone2) {
        Address = address;
        this.ID = ID;
        Lat = lat;
        Long = aLong;
        Name = name;
        Phone1 = phone1;
        Phone2 = phone2;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getLat() {
        return Lat;
    }

    public void setLat(String lat) {
        Lat = lat;
    }

    public String getLong() {
        return Long;
    }

    public void setLong(String aLong) {
        Long = aLong;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone1() {
        return Phone1;
    }

    public void setPhone1(String phone1) {
        Phone1 = phone1;
    }

    public String getPhone2() {
        return Phone2;
    }

    public void setPhone2(String phone2) {
        Phone2 = phone2;
    }
}
