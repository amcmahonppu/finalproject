package com.example.boston;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import java.text.DecimalFormat;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView1;
    EditText ageInput;
    EditText paceInput;
    Button calculateButton;

    int age;
    int pace;
    String gender;

    int time1Male = 185;
    int time2Male = 190;
    int time3Male = 195;
    int time4Male = 205;
    int time5Male = 210;
    int time6Male = 220;
    int time7Male = 235;
    int time8Male = 250;
    int time9Male = 265;
    int time10Male = 280;
    int time11Male = 295;

    int time1Female = 215;
    int time2Female = 220;
    int time3Female = 225;
    int time4Female = 235;
    int time5Female = 240;
    int time6Female = 250;
    int time7Female = 265;
    int time8Female = 280;
    int time9Female = 295;
    int time10Female = 310;
    int time11Female = 325;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = findViewById(R.id.radioGroup);
        ageInput = (EditText) findViewById(R.id.ageInput);
        paceInput = (EditText) findViewById(R.id.paceInput);
        calculateButton = (Button) findViewById(R.id.calculateButton);
        textView1 = (TextView) findViewById(R.id.textView1);


        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                age = Integer.valueOf(ageInput.getText().toString());
                pace = Integer.valueOf(paceInput.getText().toString());
                double doublePace = Double.valueOf(pace);
                double totalTime = (doublePace * 26.2);
                DecimalFormat precision = new DecimalFormat("0.00");

                int radioId = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(radioId);

                if(radioButton.getText().toString().equals("Male") && radioButton.isChecked()){
                    if(age >= 18 && age<= 34){
                      if(totalTime <= time1Male){
                          textView1.setText("Congratulations! You have qualified for the boston marathon");
                      }else{
                          textView1.setText("Unfortunately this pace will not qualify your for Boston. You need to lose " + precision.format((totalTime - time1Male)) + " minutes to qualify");
                      }
                    }else if(age >= 35 && age<= 39){
                        if(totalTime <= time2Male){
                            textView1.setText("Congratulations! You have qualified for the boston marathon");
                        }else{
                            textView1.setText("Unfortunately this pace will not qualify your for Boston. You need to lose " + precision.format((totalTime - time2Male)) + " minutes to qualify");
                        }
                    }else if(age >= 40 && age<= 44) {
                        if(totalTime <= time3Male){
                            textView1.setText("Congratulations! You have qualified for the boston marathon");
                        }else{
                            textView1.setText("Unfortunately this pace will not qualify your for Boston. You need to lose " + precision.format((totalTime - time3Male)) + " minutes to qualify");
                        }
                    }else if(age >= 45 && age<= 49){
                        if(totalTime <= time4Male){
                            textView1.setText("Congratulations! You have qualified for the boston marathon");
                        }else{
                            textView1.setText("Unfortunately this pace will not qualify your for Boston. You need to lose " + precision.format((totalTime - time4Male)) + " minutes to qualify");
                        }
                    }else if(age >= 50 && age<= 54){
                        if(totalTime <= time5Male){
                            textView1.setText("Congratulations! You have qualified for the boston marathon");
                        }else{
                            textView1.setText("Unfortunately this pace will not qualify your for Boston. You need to lose " + precision.format((totalTime - time5Male)) + " minutes to qualify");
                        }
                    }else if(age >= 55 && age<= 59){
                        if(totalTime <= time6Male){
                            textView1.setText("Congratulations! You have qualified for the boston marathon");
                        }else{
                            textView1.setText("Unfortunately this pace will not qualify your for Boston. You need to lose " + precision.format((totalTime - time6Male)) + " minutes to qualify");
                        }
                    }else if(age >= 60 && age<= 64){
                        if(totalTime <= time7Male){
                            textView1.setText("Congratulations! You have qualified for the boston marathon");
                        }else{
                            textView1.setText("Unfortunately this pace will not qualify your for Boston. You need to lose " + precision.format((totalTime - time7Male)) + " minutes to qualify");
                        }
                    }else if(age >= 65 && age<= 69){
                        if(totalTime <= time8Male){
                            textView1.setText("Congratulations! You have qualified for the boston marathon");
                        }else{
                            textView1.setText("Unfortunately this pace will not qualify your for Boston. You need to lose " + precision.format((totalTime - time8Male)) + " minutes to qualify");
                        }
                    }else if(age >= 70 && age<= 74){
                        if(totalTime <= time9Male){
                            textView1.setText("Congratulations! You have qualified for the boston marathon");
                        }else{
                            textView1.setText("Unfortunately this pace will not qualify your for Boston. You need to lose " + precision.format((totalTime - time9Male)) + " minutes to qualify");
                        }
                    }else if(age >= 75 && age<= 79){
                        if(totalTime <= time10Male){
                            textView1.setText("Congratulations! You have qualified for the boston marathon");
                        }else{
                            textView1.setText("Unfortunately this pace will not qualify your for Boston. You need to lose " + precision.format((totalTime - time10Male)) + " minutes to qualify");
                        }
                    }else if(age>=80){
                        if(totalTime <= time11Male){
                            textView1.setText("Congratulations! You have qualified for the boston marathon");
                        }else{
                            textView1.setText("Unfortunately this pace will not qualify your for Boston. You need to lose " + precision.format((totalTime - time11Male)) + " minutes to qualify");
                        }
                    }
                }else if(radioButton.getText().toString().equals("Female") && radioButton.isChecked()){
                    if(age >= 18 && age<= 34){
                        if(totalTime <= time1Female){
                            textView1.setText("Congratulations! You have qualified for the boston marathon");
                        }else{
                            textView1.setText("Unfortunately this pace will not qualify your for Boston. You need to lose " + precision.format((totalTime - time1Female)) + " minutes to qualify");
                        }
                    }else if(age >= 35 && age<= 39){
                        if(totalTime <= time2Female){
                            textView1.setText("Congratulations! You have qualified for the boston marathon");
                        }else{
                            textView1.setText("Unfortunately this pace will not qualify your for Boston. You need to lose " + precision.format((totalTime - time2Female)) + " minutes to qualify");
                        }
                    }else if(age >= 40 && age<= 44) {
                        if(totalTime <= time3Female){
                            textView1.setText("Congratulations! You have qualified for the boston marathon");
                        }else{
                            textView1.setText("Unfortunately this pace will not qualify your for Boston. You need to lose " + precision.format((totalTime - time3Female)) + " minutes to qualify");
                        }
                    }else if(age >= 45 && age<= 49){
                        if(totalTime <= time4Female){
                            textView1.setText("Congratulations! You have qualified for the boston marathon");
                        }else{
                            textView1.setText("Unfortunately this pace will not qualify your for Boston. You need to lose " + precision.format((totalTime - time4Female)) + " minutes to qualify");
                        }
                    }else if(age >= 50 && age<= 54){
                        if(totalTime <= time5Female){
                            textView1.setText("Congratulations! You have qualified for the boston marathon");
                        }else{
                            textView1.setText("Unfortunately this pace will not qualify your for Boston. You need to lose " + precision.format((totalTime - time5Female)) + " minutes to qualify");
                        }
                    }else if(age >= 55 && age<= 59){
                        if(totalTime <= time6Female){
                            textView1.setText("Congratulations! You have qualified for the boston marathon");
                        }else{
                            textView1.setText("Unfortunately this pace will not qualify your for Boston. You need to lose " + precision.format((totalTime - time6Female)) + " minutes to qualify");
                        }
                    }else if(age >= 60 && age<= 64){
                        if(totalTime <= time7Female){
                            textView1.setText("Congratulations! You have qualified for the boston marathon");
                        }else{
                            textView1.setText("Unfortunately this pace will not qualify your for Boston. You need to lose " + precision.format((totalTime - time7Female)) + " minutes to qualify");
                        }
                    }else if(age >= 65 && age<= 69){
                        if(totalTime <= time8Female){
                            textView1.setText("Congratulations! You have qualified for the boston marathon");
                        }else{
                            textView1.setText("Unfortunately this pace will not qualify your for Boston. You need to lose " + precision.format((totalTime - time8Female)) + " minutes to qualify");
                        }
                    }else if(age >= 70 && age<= 74){
                        if(totalTime <= time9Female){
                            textView1.setText("Congratulations! You have qualified for the boston marathon");
                        }else{
                            textView1.setText("Unfortunately this pace will not qualify your for Boston. You need to lose " + precision.format((totalTime - time9Female)) + " minutes to qualify");
                        }
                    }else if(age >= 75 && age<= 79){
                        if(totalTime <= time10Female){
                            textView1.setText("Congratulations! You have qualified for the boston marathon");
                        }else{
                            textView1.setText("Unfortunately this pace will not qualify your for Boston. You need to lose " + precision.format((totalTime - time10Female)) + " minutes to qualify");
                        }
                    }else if(age>=80){
                        if(totalTime <= time11Female){
                            textView1.setText("Congratulations! You have qualified for the boston marathon");
                        }else{
                            textView1.setText("Unfortunately this pace will not qualify your for Boston. You need to lose " + precision.format((totalTime - time11Female)) + " minutes to qualify");
                        }
                    }
                }
            };
        });
    }


    private void showToast(String text) {
        Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
    }


    public void rbclick(View view) {
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);

        Toast.makeText(getBaseContext(), radioButton.getText(), Toast.LENGTH_LONG).show();

    }
}