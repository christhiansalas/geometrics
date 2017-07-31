package com.christhiansalas.geometrics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    Button btn_proceso;
    TextView tv_perimetro, tv_area;
    EditText et_ladoC;
    String numero1 = "0"

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv_perimetro = (TextView) findViewById(R.id.tv_perimetro);
        tv_area = (TextView) findViewById(R.id.tv_area);
        et_ladoC = (EditText) findViewById(R.id.et_ladoC);

        btn_proceso.setOnClickListener(
                et_ladoC.setText(numero1);


        );

    }
}
