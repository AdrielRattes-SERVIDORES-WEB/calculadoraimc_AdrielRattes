package com.example.calculadoraimc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText peso = findViewById(R.id.edt_peso);
        EditText altura = findViewById(R.id.edt_altura);
        TextView resultado = findViewById(R.id.txt_resultado);
        Button calcular = findViewById(R.id.btn_calcular);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float p = Float.parseFloat(peso.getText().toString());
                float a = Float.parseFloat(altura.getText().toString());
                float imc = p / (a * a);

                String classificacao;
                if (imc < 18.5) {
                    classificacao = "Baixo peso";
                } else if (imc < 25) {
                    classificacao = "Peso Normal";
                } else if (imc < 30) {
                    classificacao = "Sobrepeso";
                } else if (imc < 35) {
                    classificacao = "Obesidade grau I";
                } else if (imc < 40) {
                    classificacao = "Obesidade grau II";
                } else {
                    classificacao = "Obesidade grau III";
                }

                resultado.setText("IMC = " + imc + "\nClassificação: " + classificacao);
            }
        });
    }
}
