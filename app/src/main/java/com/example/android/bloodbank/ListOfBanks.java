package com.example.android.bloodbank;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ListOfBanks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        Intent intent= getIntent();
        String SelectedBloodGroup=intent.getStringExtra("BloodGroup");
        ActionBar actionbar=getSupportActionBar();
        actionbar.setTitle("Showing Blood Banks for "+SelectedBloodGroup);

    }
}
