
package com.example.practica2sandraramirez;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView nameUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle valores = getIntent().getExtras();
        String user = valores.getString("usuario");

        nameUser = findViewById(R.id.tvuser);
        nameUser.setText(user);

    }
}