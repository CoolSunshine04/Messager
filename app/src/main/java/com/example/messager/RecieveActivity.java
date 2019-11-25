package com.example.messager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RecieveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieve);

        Intent intent= getIntent();
        String str = intent.getStringExtra("message");
        TextView textView=(TextView)findViewById(R.id.textView);
        textView.setText(str);
    }



}
