package com.example.conversionchetanbasnetv1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Variables
    TextView introText, promptText,outputPrompt, outputKm;
    EditText inputMile;

    Button convertButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Using widgets
        introText = findViewById(R.id.introText);
        promptText = findViewById(R.id.promptText);
        outputPrompt = findViewById(R.id.outputPrompt);
        outputKm = findViewById(R.id.outputKm);

        inputMile = findViewById(R.id.inputMile);

        convertButton = findViewById(R.id.convertButton);

        //method for conversion
        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MilesToKm();
            }
        });



    }

    private void MilesToKm() {
        String inputValueMile = inputMile.getText().toString();

        //string to number
        double Mil = Double.parseDouble(inputValueMile);
        //conversion rate
        double Km = Mil * 1.609;

        outputKm.setText("" + Km);



    }
}