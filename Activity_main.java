package com.example.project_001;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int numOfPeople;
    float billAmount,result;
    float tip=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText et1 = (EditText)findViewById(R.id.editTextNumberDecimal);
        EditText et2 = (EditText)findViewById(R.id.editTextNumberDecimal2);
        TextView textView= (TextView)findViewById(R.id.textView4);
        EditText et3 = (EditText)findViewById(R.id.et3);
        Button b = (Button)findViewById(R.id.button2);



        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tip=Float.parseFloat(et3.getText().toString());
                numOfPeople = Integer.parseInt(et2.getText().toString());
                billAmount= Float.parseFloat(et1.getText().toString());
                result=(billAmount+tip)/numOfPeople;
                textView.setText("Bill amount per head is:"+result);

            }
        });


    }}
