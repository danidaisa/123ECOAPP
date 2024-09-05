package com.itb.a123ecoapp;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class HomeActivity extends AppCompatActivity {

    ImageView icNovos, icCupons, icPesquisar, icFavoritos, icConta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);


        icCupons = findViewById(R.id.ic_promocoes);
        icPesquisar = findViewById(R.id.ic_pesquisar);
        icFavoritos = findViewById(R.id.ic_favoritos);

        icCupons.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, Cupons.class);
            startActivity(intent);
            overridePendingTransition(0, 0);
        });

        icPesquisar.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, Pesquisar.class);
            startActivity(intent);
            overridePendingTransition(0, 0);
        });

        icConta.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, Conta.class);
            startActivity(intent);
            overridePendingTransition(0, 0);
        });
    }
}