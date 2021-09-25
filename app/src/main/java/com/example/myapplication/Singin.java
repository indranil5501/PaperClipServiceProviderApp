package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

public class Singin extends AppCompatActivity {
    EditText enter_num;
    Button otp_bot;
    ProgressBar prgbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singin);

        //
        enter_num = findViewById(R.id.input_num);
        otp_bot =findViewById (R.id.otp_bot);
        prgbar= findViewById(R.id.prgbar_singin);

        otp_bot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!enter_num. getText (). toString().trim(). isEmpty()){
                    if((enter_num.getText().toString().trim()).length()==10){

                        prgbar.setVisibility(View.VISIBLE);
                        otp_bot.setVisibility(View.INVISIBLE);



                        //write here your code for fire base if not required ignore.



                      //Intent intent=new Intent(getApplicationContext(),Otpsingin.class);
                      //intent.putExtra("mobile",enter_num.getText().toString());
                      //startActivity(intent);

                    }else {
                        Toast.makeText(Singin.this, "Please enter correct number", Toast.LENGTH_SHORT).show();
                    }

                }else {
                    Toast.makeText(Singin.this, "Enter the number", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}