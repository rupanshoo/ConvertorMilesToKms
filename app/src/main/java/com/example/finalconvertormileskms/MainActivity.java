package com.example.finalconvertormileskms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Miles to Kms
        Button buttonConvMilesToKms = (Button) findViewById(R.id.buttonMilestoKm);  //make variable for the miles to Km button
        buttonConvMilesToKms.setOnClickListener(new View.OnClickListener() {    //setting onClick listener so that on pressing the button, the computation happens
            @Override
            public void onClick(View view) {  //computation here
                EditText Miles = (EditText) findViewById(R.id.editTextMiles);  //variable to get the text for miles entered
                EditText KMs = (EditText) findViewById(R.id.editTextKMs);
                double vMiles = Double.valueOf(Miles.getText().toString());   //converting value of miles to double using string.
                double vkm = vMiles/0.62137;  //conversion math
                DecimalFormat formatVal = new DecimalFormat("#####.##"); //to get the desired form of the decimal number- in this case only 2 digits after the point.
                KMs.setText(formatVal.format(vkm)); //format vkm and put in KMs to display.

            }
        });

        //Kms to Miles
        Button buttonConvKmsToMiles = (Button) findViewById(R.id.buttonKmsToMiles);
        buttonConvKmsToMiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText Miles = (EditText) findViewById(R.id.editTextMiles);
                EditText KMs = (EditText) findViewById(R.id.editTextKMs);
                double VKMs = Double.valueOf(KMs.getText().toString());
                double VMiles = VKMs * 0.62137;
                DecimalFormat formatval = new DecimalFormat("#####.##");
                Miles.setText(formatval.format(VMiles));
            }
        });

    }
}