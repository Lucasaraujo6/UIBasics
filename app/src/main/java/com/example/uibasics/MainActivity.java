package com.example.uibasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText edtTextHello;
    private TextView txtWelcome;

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnHello:
                Toast.makeText(this, "Welcome to my application", Toast.LENGTH_SHORT).show();
                txtWelcome.setText("Welcome "+edtTextHello.getText().toString());
                break;
            default:
                break;
        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHello = findViewById(R.id.btnHello);
        edtTextHello = findViewById(R.id.edtTxtHello);
        txtWelcome = findViewById(R.id.txtWelcome);
        btnHello.setOnClickListener(this);

        btnHello.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this, "Stooop!!! It hurts.", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

    }



}