package com.example.moregui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox cbInt = findViewById(R.id.cbInt);
        CheckBox cbString = findViewById(R.id.cbString);
        CheckBox cbDoube = findViewById(R.id.cbDouble);

        Button btnKetqua = findViewById(R.id.button);
        Button btnGoiy = findViewById(R.id.button2);

        btnKetqua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbString.isChecked()){
                    Toast.makeText(getApplicationContext(),"Ban da dung!",Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(getApplicationContext(),"Ban da sai!",Toast.LENGTH_LONG).show();
                }
            }
        });

        btnGoiy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cbString.setChecked(true);
            }
        });


    }
}