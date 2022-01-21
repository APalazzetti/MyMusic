package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;


public class MainActivity extends AppCompatActivity {
    Button btnInserisci, btnMostra;
    Spinner spnGenere;
    EditText txtTitolo, txtDurata, txtAutore;
    GestoreBrani gb;
    ArrayAdapter<String> a;
    String[] generi ={"Pop","Trap","Rap","Drill"};
    Brano b ;
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
        a= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,generi);

        spnGenere.setAdapter(a);

        gb=new GestoreBrani();



        btnInserisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=new Brano();
                b.setTitolo(txtTitolo.getText().toString());
                b.setAutore(txtAutore.getText().toString());
                b.setDurata(txtDurata.getText().toString());
                b.setGenere(spnGenere.getSelectedItem().toString());
                gb.addBrano(b);
            }

        });

        btnMostra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String lista = gb.listaBran();
                Intent in = new Intent(getApplicationContext(), MainActivity2.class);
                in.putExtra("musica",lista);
                startActivity(in);

            }
        });

    }

}
