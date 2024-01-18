package com.joincoded.adapter.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.joincoded.adapter.Data.CurrencyData;

import java.util.ArrayList;

public class CurrencyAdapter extends RecyclerView.Adapter<CurrencyAdapter.CurrencyViewHolder> { // the main and adaptor class was deleted
    ArrayList<CurrencyData> currency;

    public CurrencyAdapter(ArrayList<CurrencyData>currency){
        this.currency=currency;
    }


    @NonNull
    @Override
    public CurrencyAdapter.CurrencyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.currency_list,parent,false
        );
        return new CurrencyDataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CurrencyAdapter.CurrencyViewHolder holder, int position) {
    CurrencyData currencyData = currency.get(position);

    holder.currencyRecyclerView.setText(CurrencyData.getName());
    holder.exchangeRate.setText(String.valueOf(CurrencyData.getexchangeRate());
    holder.code.setText(CurrencyData.getcode());
    }

    @Override
    public int getItemCount() {
        return currency.size();
    }
    public static class CurrencyViewHolder extends RecyclerView.ViewHolder{

        TextView nametextView,amountTextView,currencyTextView;


        public CurrencyViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        nameTextView= itemView.findViewById(R.id.nametextView);
        amountTextView = itemView.findViewById(R.id.exchangeRate);
        currencyTextView = itemView.findViewById(R.id.code);
    }
}
