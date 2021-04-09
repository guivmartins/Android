package com.avaliacao.n1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ExibeActivity extends AppCompatActivity {

    private EditText resultadonome;
    private EditText resultadomedia;
    private EditText resultadofinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibe);

        Intent intent = getIntent();
        String nomeValue = intent.getStringExtra("nome");
        String nota1Value = intent.getStringExtra("nota1");
        String nota2Value = intent.getStringExtra("nota2");

        int resultadoValue = (Integer.parseInt(nota1Value) + Integer.parseInt(nota2Value)) / 2;
        String resFinal = " ";
        if (resultadoValue >= 50){
            resFinal = "Aprovado";
        } else {
            resFinal = "Reprovado";
        }
        resultadonome = findViewById(R.id.resultadonome);
        resultadonome.setText(String.valueOf("Aluno:"+" "+nomeValue),TextView.BufferType.EDITABLE);

        resultadomedia = findViewById(R.id.resultadomedia);
        resultadomedia.setText(String.valueOf("Media:"+" "+resultadoValue),TextView.BufferType.EDITABLE);

        resultadofinal = findViewById(R.id.resultadofinal);
        resultadofinal.setText(String.valueOf("Situação:"+" "+resFinal),TextView.BufferType.EDITABLE);

    }
}