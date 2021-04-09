package com.avaliacao.n1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NotasActivity extends AppCompatActivity {

    private EditText nota1;
    private EditText nota2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notas);

        Button botaoSalvar = (Button) findViewById(R.id.formulario_salvar_nota);

        nota1 = findViewById(R.id.formulario_nota1);
        nota2 = findViewById(R.id.formulario_nota2);

        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nota1Value = nota1.getText().toString();
                String nota2Value = nota2.getText().toString();

                Intent intent = getIntent();
                String nomeValue = intent.getStringExtra("nome");

                Intent intentnota = new Intent(NotasActivity.this, ExibeActivity.class);

                intentnota.putExtra("nome", nomeValue);
                intentnota.putExtra("nota1", nota1Value);
                intentnota.putExtra("nota2", nota2Value);


                startActivity(intentnota);
            }
        });
    }
}