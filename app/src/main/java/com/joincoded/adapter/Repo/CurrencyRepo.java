package com.joincoded.adapter.Repo;

import com.joincoded.adapter.Data.CurrencyData;

import java.util.ArrayList;

public class CurrencyRepo {
    private static CurrencyRepo instance;


    private CurrencyRepo(){};


    public static CurrencyRepo getInstance() {
        if (instance == null) {
            instance = new CurrencyRepo();


        }
        return instance;

    }
        public ArrayList<CurrencyData> generateDummyBankAccounts(int numberOfItems){
            ArrayList<CurrencyData> currenies = new ArrayList<>();
            for (int i=0; i<numberOfItems; i++){
                CurrencyData currency = new CurrencyData("saving","KWD",100.0);
                currenies.add(currency);
            }
            return currenies;
        }


}
