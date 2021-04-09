package com.avaliacao.n1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botaoSalvar = (Button) findViewById(R.id.formulario_salvar);

        nome = findViewById(R.id.formulario_nome);
        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nomeValue = nome.getText().toString();

                Intent intentn1 = new Intent(MainActivity.this, NotasActivity.class);

                intentn1.putExtra("nome", nomeValue);


                startActivity(intentn1);
            }
        });

    }}