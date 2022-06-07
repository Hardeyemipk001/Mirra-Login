package com.example.mirra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void signUpNav(View view) {
        Intent intent = new Intent(this,sign_up.class );
        startActivity(intent);
    }
    public void loginNav(View view){
        Intent intent1 = new Intent(this,login.class);
        startActivity(intent1);
    }
}