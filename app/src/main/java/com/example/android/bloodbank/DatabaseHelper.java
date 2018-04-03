package com.example.android.bloodbank;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by vaasudevkala on 22/03/18.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "BloodBank_Project";
    float lat[];


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        SQLiteDatabase db=getWritableDatabase();

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL(BloodBankTable.CREATE_TABLE);
        sqLiteDatabase.execSQL(BloodGroupTable.CREATE_TABLE);
        sqLiteDatabase.execSQL(ResultTable.CREATE_TABLE);
        Log.d("HELPER","HELPER INITALISED");

    }


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+BloodBankTable.TABLE_NAME);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+BloodGroupTable.TABLE_NAME);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+ResultTable.TABLE_NAME);
        onCreate(sqLiteDatabase);
    }

    public void insertBank(String name,String address,Float longitude,Float latitude,String phone){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(BloodBankTable.BLOOD_BANK_NAME,name);
        values.put(BloodBankTable.ADDRESS,address);
        values.put(BloodBankTable.LONGITUDE,longitude);
        values.put(BloodBankTable.LATITUDE,latitude);
        values.put(BloodBankTable.PHONE,phone);

        long newRowId=db.insert(BloodBankTable.TABLE_NAME,null,values);
        db.close();
    }

    public void insertBloodGroup(String name)
    {
        SQLiteDatabase db=this.getReadableDatabase();
        ContentValues values=new ContentValues();
        values.put(BloodGroupTable.BLOOD_GROUP_NAME,name);

        long newRowId=db.insert(BloodBankTable.TABLE_NAME,null,values);

    }
public String show()
{
    SQLiteDatabase db = this.getReadableDatabase();
    Cursor cursor=db.rawQuery("SELECT * FROM " + BloodBankTable.TABLE_NAME ,null);
    cursor.moveToFirst();
    return cursor.getString(0)+cursor.getString(1)+cursor.getString(2);
}

public Bank[] getNearestBloodBanks(String bgid,Float ourlat)

{
//    SQLiteDatabase db=this.getReadableDatabase();
//    Cursor cursor1=db.rawQuery("SELECT latitude FROM "+BloodBankTable.TABLE_NAME,null);
//
//    int count=cursor1.getCount();
//    for(int i=0;i<=count;i++){
//        if(cursor1.moveToNext()){
//            lat[i]=cursor1.getFloat(0);
//        }
//
//
//    }
//
//    Float bbLat;
//    Double latChnageFactor=0.1;
//    Cursor cursor=db.rawQuery("SELECT * FROM "+ BloodBankTable.TABLE_NAME+" WHERE(id=(SELECT bbid from "+ResultTable.TABLE_NAME+" WHERE bgid ="+bgid+")"+" AND "+"("+ourlat+"-"+bbLat+"<"+latChnageFactor);

    return new Bank[0];
}



}
