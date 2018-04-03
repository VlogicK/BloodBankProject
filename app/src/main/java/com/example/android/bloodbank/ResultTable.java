package com.example.android.bloodbank;

/**
 * Created by vaasudevkala on 22/03/18.
 */

public class ResultTable {
    public static final String TABLE_NAME= "Result_table";
    public static final String ID="id";
    public static final String BGID="bgid";
    public static final String BBID="bbid";


    private int id;
    private int bgid;
    private int bbid;



    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + ID + " INTEGER PRIMARY KEY,"
                    + BGID + " INTEGER," + BBID + " INTEGER,"+
                    " FOREIGN KEY("+BGID+")"+" REFERENCES "+BloodGroupTable.TABLE_NAME+"("+BloodGroupTable.ID+"),"
                    +" FOREIGN KEY("+BBID+")"+" REFERENCES "+BloodBankTable.TABLE_NAME+"("+BloodBankTable.ID+")"+")";

    public ResultTable(int id, int bgid, int bbid) {
        this.id = id;
        this.bgid = bgid;
        this.bbid = bbid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBgid() {
        return bgid;
    }

    public void setBgid(int bgid) {
        this.bgid = bgid;
    }

    public int getBbid() {
        return bbid;
    }

    public void setBbid(int bbid) {
        this.bbid = bbid;
    }
}
