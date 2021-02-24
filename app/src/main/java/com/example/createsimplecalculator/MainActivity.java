package com.example.createsimplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    EditText editTextFirst, editTextSecond;
    TextView result;
    Button AdditionButton,SubtractionButton,MultiplicationButton,DivisionButton;
    float firstValue,secondValue,resultValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextFirst = findViewById(R.id.editFirstNumber);
        editTextSecond = findViewById(R.id.editTwoNumber);
        AdditionButton = findViewById(R.id.addButton);
        SubtractionButton = findViewById(R.id.SubButton);
        MultiplicationButton = findViewById(R.id.multipButton);
        DivisionButton = findViewById(R.id.DivButton);
        result = findViewById(R.id.resultView);

        AdditionButton.setOnClickListener(this);
        SubtractionButton.setOnClickListener(this);
        MultiplicationButton.setOnClickListener(this);
        DivisionButton.setOnClickListener(this);

    }

    @SuppressLint({"SetTextI18n", "NonConstantResourceId"})
    @Override
    public void onClick(View v) {
        String option = editTextFirst.getText().toString();
        String option1 = editTextSecond.getText().toString();
        switch (v.getId())
        {
            case R.id.addButton:
                if (option.equals("")) {
                    Toast.makeText(getApplicationContext(),"Please Enter first Value ",Toast.LENGTH_SHORT).show();
                }
                if (option1.equals("")) {
                    Toast.makeText(getApplicationContext(),"Please Enter second Value ",Toast.LENGTH_SHORT).show();
                }
                else {
                    firstValue = Float.parseFloat(editTextFirst.getText().toString());
                    secondValue = Float.parseFloat(editTextSecond.getText().toString());
                    resultValue = firstValue + secondValue;
                    result.setText("Result is: " + resultValue);
                }
                break;

            case R.id.SubButton:
                if (option.equals("")) {
                    Toast.makeText(getApplicationContext(),"Please Enter first Value ",Toast.LENGTH_SHORT).show();
                }
                if (option1.equals("")) {
                    Toast.makeText(getApplicationContext(),"Please Enter second Value ",Toast.LENGTH_SHORT).show();
                }
                else {
                    firstValue = Float.parseFloat(editTextFirst.getText().toString());
                    secondValue = Float.parseFloat(editTextSecond.getText().toString());
                    resultValue = firstValue - secondValue;
                    result.setText("Result is: " + resultValue);
                }
                break;

            case R.id.multipButton:
                if (option.equals("")) {
                    Toast.makeText(getApplicationContext(),"Please Enter first Value ",Toast.LENGTH_SHORT).show();
                }
                if (option1.equals("")) {
                    Toast.makeText(getApplicationContext(),"Please Enter second Value ",Toast.LENGTH_SHORT).show();
                }
                else {
                    firstValue = Float.parseFloat(editTextFirst.getText().toString());
                    secondValue = Float.parseFloat(editTextSecond.getText().toString());
                    resultValue = firstValue * secondValue;
                    result.setText("Result is: " + resultValue);
                }
                break;

            case R.id.DivButton:
                if (option.equals("")) {
                    Toast.makeText(getApplicationContext(),"Please Enter first Value ",Toast.LENGTH_SHORT).show();
                }
                if (option1.equals("")) {
                    Toast.makeText(getApplicationContext(),"Please Enter second Value ",Toast.LENGTH_SHORT).show();
                }
                else {
                    firstValue = Float.parseFloat(editTextFirst.getText().toString());
                    secondValue = Float.parseFloat(editTextSecond.getText().toString());
                    resultValue = firstValue / secondValue;
                    result.setText("Result is: " + resultValue);
                }
                break;

        }
    }
}