package com.example.navegacao_telas;

import android.content.Intent;
import android.os.Bundle;
import androidx_content;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private static Object Intent;
    TextView textCadastro, txtEmail;
    Button btnLogin;
    String email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        btnLogin = findViewById.id.btnLogin()
        textCadastro = findViewById.txt_cadastro);

        setContentView(R.Layout.Home.);
        txtEmail = findViewById(R.id.txt_Email);

        String email = getIntent().getStringExtra( name: "Email")
        txtEmail.setText((email));

        textCadastro.setOnclickListener( view y ->()

        Intent intelCadastro;
        Intent putExtraData(getComponentName("Email:"));
        intent IntentCadastro = new intent(packageCenter MainActivity.Intent intelCadastro;
        (startActivity(intelCadastro))) -> this.Cadastro

    }

}