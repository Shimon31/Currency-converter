package com.example.lab_evaluation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText1, editText2,editText3;
    TextView textView1;

    String Show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.height);
        editText2 = findViewById(R.id.weight);
        editText3 = findViewById(R.id.insert);

        textView1 = findViewById(R.id.result);

    }



    public void usd(View view) {

        String dollar = editText3.getText().toString();
        double dollarConvert = Double.parseDouble(dollar);
        double result = dollarConvert*94.70;
         Show = "Result = " + result;
        textView1.setText(Show);


    }

    public void euro(View view) {

        String dollar = editText3.getText().toString();
        double dollarConvert = Double.parseDouble(dollar);
        double result = dollarConvert*94.52;
        Show = "Result = " + result;
        textView1.setText(Show);



    }

    public void ruppe(View view) {

        String dollar = editText3.getText().toString();
        double dollarConvert = Double.parseDouble(dollar);
        double result = dollarConvert*1.19;
        Show = "Result = " + result;
        textView1.setText(Show);
    }



    public void calculateBmi(View view) {
    }
}