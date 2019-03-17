package com.example.fragment_lec6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class AlldataActivity extends AppCompatActivity {
TextView name, mail, birth;
    private static final String TAG = "AlldataActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alldata);
        name = findViewById(R.id.nameinfo);
        mail = findViewById(R.id.mailinfo);
        birth = findViewById(R.id.birthinfo);

        Intent intent = getIntent();
        name.setText(intent.getStringExtra("name"));
        Log.i(TAG, "onCreate: "+intent.getStringExtra("name"));
        mail.setText(intent.getStringExtra("mail"));
        birth.setText(intent.getStringExtra("dateString"));

    }
}
