package com.christhiansalas.geometrics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cuadrado(View view){

        Intent intent =new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);

    }

    public void triangulo(View view){

        Intent intent =new Intent(MainActivity.this, Main3Activity.class);
        startActivity(intent);

    }

    public void circulo(View view){

        Intent intent =new Intent(MainActivity.this, Main4Activity.class);
        startActivity(intent);

    }

    public void poligono(View view){

        Intent intent =new Intent(MainActivity.this, Main5Activity.class);
        startActivity(intent);

    }




}
