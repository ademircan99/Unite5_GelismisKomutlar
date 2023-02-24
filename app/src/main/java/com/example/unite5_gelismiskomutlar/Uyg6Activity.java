package com.example.unite5_gelismiskomutlar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg6_activity);
        EditText editTextKisaKenar = findViewById(R.id.editTextKisaKenar);
        EditText editTextUzunKenar = findViewById(R.id.editTextUzunKenar);
        Button btnkarealan = findViewById(R.id.btnkarealan);
        Button btndikdörtgenalan = findViewById(R.id.btndikdörtgenalan);
        TextView textViewalan = findViewById(R.id.textViewalan);

        btnkarealan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer kenar;
                Integer alan;
                kenar = Integer.parseInt(editTextKisaKenar.getText().toString());
                Dortgen kare = new Dortgen(kenar);
                alan = kare.alanBul();
                textViewalan.setText(alan.toString());
            }
        });
        btndikdörtgenalan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer kisaKenar;
                Integer uzunKenar;
                Integer alan;
                kisaKenar = Integer.parseInt(editTextKisaKenar.getText().toString());
                uzunKenar = Integer.parseInt(editTextUzunKenar.getText().toString());
                Dortgen dikdortgen = new Dortgen(kisaKenar,uzunKenar);
                alan = dikdortgen.alanBul();
                textViewalan.setText(alan.toString());
            }
        });
    }
}
