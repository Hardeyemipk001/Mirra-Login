package com.example.mirra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;

public class login extends AppCompatActivity {

    boolean passwordvisible;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        password = findViewById(R.id.password_toggle);

        password.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                final int Right=2;
                if(event.getAction()==MotionEvent.ACTION_UP){
                    if(event.getRawX()>=password.getRight()-password.getCompoundDrawables()[Right].getBounds().width()){
                        int selection=password.getSelectionEnd();
                        if(passwordvisible){
                            // set drawable image here
                            password.setCompoundDrawablesRelativeWithIntrinsicBounds(0,0,R.drawable.ic_visibility_off,0);
                            // for hide password
                            password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            passwordvisible=false;
                        } else{
                            //set drawable image here
                            password.setCompoundDrawablesRelativeWithIntrinsicBounds(0,0,R.drawable.ic_visibility,0);
                            // for show password
                            password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                            passwordvisible=true;
                        }
                        password.setSelection(selection);
                    }
                    return true;
                }

                return false;
            }
        });



    }


    public void signUpNav(View view) {
        Intent intent =new Intent(this,sign_up.class);
        startActivity(intent);

    }
}