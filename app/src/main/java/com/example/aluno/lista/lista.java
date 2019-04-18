package com.example.aluno.lista;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class lista extends Activity {

    private ListView listaItens;
        private String[] itens = {
                "Primeira Linha",
                "Segunda Linha",
                "Terceira Linha",
                "Quarta Linha",
                "Quinta Linha",
                "Sexta Linha"
        };

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_lista);

            listaItens = findViewById(R.id.lista);

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                    getApplicationContext(),
                    android.R.layout.simple_list_item_1,
                    android.R.id.text1,
                    itens
            );

            listaItens.setAdapter(adapter);
        }
}
