package com.example.coursera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView tv1, tv2, tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);

        String dato = getIntent().getStringExtra("dato");
        String dato1 = getIntent().getStringExtra("dato1");
        String dato2 = getIntent().getStringExtra("dato2");

        tv1.setText(dato);
        tv2.setText(dato1);
        tv3.setText(dato2);
    }

    // regresar

    public void regresar (View view){
        Intent r = new Intent(this, MainActivity.class);
        startActivity(r);

    }
}