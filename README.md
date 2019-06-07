# Week1Daily3-Coding
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity"
    android:orientation="vertical">

    <TextView
        android:id="@+id/First"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"

        android:textSize="20sp"/>

    <EditText
        android:id="@+id/etFirst"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textSize="20sp"
        android:hint="Please enter first name"/>

    <TextView
        android:id="@+id/Last"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="20sp"/>

    <EditText
        android:id="@+id/etLast"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textSize="20sp"
        android:hint="Please enter last name"/>

    <TextView
        android:id="@+id/Street"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="20sp" />

    <EditText
        android:id="@+id/etStreet"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textSize="20sp"
        android:hint="Please enter street address"/>

    <TextView
        android:id="@+id/City"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="20sp"/>

    <EditText
        android:id="@+id/etCity"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textSize="20sp"
        android:hint="Please enter city"/>

    <TextView
        android:id="@+id/State"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="20sp"/>

    <EditText
        android:id="@+id/etState"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textSize="20sp"
        android:hint="Please enter state"/>

    <TextView
        android:id="@+id/Zip"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="20sp" />

    <EditText
        android:id="@+id/etZip"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textSize="20sp"
        android:hint="Please enter zip code"/>
    <Button
        android:id="@+id/Button"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="@string/submit"
        android:onClick="onclick"
        android:textSize="20sp" />

</LinearLayout>

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






![Screen Shot 2019-06-06 at 11 47 02 PM](https://user-images.githubusercontent.com/51377336/59080763-84824280-88b8-11e9-939b-f9943f91621d.png)
![image](https://user-images.githubusercontent.com/51377336/59080899-33bf1980-88b9-11e9-96c0-b781d9f4f529.png)
