package com.example.unite5_gelismiskomutlar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class elektiriklicihaz1 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.elektiriklicihaz);
        Button btnhesapla = findViewById(R.id.btnHesapla);
        btnhesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText txtcihazadi = findViewById(R.id.txtcihazadi);
                EditText txtkw = findViewById(R.id.txtkw);
                EditText txtsaat = findViewById(R.id.txtsaat);
                TextView textViewsonuc = findViewById(R.id.textViewsonuc);
                String cihazadi = txtcihazadi.getText().toString();
                int kw = Integer.parseInt(txtsaat.getText().toString());
                int saat = Integer.parseInt(txtkw.getText().toString());
                ElektirikliCihaz cihaz1 = new ElektirikliCihaz();
                cihaz1.cihazadi = cihazadi;
                cihaz1.cihazkw = kw;
                cihaz1.gksaat = saat;
                int sonuc = cihaz1.aylikTuketim();
                textViewsonuc.setText(Integer.toString(sonuc));
            }
        });
    }
}
