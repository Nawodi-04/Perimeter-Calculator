package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button square;
    Button parallelogram;
    Button rectangle;
    Button  rhombus;
    Button trapezoid;
    Button triangle;
    Button circle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        square=findViewById(R.id.btn1);
        parallelogram=findViewById(R.id.btn2);
        rectangle=findViewById(R.id.btn3);
        rhombus=findViewById(R.id.btn4);
        trapezoid=findViewById(R.id.btn5);
        triangle=findViewById(R.id.btn6);
        circle=findViewById(R.id.btn7);

        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Square.class);
                startActivity(intent);
            }
        });

        parallelogram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Parallelogram.class);
                startActivity(intent);
            }
        });

        rectangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Rectangle.class);
                startActivity(intent);
            }
        });

        rhombus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Rhombus.class);
                startActivity(intent);
            }
        });

        trapezoid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Trapezoid.class);
                startActivity(intent);
            }
        });

        triangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Triangle.class);
                startActivity(intent);
            }
        });

        circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Circle.class);
                startActivity(intent);
            }
        });
    }
}