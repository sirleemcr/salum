package com.example.cr_simple_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText num1;
    private EditText num2;
    private TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=(EditText) findViewById(R.id.num1);
        num2=(EditText) findViewById(R.id.num2);
        answer=(TextView) findViewById(R.id.answer);
    }

    public void modules(View view) {
        int numb1=Integer.parseInt(num1.getText().toString());
        int numb2=Integer.parseInt(num2.getText().toString());
        int ans=numb1%numb2;
        answer.setText(String.valueOf(ans));
    }

    public void divided(View view) {
        int numb1=Integer.parseInt(num1.getText().toString());
        int numb2=Integer.parseInt(num2.getText().toString());
        int ans=numb1/numb2;
        answer.setText(String.valueOf(ans));

    }

    public void minus(View view) {
        int numb1=Integer.parseInt(num1.getText().toString());
        int numb2=Integer.parseInt(num2.getText().toString());
        int ans=numb1-numb2;
        answer.setText(String.valueOf(ans));
    }

    public void plus(View view) {
        int numb1=Integer.parseInt(num1.getText().toString());
        int numb2=Integer.parseInt(num2.getText().toString());
        int ans=numb1+numb2;
        answer.setText(String.valueOf(ans));
    }

    public void multiplication(View view) {
        int numb1=Integer.parseInt(num1.getText().toString());
        int numb2=Integer.parseInt(num2.getText().toString());
        int ans=numb1*numb2;
        answer.setText(String.valueOf(ans));
    }

    public void power(View view) {
        int numb1=Integer.parseInt(num1.getText().toString());
        int numb2=Integer.parseInt(num2.getText().toString());
        double ans= Math.pow(numb1,numb2);
        answer.setText(String.valueOf(ans));

    }
}