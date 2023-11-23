package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Triangle extends AppCompatActivity {

    EditText a,b,c,Ans;
    Button Calculate, OtherCalculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);

        a=findViewById(R.id.textno);
        b=findViewById(R.id.textno2);
        c=findViewById(R.id.textno3);
        Calculate=findViewById(R.id.butn1);
        OtherCalculator=findViewById(R.id.butn2);
        Ans=findViewById(R.id.textNo);

        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(a.getText().toString());
                int n2 = Integer.parseInt(b.getText().toString());
                int n3 = Integer.parseInt(c.getText().toString());

                int Answer = (n1+n2+n3);
                Ans.setText("Perimeter "+Answer);
            }
        });
        OtherCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
}