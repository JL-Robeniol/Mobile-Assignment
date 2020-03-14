package com.example.assigment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class display extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        TextView todis=findViewById(R.id.displaytext);
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        String display= bundle.get("contain").toString();


        todis.setText(display);
    }
}
