package com.example.cruwal.repapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Iterator;

//Activity com checkBoxes pra escolher para quais moradores deve ser distribuido o valor
public class quemPagouActivity extends AppCompatActivity {

    //Array com os nomes dos moradores selecionados
    ArrayList<String> nomes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quem_pagou);
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
        //TextView onde a lista será exibida
        TextView tv = findViewById(R.id.testTV);

        StringBuilder sb = new StringBuilder();

        for(String s : nomes){
            sb.append(s);
            //Nomes separados por ';'
            sb.append(";");
        }
        tv.setText(sb.toString());
    }
}
