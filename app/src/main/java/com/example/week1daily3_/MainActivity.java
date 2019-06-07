package com.example.week1daily3_;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvFirst;
    TextView tvLast;
    TextView tvAddress;
    TextView tvCity;
    TextView tvState;
    TextView tvZip;
    EditText etFirst;
    EditText etLast;
    EditText etAddress;
    EditText etCity;
    EditText etState;
    EditText etZip;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvFirst = findViewById(R.id.First);
        etFirst = findViewById(R.id.etFirst);
        tvLast = findViewById(R.id.Last);
        etLast = findViewById(R.id.etLast);
        tvAddress = findViewById(R.id.Street);
        etAddress = findViewById(R.id.etStreet);
        tvCity = findViewById(R.id.City);
        etCity = findViewById(R.id.etCity);
        tvState = findViewById(R.id.State);
        etState = findViewById(R.id.etState);
        tvZip = findViewById(R.id.Zip);
        etZip = findViewById(R.id.etZip);

    }

    public void onclick(View view) {
        String userFirst = etFirst.getText().toString();
        tvFirst.setText(userFirst);

        String userLast = etLast.getText().toString();
        tvLast.setText(userLast);

        String userAddress = etAddress.getText().toString();
        tvAddress.setText(userAddress);

        String userCity = etCity.getText().toString();
        tvCity.setText(userCity);

        String userState = etState.getText().toString();
        tvState.setText(userState);

        String userZip = etZip.getText().toString();
        tvZip.setText(userZip);




    }
}

class Person {
    String first_name;
    String last_name;
    String street_address;
    String city;
    String state;
    String zip;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getStreet_address() {
        return street_address;
    }

    public void setStreet_address(String street_address) {
        this.street_address = street_address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getZip() {
        return zip;
    }
}



