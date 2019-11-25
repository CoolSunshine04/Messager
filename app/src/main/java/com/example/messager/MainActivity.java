package com.example.messager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onSendClick (View view) {
        EditText editText=(EditText)findViewById(R.id.editText);
        String messageText = editText.getText().toString();
        Intent Intent = new Intent(this,RecieveActivity.class);
        Intent.putExtra("message" ,messageText);
        startActivity(Intent);
        Log.d("DAROVA", "onSendClick");
    }
}
