package com.example.android.bloodbank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         btn1 = (Button)findViewById(R.id.button1);
         btn2 = (Button)findViewById(R.id.button2);
         btn3 = (Button)findViewById(R.id.button3);
         btn4 = (Button)findViewById(R.id.button4);
         btn5 = (Button)findViewById(R.id.button5);
         btn6 = (Button)findViewById(R.id.button6);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {

        Intent intent = new Intent(this,ListOfBanks.class);

            switch(view.getId()){

                case R.id.button1:
                        intent.putExtra("BloodGroup","A+");
                        startActivity(intent);
                            break;
                case R.id.button2:
                    intent.putExtra("BloodGroup","A-");
                    startActivity(intent);
                    break;
                case R.id.button3:
                    intent.putExtra("BloodGroup","B+");
                    startActivity(intent);
                        break;
                case R.id.button4:
                    intent.putExtra("BloodGroup","B-");
                    startActivity(intent);
                        break;
                case R.id.button5:
                    intent.putExtra("BloodGroup","O+");
                    startActivity(intent);
                        break;
                case R.id.button6:
                    intent.putExtra("BloodGroup","O-");
                    startActivity(intent);
                        break;

            }




    }
}
