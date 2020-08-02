package br.com.nucleosti.tupicionario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvBichos = (TextView) findViewById(R.id.tvBichos);
        tvBichos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, BichosActivity.class);
                startActivity(i);
            }
        });

        TextView tvCulinaria = (TextView) findViewById(R.id.tvCulinaria);
        tvCulinaria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, CulinariaActivity.class);
                startActivity(i);
            }
        });

        TextView tvPlantas = (TextView) findViewById(R.id.tvPlantas);
        tvPlantas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, PlantasActivity.class);
                startActivity(i);
            }
        });

        TextView tvPovosNativos = (TextView) findViewById(R.id.tvPovosNativos);
        tvPovosNativos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, PovosNativosActivity.class);
                startActivity(i);

            }
        });
    }
}