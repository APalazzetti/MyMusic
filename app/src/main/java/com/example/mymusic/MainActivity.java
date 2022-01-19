package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;


public class MainActivity extends AppCompatActivity {
    Button btnInserisci, btnMostra;
    Spinner spnGenere;
    EditText txtTitolo, txtDurata, txtAutore;
    GestoreBrani gb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnInserisci= (Button)findViewById(R.id.btnInserisci);
        btnMostra= (Button)findViewById(R.id.btnMostra);
        txtTitolo=(EditText)findViewById(R.id.txtTitolo);
        txtDurata=(EditText)findViewById(R.id.txtDurata);
        txtAutore=(EditText)findViewById(R.id.txtAutore);
        spnGenere=(Spinner)findViewById(R.id.genere);

        gb=new GestoreBrani();

        btnInserisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gb.addBrano(new Brano(txtTitolo.getText().toString(),
                spnGenere.getSelectedItem().toString(), txtAutore.getText().toString(),
                        txtDurata.getText().toString()));
            }

        });

        btnMostra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}
