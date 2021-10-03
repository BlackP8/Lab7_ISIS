package com.example.edu5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int count = 0;
    Spinner spinner;
    ArrayList spinnerArrayList;
    ArrayAdapter spinnerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);

        spinnerArrayList = new ArrayList();
        spinnerArrayList.add("Guitar");
        spinnerArrayList.add("Drum set");
        spinnerArrayList.add("Electric guitar");
        spinnerArrayList.add("Piano");
        spinnerArrayList.add("Bass guitar");

        //Context - активити, Элемент спиннера, лист элементов
        spinnerAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, spinnerArrayList);

        //Указываем компонент, на котором хотим реализовать выпадающий список
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //Задаем адаптер для спиннера
        spinner.setAdapter(spinnerAdapter);
    }

    public void increaseQuantity(View view) {
        TextView quantityCount = findViewById(R.id.quantityCount);
        quantityCount.setText(String.valueOf(++count));
    }

    public void decreaseQuantity(View view) {
        count = count - 1;
        if (count < 0) {
            count = 0;
        }
        TextView quantityCount = findViewById(R.id.quantityCount);
        quantityCount.setText(String.valueOf(count));
    }
}