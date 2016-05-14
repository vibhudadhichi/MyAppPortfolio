package com.example.vibhu.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        Toast.makeText(MainActivity.this,
                "This button will launch my Popular movies app!", Toast.LENGTH_SHORT).show();
    }
    public void sendMessage2(View view) {
        Toast.makeText(MainActivity.this,
                "This button will launch my Stock Hawk app!", Toast.LENGTH_SHORT).show();
    }
    public void sendMessage3(View view) {
        Toast.makeText(MainActivity.this,
                "This button will launch my Build it Bigger app!", Toast.LENGTH_SHORT).show();
    }
    public void sendMessage4(View view) {
        Toast.makeText(MainActivity.this,
                "This button will launch my Make Your App Material app!", Toast.LENGTH_SHORT).show();
    }
    public void sendMessage5(View view) {
        Toast.makeText(MainActivity.this,
                "This button will launch my Go Ubiquitous app!", Toast.LENGTH_SHORT).show();
    }
    public void sendMessage6(View view) {
        Toast.makeText(MainActivity.this,
                "This button will launch my Capstone app!", Toast.LENGTH_SHORT).show();
    }
}
