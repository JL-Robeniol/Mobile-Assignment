package com.example.assigment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText chosenmenu;
    Button bntna;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bntna=findViewById(R.id.todisplay);
        chosenmenu=findViewById(R.id.chosenmenu);




        bntna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=getIntent();
                Bundle bundle=intent.getExtras();
                String message=bundle.get("contain").toString();
                String connum=bundle.get("number").toString();


        if (chosenmenu.getText().toString().equals(connum)){
            Intent todis=new Intent(MainActivity.this,display.class);
            todis.putExtra("contain",message.toString());
            startActivity(todis);

        }
        else{

            Toast.makeText(MainActivity.this,"Invalid Input",Toast.LENGTH_SHORT).show();
        }
            }
        });


    }
    public void btntomenu(View view){
        startActivity(new Intent(MainActivity.this,menuselection.class ));

    }

}
