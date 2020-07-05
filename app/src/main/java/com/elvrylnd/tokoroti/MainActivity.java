package com.elvrylnd.tokoroti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1=(Button)findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
// TODO Auto-generated method stub
                Intent i =new Intent(getApplicationContext(),menu.class);

                startActivity(i);
            }
        });
    }
}