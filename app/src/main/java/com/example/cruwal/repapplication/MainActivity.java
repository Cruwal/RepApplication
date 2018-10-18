package com.example.cruwal.repapplication;

import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        EditText et = findViewById(R.id.quem_pagou_ET);
        et.setText(intent.getStringExtra("account"));

    }

    public void showDatePickerDialog(View v) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }

    public void setDate(String date){
        TextView dateTV = findViewById(R.id.quando_data_TV);

        dateTV.setText(date);
    }

    public void quemPagouActivity(View view) {
        Intent intent = new Intent(this, quaisPagaraoActivity.class);
        EditText quemPagou, quanto, oQue;
        TextView quando;

        quemPagou = findViewById(R.id.quem_pagou_ET);
        quanto = findViewById(R.id.quanto_ET);
        oQue = findViewById(R.id.o_que_ET);
        quando = findViewById(R.id.quando_data_TV);

        intent.putExtra("quem", quemPagou.getText().toString());
        intent.putExtra("quanto", quanto.getText().toString());
        intent.putExtra("oque", oQue.getText().toString());
        intent.putExtra("quando", quando.getText().toString());

        startActivity(intent);
    }
}
