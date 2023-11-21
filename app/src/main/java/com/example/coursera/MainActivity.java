package com.example.coursera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etn, ett, ete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etn = (EditText) findViewById(R.id.txt_nombre);
        ett = (EditText) findViewById(R.id.txt_telefono);
        ete = (EditText) findViewById(R.id.txt_email);
    }

    // boton

    public void registrar (View view){
        Intent i = new Intent(this, MainActivity2.class);
        i.putExtra("dato",etn.getText().toString());
        i.putExtra("dato1",ett.getText().toString());
        i.putExtra("dato2",ete.getText().toString());

        startActivity(i);


    }
}