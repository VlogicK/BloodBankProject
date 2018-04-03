package com.example.android.bloodbank;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnSuccessListener;

import static java.lang.Math.abs;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{



    int BGID;
    float our_lat;
    private FusedLocationProviderClient mFusedLocationClient;


    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button dbc;
    Button ABpositive;
    Button ABnegative;
    String lati1;

    double lati,longi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFusedLocationClient = LocationServices.getFusedLocationProviderClient(this);
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }

        mFusedLocationClient.getLastLocation()
                .addOnSuccessListener(new OnSuccessListener<Location>() {
                    @Override
                    public void onSuccess(Location location) {

                        if(location!=null) {
                            longi = location.getLongitude();

                            lati = location.getLatitude();
                            lati1 = String.valueOf(lati);
                        }
                    }
                });

        Toast.makeText(this,lati1,Toast.LENGTH_SHORT).show();





        btn1 = (Button)findViewById(R.id.button1);
         btn2 = (Button)findViewById(R.id.button2);
         btn3 = (Button)findViewById(R.id.button3);
         btn4 = (Button)findViewById(R.id.button4);
         btn5 = (Button)findViewById(R.id.button5);
         btn6 = (Button)findViewById(R.id.button6);
         btn7=(Button)findViewById(R.id.button9);
         dbc=(Button) findViewById(R.id.dbc);
         ABpositive=(Button)findViewById(R.id.ABpositive);
         ABnegative=(Button)findViewById(R.id.ABnegative);

         ABnegative.setOnClickListener(this);
         ABpositive.setOnClickListener(this);
         dbc.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        DatabaseHelper databaseHelper=new DatabaseHelper(this);




    }

    @Override
    public void onClick(View view) {

        Intent intent = new Intent(this,ListOfBanks.class);

            switch(view.getId()){

                case R.id.button1:
                        BGID=0;
                        intent.putExtra("BloodGroup","A+");
                        intent.putExtra("bgid",BGID);
                        intent.putExtra("ourlat",our_lat);
                        startActivity(intent);
                            break;
                case R.id.button2:
                    BGID=1;
                    intent.putExtra("BloodGroup","A-");
                    intent.putExtra("bgid",BGID);
                    intent.putExtra("ourlat",our_lat);
                    startActivity(intent);
                    break;
                case R.id.button3:
                    BGID=2;
                    intent.putExtra("BloodGroup","B+");
                    intent.putExtra("bgid",BGID);
                    intent.putExtra("ourlat",our_lat);
                    startActivity(intent);
                        break;
                case R.id.button4:
                    BGID=3;
                    intent.putExtra("BloodGroup","B-");
                    intent.putExtra("bgid",BGID);
                    intent.putExtra("ourlat",our_lat);
                    startActivity(intent);
                        break;
                case R.id.button5:
                    BGID=6;
                    intent.putExtra("BloodGroup","O+");
                    intent.putExtra("bgid",BGID);
                    intent.putExtra("ourlat",our_lat);
                    startActivity(intent);
                        break;
                case R.id.button6:
                    BGID=7;
                    intent.putExtra("BloodGroup","O-");
                    intent.putExtra("bgid",BGID);
                    intent.putExtra("ourlat",our_lat);
                    startActivity(intent);
                        break;
                case R.id.button9:

                    Intent intent1=new Intent(this,DATAENTRY.class);
                     startActivity(intent1);
                     break;
                case R.id.dbc:
                    DatabaseHelper databaseHelper=new DatabaseHelper(this);
                    String dbc=databaseHelper.show();
                    Toast.makeText(this,dbc,Toast.LENGTH_LONG).show();
                    break;
                case R.id.ABpositive:
                    BGID=4;
                    intent.putExtra("BloodGroup","AB+");
                    intent.putExtra("bgid",BGID);
                    intent.putExtra("ourlat",our_lat);
                    startActivity(intent);
                    break;
                case R.id.ABnegative:
                    BGID=5;
                    intent.putExtra("BloodGroup","AB-");
                    intent.putExtra("bgid",BGID);
                    intent.putExtra("ourlat",our_lat);
                    startActivity(intent);
                    break;


            }




    }

}
