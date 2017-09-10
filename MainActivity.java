package com.example.neet.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("called onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("called onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("called onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("called onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("called onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("called onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("called onDestory");
    }
}
