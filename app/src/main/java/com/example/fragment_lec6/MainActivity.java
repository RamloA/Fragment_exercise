package com.example.fragment_lec6;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.security.PublicKey;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    public static final String NAME = "Name";


    String name, mail;
    EditText ET;
    DatePicker date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ET = findViewById(R.id.ET);
    }

   public void Changefragment(View view){

        if(view == findViewById(R.id.Name)){
            Log.i(TAG, "Changefragment: 1");
            Fragment fragment = new nameFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.replace(R.id.fragment_main, fragment);
            transaction.commit();
        }

       if(view == findViewById(R.id.Email)){
           Log.i(TAG, "Changefragment: 2");
           EditText et = findViewById(R.id.ET);
           name = et.getText().toString();
           Log.i(TAG, "Changefragment: "+name);
           Fragment fragment = new nameFragment();
           FragmentManager fragmentManager = getSupportFragmentManager();
           FragmentTransaction transaction = fragmentManager.beginTransaction();
           transaction.replace(R.id.fragment_main, fragment);
           transaction.commit();

       }

       if(view == findViewById(R.id.Birth)){
           Log.i(TAG, "Changefragment: 3");
           EditText et = findViewById(R.id.ET);
           mail = et.getText().toString();
           Log.i(TAG, "Changefragment: "+mail);
           Fragment fragment = new BirthFragment();
           FragmentManager fragmentManager = getSupportFragmentManager();
           FragmentTransaction transaction = fragmentManager.beginTransaction();
           transaction.replace(R.id.fragment_main, fragment);
           transaction.commit();
       }
    }

    public void Submit(View view){
        date = findViewById(R.id.datePicker);
        int day = date.getDayOfMonth();
        int month = date.getMonth()+1;
        int year = date.getYear();
        String dateString = ""+String.valueOf(day)+"-"+String.valueOf(month)+"-"+String.valueOf(year);
        Intent intent = new Intent(this, AlldataActivity.class);
        intent.putExtra("name", name);
        intent.putExtra("mail", mail);
        intent.putExtra("dateString", dateString);
        startActivity(intent);

    }


}
