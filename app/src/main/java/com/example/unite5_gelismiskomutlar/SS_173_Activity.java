package com.example.unite5_gelismiskomutlar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SS_173_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ss_173_activity);
        EditText txt1 = findViewById(R.id.txt1);
        EditText txt2 = findViewById(R.id.txt2);
        Button btn1 = findViewById(R.id.mrb1);
        Button btn2 = findViewById(R.id.mrb2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ad = txt1.getText().toString();
                Toast.makeText(SS_173_Activity.this,"Merhaba"+adsoyad(ad),Toast.LENGTH_SHORT).show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String adSoyad = txt1.getText().toString() + " " + txt2.getText().toString();
                Toast.makeText(SS_173_Activity.this,"İyi Günler Gardaş"+adsoyad(adSoyad),Toast.LENGTH_SHORT).show();
            }
        });
    }
    private String adsoyad(String txt1,String txt2){
        return txt1 + " " +txt2;


    }

    private String adsoyad(String txt1) {
        return txt1;
    }

}
