package com.example.android.bloodbank;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import static java.lang.Math.abs;

//import com.google.firebase.FirebaseApp;
//import com.google.firebase.database.DataSnapshot;
//import com.google.firebase.database.DatabaseError;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
//import com.google.firebase.database.ValueEventListener;
//import com.google.firebase.database.FirebaseDatabase.*;





public class ListOfBanks extends AppCompatActivity {

    DatabaseHelper databaseHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_list_view);
        databaseHelper=new DatabaseHelper(this);
//        FirebaseDatabase database = FirebaseDatabase.getInstance();
//        DatabaseReference myRef = database.getReference("root");






        Intent intent= getIntent();
        String SelectedBloodGroup=intent.getStringExtra("BloodGroup");
        String bgid=intent.getStringExtra("bgid");
        Float ourLat=Float.parseFloat(intent.getStringExtra("ourlat"));
        ActionBar actionbar=getSupportActionBar();
        actionbar.setTitle("Showing Blood Banks for "+SelectedBloodGroup);
        //WE WILL CALL THE FUNCTION IN DATABASE HELPER TO GET NEAREST BLOODBANK
        Bank nearestArray[] = databaseHelper.getNearestBloodBanks(bgid,ourLat);




    }
    public boolean checkdistance(float ourlat,float bblat)
    {
        if (abs(ourlat-bblat)<0.1)
        {
            return true;
        }
        else return false;
    }
}
