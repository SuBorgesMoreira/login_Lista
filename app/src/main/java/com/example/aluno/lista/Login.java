package com.example.aluno.lista;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends Activity {
    private EditText login;
    private EditText pass;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = findViewById(R.id.usuario);
        pass = findViewById(R.id.senha);
        btn = findViewById(R.id.botao);

        /*btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt = login.getText().toString();
                String pas = pass.getText().toString();
            }
        });*/
    }
        public void cadastro(View view){
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
        }
        public void listas(View view){
            String txt = login.getText().toString();
            String pas = pass.getText().toString();
            startActivity(new Intent(getApplicationContext(), lista.class));
        }
    }
