package com.example.active;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity2 extends AppCompatActivity{

    private Button tela2;
    public TextInputEditText criarEmail;
    public TextInputEditText criarSenha;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tela2 = findViewById(R.id.SesaoLoguin);
        criarEmail = findViewById(R.id.criarEmail);
        criarSenha = findViewById(R.id.criarSenha);

        tela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (criarEmail.getText().toString().equals("") || criarSenha.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "Complete todos os campos", Toast.LENGTH_SHORT).show();
                }else {
                    finish();
                }
            }
        });
    }
}