package com.example.practica2sandraramirez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edname;
    String nameUser;
    Button miboton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        miboton = findViewById(R.id.et_aceptar);

        miboton.setOnClickListener(clik);

    }

    View.OnClickListener clik = new View.OnClickListener(){
        public void onClick (View view){


            edname = findViewById(R.id.et_name);
            nameUser = String.valueOf(edname.getText());
            Intent in = new Intent ( MainActivity.this,MainActivity2.class);
            in.putExtra( "usuario",nameUser);
            startActivity(in);

            /*edname = findViewById(R.id.et_name);
            String nombre = String.valueOf(edname.getText());
            Toast.makeText(this, "Hola "+nombre, Toast.LENGTH_SHORT).show();*/

        }
    };


    /*public void click (View vista){
        edname = findViewById(R.id.et_name);
        String nombre = String.valueOf(edname.getText());
        Toast.makeText(this, "Hola "+nombre, Toast.LENGTH_SHORT).show();
    }*/
}