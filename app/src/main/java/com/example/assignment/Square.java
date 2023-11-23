package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Square extends AppCompatActivity {

    EditText a,Ans;
    Button Calculate, OtherCalculator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);
        a=findViewById(R.id.textno);
        Calculate=findViewById(R.id.butn1);
        OtherCalculator=findViewById(R.id.butn2);
        Ans=findViewById(R.id.textNo);

        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(a.getText().toString());
                int Answer = (n1 * 4);
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