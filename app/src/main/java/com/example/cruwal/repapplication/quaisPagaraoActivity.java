package com.example.cruwal.repapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Iterator;

//Activity com checkBoxes pra escolher para quais moradores deve ser distribuido o valor
public class quaisPagaraoActivity extends AppCompatActivity {

    //Array com os nomes dos moradores selecionados
    ArrayList<String> nomes = new ArrayList<>();
    //TextView onde a lista será exibida
    TextView tv;

    StringBuilder sb = new StringBuilder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quem_pagou);

        String quem, oque, quanto, quando;
        TextView quemTV, oqueTV, quantoTV, quandoTV;

        tv = findViewById(R.id.testTV);
        Intent intent = getIntent();

        quem = intent.getStringExtra("quem");
        quanto = intent.getStringExtra("quanto");
        oque = intent.getStringExtra("oque");
        quando = intent.getStringExtra("quando");

        quemTV = findViewById(R.id.quem_pagou_TV);
        oqueTV = findViewById(R.id.o_que_TV);
        quantoTV = findViewById(R.id.quanto_TV);
        quandoTV = findViewById(R.id.quando_data_TV_aqp);

        quemTV.setText(quem);
        oqueTV.setText(oque);
        quandoTV.setText(quando);
        quantoTV.setText(quanto);

    }

    public void onCheckBoxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        //Pegando o nome do morador
        String s = ((CheckBox) view).getText().toString();
        if(checked)
            //Adiciona o nome do marador na lista
            nomes.add(s);
        else
            //Remove o nome do morador da lista
            nomes.remove(s);
    }

    //Funcao que mostra como a lista de nomes está em dado momento
    public void showArray(View view) {





        for(String s : nomes){
            sb.append(s);
            //Nomes separados por ';'
            sb.append(";");
        }
        tv.setText(sb.toString());
    }
}
