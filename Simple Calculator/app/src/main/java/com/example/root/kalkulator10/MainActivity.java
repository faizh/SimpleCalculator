package com.example.root.kalkulator10;

import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText etpanjang;
    private EditText etlebar;
    private EditText ethasil;
    private Button bthasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etpanjang = (EditText) findViewById(R.id.et_panjang);
        etlebar = (EditText) findViewById(R.id.et_lebar);
        ethasil = (EditText) findViewById(R.id.et_hasil);
        bthasil = (Button) findViewById(R.id.btn_hitung);

        bthasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int panjang = Integer.parseInt(etpanjang.getText().toString());
                int lebar = Integer.parseInt(etlebar.getText().toString());
                int luas = panjang * lebar;
                ethasil.setText(luas+"");
            }
        });
    }
}
