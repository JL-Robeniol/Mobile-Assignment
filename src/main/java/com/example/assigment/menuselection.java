package com.example.assigment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menuselection extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuselection);

        Button btnmenu1=findViewById(R.id.btnmenu1);
        Button btnmenu2=findViewById(R.id.btnmenu2);
        Button btnmenu3=findViewById(R.id.btnmenu3);
        Button btnmenu4=findViewById(R.id.btnmenu4);
        btnmenu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String containier ="-Php \n-Java";
                String num="1";
                Intent intent=new Intent(menuselection.this,MainActivity.class);
                intent.putExtra("contain",containier.toString());
                intent.putExtra("number",num.toString());
                startActivity(intent);
            }
        });
        btnmenu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String containier ="-C \n-C++";
                String num="2";
                Intent intent=new Intent(menuselection.this,MainActivity.class);
                intent.putExtra("contain",containier.toString());
                intent.putExtra("number",num.toString());
                startActivity(intent);
            }
        });
        btnmenu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String containier ="-JavaScript \n-HTML";
                String num="3";
                Intent intent=new Intent(menuselection.this,MainActivity.class);
                intent.putExtra("contain",containier.toString());
                intent.putExtra("number",num.toString());
                startActivity(intent);
            }
        });
        btnmenu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String contanier ="-Dart \n-Flutter";
                String num="4";
                Intent intent=new Intent(menuselection.this,MainActivity.class);
                intent.putExtra("contain",contanier.toString());
                intent.putExtra("number",num.toString());
                startActivity(intent);
            }
        });
    }



}
