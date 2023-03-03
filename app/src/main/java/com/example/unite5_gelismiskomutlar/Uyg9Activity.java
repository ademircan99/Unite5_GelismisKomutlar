package com.example.unite5_gelismiskomutlar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg9Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg9_activity);
        EditText editTextuzunluk = findViewById(R.id.editTextuzunluk);
        Button btnucgen = findViewById(R.id.btnucgen);
        Button btnkare = findViewById(R.id.btnkare);
        TextView textViewCevre = findViewById(R.id.textViewCevre);
        btnkare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer Uzunluk = Integer.parseInt(editTextuzunluk.getText().toString());
                Kare Kare = new Kare (Uzunluk);
                Integer cevre = Kare.cevre();
                textViewCevre.setText(cevre.toString());
            }
        });
            btnucgen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Integer Uzunluk = Integer.parseInt(editTextuzunluk.getText().toString());
                    Ucgen Ucgen = new Ucgen(Uzunluk);
                    Integer cevre = Ucgen.cevre();
                    textViewCevre.setText(cevre.toString());
                }
            });
    }
}
