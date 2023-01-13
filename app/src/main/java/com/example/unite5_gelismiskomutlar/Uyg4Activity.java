package com.example.unite5_gelismiskomutlar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg4Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.uyg4_activity);
        Button btn2Topla = findViewById(R.id.btn2Topla);
        Button btn3Topla = findViewById(R.id.btn3Topla);
        EditText txtSayi1 = findViewById(R.id.txtSayi1);
        EditText txtSayi2 = findViewById(R.id.txtSayi2);
        EditText txtSayi3 = findViewById(R.id.txtSayi3);
        TextView textView = findViewById(R.id.textView);

        btn2Topla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1 = Integer.parseInt(txtSayi1.getText().toString());
                int sayi2 = Integer.parseInt(txtSayi2.getText().toString());
                int sonuc = topla(sayi1, sayi2);
                textView.setText("sonuç = "+sonuc);
            }
        });
        btn3Topla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1 = Integer.parseInt(txtSayi1.getText().toString());
                int sayi2 = Integer.parseInt(txtSayi2.getText().toString());
                int sayi3 = Integer.parseInt(txtSayi3.getText().toString());
                int sonuc = topla(sayi1, sayi2, sayi3);
                textView.setText("sonuç = "+sonuc);
            }
        });



    }
    private int topla(int sayi1, int sayi2, int sayi3){
        return sayi1 + sayi2 + sayi3;
    }

    private int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

}
