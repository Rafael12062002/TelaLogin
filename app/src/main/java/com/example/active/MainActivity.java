package com.example.active;

import static com.example.active.R.layout.activity_main;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private Button tela1 ;
    private Button telaConta;
    private TextInputEditText editEmail;
    private TextInputEditText editSenha;
    private String email, senha;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);

        tela1 = findViewById(R.id.SecaoCriarConta);
        telaConta = findViewById(R.id.EntrarConta);
        editEmail = findViewById(R.id.email);
        editSenha = findViewById(R.id.senha);

        MainActivity2 mainActivity2 = new MainActivity2();

        telaConta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editEmail.getText().toString().equals("") || editSenha.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "Por favor digite todos os campos", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(getApplicationContext(), MainActivity3.class);
                    startActivity(intent);
                }
            }
        });

        tela1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);

                startActivity(intent);
            }
        });

    }

}