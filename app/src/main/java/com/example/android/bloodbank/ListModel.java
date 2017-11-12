package com.example.android.bloodbank;

/**
 * Created by vaasudevkala on 12/11/17.
 */

public class ListModel {

    private String BANK_NAME="";
    private String ADDRESS="";
    private String PHONE="";

    public ListModel() {
    }

    public ListModel(String BANK_NAME, String ADDRESS, String PHONE) {
        this.BANK_NAME = BANK_NAME;
        this.ADDRESS = ADDRESS;
        this.PHONE = PHONE;
    }

    public String getBANK_NAME() {
        return BANK_NAME;
    }

    public void setBANK_NAME(String BANK_NAME) {
        this.BANK_NAME = BANK_NAME;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public String getPHONE() {
        return PHONE;
    }

    public void setPHONE(String PHONE) {
        this.PHONE = PHONE;
    }
}
