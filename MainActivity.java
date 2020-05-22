package com.example.fariha.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText op1, op2;
    TextView results;
    Button btnPlus, btnMinus, btnMult, btnDiv, btnclr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        op1 = findViewById(R.id.op1);
        op2 = findViewById(R.id.op2);
        results = findViewById(R.id.results);
        btnPlus = findViewById(R.id.AddButton);
        btnMinus = findViewById(R.id.MinusButton);
        btnMult = findViewById(R.id.MulButton);
        btnDiv = findViewById(R.id.DivButton);
        btnclr = findViewById(R.id.ClrButton);


    }

    public void Sub(View view) {
        String op1Str = op1.getText().toString();
        String op2Str = op2.getText().toString();


        if (!op1Str.equals("") && !op2Str.equals("")) {
            double operand1 = Double.parseDouble(op1Str);
            double operand2 = Double.parseDouble(op2Str);
            double Res = operand1 - operand2;
            results.setText("Results is : " + Res);
        } else
            results.setText("Plz Enter the values");

    }

    public void Add(View view) {
        String op1Str = op1.getText().toString();
        String op2Str = op2.getText().toString();


        if (!op1Str.equals("") && !op2Str.equals("")) {
            double operand1 = Double.parseDouble(op1Str);
            double operand2 = Double.parseDouble(op2Str);
            double Res = operand1 + operand2;
            results.setText("Results is : " + Res);
        } else
            results.setText("Plz Enter the values");
    }

    public void Mul(View view) {
        String op1Str = op1.getText().toString();
        String op2Str = op2.getText().toString();


        if (!op1Str.equals("") && !op2Str.equals("")) {
            double operand1 = Double.parseDouble(op1Str);
            double operand2 = Double.parseDouble(op2Str);
            double Res = operand1 * operand2;
            results.setText("Results is : " + Res);
        } else
            results.setText("Plz Enter the values");
    }

    public void Div(View view) {
        String op1Str = op1.getText().toString();
        String op2Str = op2.getText().toString();


        if (!op1Str.equals("") && !op2Str.equals("")) {
            double operand1 = Double.parseDouble(op1Str);
            double operand2 = Double.parseDouble(op2Str);
            double Res = operand1 / operand2;
            results.setText("Results is : " + Res);
        } else
            results.setText("Plz Enter the values");
    }

    public void clr(View view) {
        op1.setText("  ");
        op2.setText("  ");
        results.setText(" ");

    }
}