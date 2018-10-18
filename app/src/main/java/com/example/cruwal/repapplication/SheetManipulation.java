package com.example.cruwal.repapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.*;
import com.google.common.collect.Lists;

public class SheetManipulation extends AppCompatActivity {

    private Sheets service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sheet_manipulation);

        //service = new Sheets();

        //ValueRange result = service.spreadsheets().values().get(spreadsheetId, range).execute();
        //int numRows = result.getValues() != null ? result.getValues().size() : 0;
        //System.out.printf("%d rows retrieved.", numRows);
    }
}
