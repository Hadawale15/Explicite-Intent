package com.example.expliciteintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button obj1,obj2,obj3,obj4,obj5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        obj1=findViewById(R.id.button1);
        obj2=findViewById(R.id.button2);
        obj3=findViewById(R.id.button3);
        obj4=findViewById(R.id.button4);
        obj5=findViewById(R.id.button5);

        obj1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,FirstActivity.class);
                startActivity(intent);
            }
        });
        obj2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
        obj3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ThirdActivity.class);
                startActivity(intent);
            }
        });
        obj4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,FourthActivity.class);
                startActivity(intent);
            }
        });
        obj5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,FifthActivity.class);
                startActivity(intent);
            }
        });
    }
}