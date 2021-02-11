package com.example.appmayar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
TextView nouha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        nouha=(TextView)findViewById(R.id.text3);

        String lola= this.getIntent().getExtras().getString("mssg");


        nouha.setText(lola);
    }
}
