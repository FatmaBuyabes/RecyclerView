package com.joincoded.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

import com.joincoded.adapter.Adapter.CurrencyAdapter;
import com.joincoded.adapter.Data.CurrencyData;
import com.joincoded.adapter.Repo.CurrencyRepo;
import com.joincoded.recyclerview.adapter.currencyAdapter;
import com.joincoded.recyclerview.data.CurrencyData;

public class MainActivity extends AppCompatActivity {

    RecyclerView currencyRecyclerView;
    TextView amountText;

    ArrayList<CurrencyData> currencies;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        currencies = CurrencyRepo.getInstance().generateDummyBankAccounts(10);


        currencyRecyclerView = findViewById(R.id.currencyRecyclerView);
        //addCurrencies();

        currencyRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        CurrencyAdapter currencyAdapter = new CurrencyAdapter(currencies);
        currencyRecyclerView.setAdapter(currencyAdapter);

        addAmount();


    }

    private void addAmount(){  //better to seperate it

        currencies.add( new CurrencyData("Kuwaiti Dinar"," KWD",1.0));
        currencies.add(new CurrencyData("United State Dollar"," USD",0.31));
        currencies.add(new CurrencyData("Euro"," Eu",2.98));
    }
}








