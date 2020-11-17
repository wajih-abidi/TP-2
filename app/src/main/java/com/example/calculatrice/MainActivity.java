package com.example.calculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button Add, Multiply, Substract, Divide;
    private EditText Val1, Val2;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Add = (Button) findViewById(R.id.add);
        Multiply = (Button) findViewById(R.id.multiply);
        Substract = (Button) findViewById(R.id.substract);
        Divide = (Button) findViewById(R.id.division);
        Val1 = (EditText) findViewById(R.id.Val1);
        Val2 = (EditText) findViewById(R.id.Val2);
        result = (TextView) findViewById(R.id.result);

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText((Float.parseFloat(Val1.getText().toString()) + Float.parseFloat(Val2.getText().toString())) + "");
            }
        });

        Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText((Float.parseFloat(Val1.getText().toString()) * Float.parseFloat(Val2.getText().toString())) + "");
            }
        });

        Substract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText((Float.parseFloat(Val1.getText().toString()) - Float.parseFloat(Val2.getText().toString())) + "");
            }
        });

        Divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Float.parseFloat(Val2.getText().toString()) == 0)
                {
                    Toast.makeText(getApplicationContext(), "On peut pas diviser sur 0", Toast.LENGTH_LONG).show();
                }
                else {
                    result.setText((Float.parseFloat(Val1.getText().toString()) / Float.parseFloat(Val2.getText().toString())) + "");
                }
            }
        });
    }
}