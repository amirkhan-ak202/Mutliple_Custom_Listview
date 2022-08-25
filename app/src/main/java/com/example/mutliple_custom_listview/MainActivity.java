package com.example.mutliple_custom_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started");

        ListView mlistview = findViewById(R.id.listview);

        //create object of the Personinfo class
        Person_Info amir = new Person_Info("Amir khan","03-03-1996","Male");
        Person_Info ayaz = new Person_Info("Ayaz khan","03-03-1997","Male");
        Person_Info irshad = new Person_Info("Irshad khan","03-03-1998","Male");
        Person_Info numan = new Person_Info("Numan khan","03-03-1996","Male");
        Person_Info adil = new Person_Info("Adil khan","03-03-1996","Male");
        Person_Info mehboob = new Person_Info("Amir Mehboob","03-03-1996","Male");
        Person_Info umar = new Person_Info("Umar Farooq","03-03-1996","Male");
        Person_Info bakr = new Person_Info("Abu Bakr","03-03-1996","Male");
        Person_Info saad = new Person_Info("Muhammad Saad","03-03-1996","Male");
        Person_Info ubaid = new Person_Info("Abu Ubaida","03-03-1996","Male");
        Person_Info naeem = new Person_Info("Naeem khan","03-03-1991","Male");
        Person_Info khan = new Person_Info("Saqib khan","03-03-1989","Male");
        Person_Info saleem = new Person_Info("Saleem khan","03-03-1988","Male");

        //create arraylist
        ArrayList<Person_Info> poplist =new ArrayList();
        poplist.add(amir);
        poplist.add(ayaz);
        poplist.add(irshad);
        poplist.add(numan);
        poplist.add(adil);
        poplist.add(mehboob);
        poplist.add(umar);
        poplist.add(bakr);
        poplist.add(saad);
        poplist.add(ubaid);
        poplist.add(naeem);
        poplist.add(khan);
        poplist.add(saleem);

        ArrayCustomAdapter adapter = new ArrayCustomAdapter(this,R.layout.customview_layout,poplist);
        mlistview.setAdapter(adapter);



    }
}