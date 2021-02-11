package com.example.appmayar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import com.example.appmayar.Main2Activity;

public class MainActivity extends AppCompatActivity {


  /*  ListView list;

    String [] names= {"nouhaila","nadia"};*/


EditText tt = (EditText) findViewById(R.id.text1);


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* list=(ListView) findViewById(R.id.lista);

CustomAdapter adapter =new CustomAdapter(this,names);
    list.setAdapter(adapter);*/




    }

    public void btn(View view) {

        Intent intent =new Intent(MainActivity.this,Main2Activity.class);
        intent.putExtra("mssg",tt.getText().toString());
        startActivity(intent);
    }
}
