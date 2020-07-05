package com.elvrylnd.tokoroti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class hasil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        Button button3=(Button)findViewById(R.id.button);
        button3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
// TODO Auto-generated method stub
                Intent i =new Intent(getApplicationContext(),menu.class);

                startActivity(i);


            }
        });

    }
}
